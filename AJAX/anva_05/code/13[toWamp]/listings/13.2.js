$(document).ready(function() {
  var $ajaxForm = $('#ajax-form'),
      $response = $('#response');

  $ajaxForm.on('submit', function(event) {
    event.preventDefault();

	// try with  andrea270872  as input in the ajaxform
	// then with  andrea270872xxxx as input in the ajaxform -> returns error object
    $.ajax({
      url: 'https://api.github.com/users/'+ $('#name').val() ,
      dataType: 'jsonp',
      success: function(data) {
        console.log(data);
      }
    });
  });
});
