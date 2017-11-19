require 'rest-client'

headers =
{
  'User-Agent': 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_12_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/61.0.3163.100 Safari/537.36'
}
response = RestClient.get('http://tool.chinaz.com/Tools/jsformat.aspx', headers = headers)
body = response.xpath('/html/body')
puts body
