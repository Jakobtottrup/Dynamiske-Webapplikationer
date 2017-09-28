$(document).ready(function() {
  var $ajaxForm = $('#ajax-form'),
      $response = $('#response'),
      noresults = 'There were no search results.';

  var buildItem = function(item) {
    var output = '<ul>';

    output += '<li> name: ' + item.name + '</li>';
    output += '<li> biography: <div>' + item.bio + '</div></li>';
    output += '<li> public repositories: ' + item.public_repos + '</li>';
    output += '</ul>';

    return output;
  };

  var response = function(json) {
	var output = buildItem(json.data);
    $response.html(output);
  };

    $ajaxForm.on('submit', function(event) {
    event.preventDefault();

	// try with  andrea270872  as input in the ajaxform
	// then with  andrea270872xxxx as input in the ajaxform -> returns error object
    $.ajax({
      url: 'https://api.github.com/users/'+ $('#name').val() ,
      dataType: 'jsonp',
      success: response
    });
  });
});
