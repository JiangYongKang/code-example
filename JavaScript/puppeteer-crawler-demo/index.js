const puppeteer = require('puppeteer');

const properties = [
{"host": "http://www.x23us.com", "title": "#amain > dl > dd:nth-child(2) > h1", "content": "#contents", "author": null},
{"host": "", "title": "", "content": "", "author": ""},
{"host": "", "title": "", "content": "", "author": ""},
];

puppeteer.launch({
  headless: false,
  executablePath: "/Applications/Chromium.app/Contents/MacOS/Chromium"
}).then(async browser => {
  const page = await browser.newPage();
  await page.goto('http://www.x23us.com/html/64/64889/');

  const links = await page.evaluate(() => {
    const elements = Array.from(document.querySelectorAll('#at > tbody > tr > td > a'));
    return elements.map(a => a.href);
  });

  const subpage = await browser.newPage();
  for (var i = 0; i < links.length; i++) {
    await subpage.goto(links[i]);
    const content = await subpage.evaluate(() => {
      const elements = document.querySelector('#contents');
      return elements.innerText;
    });
    console.log("content " + content);
  }
  await subpage.close();

  await page.close();
  await browser.close();
}).catch(err => {
  console.log(err);
});
