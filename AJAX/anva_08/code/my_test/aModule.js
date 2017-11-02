
/* 
   Returns 50% of the times the double of n, 
   otherwise it returns 0
*/   
function doubleOrNothing(n){
	if (Math.random()<0.5){
		return 2*n;
	}
	return 0;
}




// A very cool trick: if we're running under Node...
if(typeof exports !== 'undefined') {
    exports.doubleOrNothing = doubleOrNothing;
}