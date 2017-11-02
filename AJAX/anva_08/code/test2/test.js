var assert = require('assert');

var pigLatin = require('./html/js/pigLatin_v3_refactored.js');
console.log( pigLatin.englishToPigLatin );

describe('testGroup1', function() {
	it('should return "igpay"' , function(){
			assert.equal( 'igpay' , pigLatin.englishToPigLatin('pig') );
	});
});

