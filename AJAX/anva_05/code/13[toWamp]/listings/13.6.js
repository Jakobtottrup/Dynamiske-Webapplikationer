$(document).ready(function() {
  var $ajaxForm = $('#ajax-form'),
      $response = $('#response'),
      noresults = 'There were no search results.',
      failed = 'Sorry, but the request could not ' +
        'reach its destination. Try again later.';

  var buildItem = function(item) {
    var output = '<ul>';

    output += '<li> name: ' + item.name + '</li>';
    output += '<li> biography: <div>' + item.bio + '</div></li>';
    output += '<li> public repositories: ' + item.public_repos + '</li>';
    output += '</ul>';

    return output;
  };

  var response = function(json) {
	console.log( json.data );
	var output = buildItem(json.data);
    $response.html(output);
  };

  $ajaxForm.on('submit', function(event) {
    event.preventDefault();

	// change timeout from 	  timeout: 15000
	// to                     timeout: 50 -> you should get timeout
	$.ajax({
	  url: 'https://api.github.com/users/'+ $('#name').val() ,
	  dataType: 'jsonp',
	  timeout: 15000,
	  success: response,
	  error: function() {
		$response.html(failed);
	  }
	});	
   });	
});
