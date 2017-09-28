
$(document).ready(function() {

  $('<img id="movable" src="ball.png"/>')
	.css( { width: 200, 
	        height: 200, 
			top: 0,
			left: 100,
			position: "relative"
		} )
    .appendTo('#container');

	
  var endY = 500;
  
  $('#movable').click( function(event) {
    event.preventDefault();
	console.log("clicked!");
	 if (endY==500){
		endY = 0;
	 } else {
		endY = 500;
	 }
	 
    $(this).stop()
	.animate({
		top: endY,
	 	left: 100
	  }, 2000, function(){ 
	     console.log("done!");
	  });
	  
  });
  
});
