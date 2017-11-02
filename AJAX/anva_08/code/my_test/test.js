const assert = require('assert');

describe('testing the array', function() {
	describe('test of indexOf()', function() {
		it('should return -1 when the value is not present',
			function(){
				assert.equal( -1 , [1,2,3].indexOf(4) );
		});
	});
}); 

describe('Math', function() {
	it('should return 9' , function(){
			assert.equal(3*3, 9 );
	});
	it('should return -8' , function(){
			assert.equal( (3-4)*8, -8 );
	});

    // EXERCISE
	it('should be doubleOrNothing(3) + doubleOrNothing(5) <= 2*(3+5)', function () {
		let a = m.doubleOrNothing(3);
		let b = m.doubleOrNothing(5);
		assert(a + b <= 16);
    });

});



// ******** testing an external module ****************
console.log( '************testing an external module************' );
var m = require('./aModule.js');

var a = 10; a = a*5; if (a==50){ console.log('aha!'); }

describe('doubleOrNothing of 5', function() {
	it('should return 10 or 0', function(){
		var t = m.doubleOrNothing(5);
			assert(
				(10 ===  t) ||
				( 0 ===  t)
			);
	});
});