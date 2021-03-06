	
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
		
		var cityNames =  [];
		var values =  [];
		Object.keys(data).sort().forEach(function(key,index) {
			$("#weather").append('<li>'+key+': '+ data[key] + ' &deg;C</li>');
			cityNames.push( key );
			values.push( data[key] );
		});
		
		console.log( cityNames , values );
		
		var myChart = new Chart( $('#myChart')[0] , {
			type: 'bar',
			data: {
				labels: cityNames,
				datasets: [{
					label: 'temperatures now',
					data: values,
					backgroundColor: 'rgba(255, 99, 132, 1.0)',
					borderColor: 'rgba(255,99,132,1)',
					borderWidth: 1
				}]
			},
			options: {
				maintainAspectRatio: false,
				scales: {
					yAxes: [{
						ticks: {
							beginAtZero:true
						}
					}]
				}
			}
		});

		var myChart2 = new Chart($('#myChart2')[0], {
		  type: 'radar',
          data: {
		      labels: cities,
              datasets: [{
		          label: 'temps now',
                  data: values
              }]
          },
            options:{

            }


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


