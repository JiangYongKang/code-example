let http = require('http');

http.createServer(function (request, response) {
    response.writeHead(200, {'Content-Type': 'text/plain'});
    response.end('server 3001');
}).listen(3001);

console.log('Server running at http://127.0.0.1:3001/');