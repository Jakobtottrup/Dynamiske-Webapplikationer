// DEFINE A GLOBAL FUNCTION
require('./foo.js');
foo(1);

// EXPORT/REQUIRE AN ANONYMOUS FUNCTION
var bar = require('./bar.js');
bar(2);

var x = bar(5); 
console.assert(x==500,'bar function not working');
console.log( '5 * 100 is ' + x );