
$(document).ready(function(){

	$( "#myform" ).submit(function( event ) {
		event.preventDefault();
		var text = $( this ).serialize();
		console.log( 'saved this string ' + text );
		
		var slots = Object.keys(localStorage);
		var slotName = prompt('Available slots are: ' + slots + '.'+ 
				'\nName the slot you want to save to:');
		localStorage.setItem(slotName, text );
	});
	
	$( "#load" ).click(function( event ) {
		event.preventDefault();
		var slots = Object.keys(localStorage);
		var slotName = prompt('Available slots are: ' + slots + '.'+ 
		                      'Name the slot you want to load from:');
		if (slotName==null) return;
		var serializedString = localStorage.getItem(slotName);
		if (serializedString){
			console.log( 'loaded back this string ' +  serializedString );
			// reset form values from json object
			$( "#myform" ).deserialize(serializedString);
		} else {
			alert('Error: no slot with name **' + slotName + '** found!');
		}
	});
	
});