
/* linear interpolation
 * param: min  the value from which the interpolation starts
 * param: max  the value at which the interpolation stops
 * param: t    a value in range [0,1], that represents a cursor, going between min and max
 *
 * return: a value in range [min,max], when t is 0 -> min, when t is 1 -> max, 
 *         and interpolated values in between
 */
function linInt(min,max,t){
   return (1-t) * min + t * max;
}



$(document).ready(function() {
	var $movable = $('<div id="movable"></div>')
		.appendTo( '#container' );
	var style = {
		left: '100px',
		top:  '100px',
		height: '50px',
		width: '50px',
		'background-color': 'blue',
		position: 'absolute'
	  };
	$movable.css(style);

	// print 10 interpolated values between 10 and 50
	console.log( "print 10 interpolated values between 10 and 50 ... but what happens to the blue square?" );
	var numberOfSteps = 10;
	var step = 1.0 / numberOfSteps;
	for (var t=0.0;t<1.0;t+=step){
		$('#container').append( 
			$("<div></div>").append( "t="+t+"  -> " + linInt(10,50,t) ) 
		);
		$movable.css('left', linInt(10,50,t)  + 'px'); // moving the blue square
	}

	// -----------------------------------
	// TRY DE-COMMENTING THE FOLLOWING LINES

	// animate the movable div
	var numberOfSteps = 60;
	var step = 1.0 / numberOfSteps;
	var t = 0.0;
	function moveIt(){
		if (t<1.0){
			var x = linInt(100,600,t);
			t += step;
			$movable.css('left', x + 'px');
			// DEBUG console.log( x );
			setTimeout(moveIt,50); 
		}
	};
	moveIt();
	//----------------------------------- */

});
