
// **********************************************************
var DEBUG = true; // change this to show debugging info


var log = console.log;
var assert = console.assert;
if (!DEBUG){
	assert = log = function(){};
}
// **********************************************************


// Scrambles the names in the array, as many times as n .
function a(names,n){
	for (var i=0;i<n;i++){
		// select a random index
		var index = ~~( Math.random()*names.length );
		log( index , names.length);
		
		// scamble: cut in 2 parts...
		var middleIndex = ~~( Math.random()*names[index].length );
		// TESTING --- TRY SETTING left TO 'aaa' -> assertion fails -> errors!
		var left = names[index].substr(0,middleIndex);
		var right = names[index].substr(middleIndex);
		log( 'middleIndex = ' + middleIndex );
		log( left );
		log( right );
		assert( (left+right) == names[index], 'Something is wrong with your indexes');
		// ... then glue them back inverted
		names[index] = right+left;
	}
}

var data = ['apple','banana','cranberry'];
console.log( data );
a(data,5);
console.log( data );