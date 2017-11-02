var assert = require('assert');
describe('testing the array', function () {
    describe('test of indexOf()', function () {
        it('should return -1 when the value is not present',
            function () {
                assert.equal(-1, [1, 2, 3].indexOf(4));
            })
    })
});


describe('Test group: Math', function () {
    //TEST 1
    describe('Testing if math works by multiplication..', function () {
        it('should return 9',
            function () {
                assert.equal(9, 3 * 3);
            })
    });

    //TEST 2
    describe('Testing if BEDMAS works..', function () {
        it('should return -8',
            function () {
                assert.equal(-8, (3 - 4) * 8);
            });
    });
});