/************************************************
  Table 1: Sorting by parsing cell contents.
************************************************/
$(document).ready(function() {
  var $table1 = $('#t-1');
  var $headers = $table1.find('thead th').slice(1);
  $headers
    .wrapInner('<a href="#"></a>')
    .addClass('sort');

  $headers.bind('click', function(event) {
    event.preventDefault();
    var column = $(this).index();
    var rows = $table1.find('tbody > tr').get();
	
	// ANVA: rows is an array, so we can use sort() method for javascript arrays
	//		-> see http://www.javascriptkit.com/javatutors/arraysort.shtml for more about sorting arrays
    rows.sort(function(a, b) {
      var keyA = $(a).children('td').eq(column).text();
      keyA = $.trim(keyA).toUpperCase();
      var keyB = $(b).children('td').eq(column).text();
      keyB = $.trim(keyB).toUpperCase();
      if (keyA < keyB) return -1;
      if (keyA > keyB) return 1;
      return 0;
    });

    $.each(rows, function(index, row) {
      $table1.children('tbody').append(row);
    });
	
   });
});
