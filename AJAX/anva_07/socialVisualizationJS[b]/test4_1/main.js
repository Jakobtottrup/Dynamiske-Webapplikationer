var $ = require('jquery');


global.jQuery = $; // to support the jquery plugins
var simpleWeather = require('simpleweather');

$(document).ready(function() {

	var cities = ['Austin, TX','sdfasfsadf','Odense, Denmark','Asti,Italy',
				'Buenos Aires, Argentina', 'Brussels, Belgium', 
				'Santiago, Chile', 'Prague, Czech Republic', 
				'Copenhagen, Denmark', 'Paris, France'];
	var data =  {};

	var _citiesRetrieved = 0;
	var _allDone = function(){
		console.log( 'complete set of data ' , data );
		$("#weather").html('');
		Object.keys(data).sort().forEach(function(key,index) {
			$("#weather").append('<li>'+key+': '+ data[key] + ' &deg;C</li>');
		});
	}
	$("#weather").html('computing...');
	for (var i=0;i<cities.length;i++){
		  $.simpleWeather({
			location: cities[i],
			woeid: '',
			unit: 'c',
			success: function(weather) {
			  // this.location   is the city name			  
			  data[this.location] = weather.temp;

			  _citiesRetrieved ++;
			  // DEBUG console.log( data , _citiesRetrieved);
			  
			  if ( _citiesRetrieved == cities.length){
				_allDone();
			  }
			},
			error: function(error) {
			  _citiesRetrieved ++;
			}
		  });
	}
	
});


