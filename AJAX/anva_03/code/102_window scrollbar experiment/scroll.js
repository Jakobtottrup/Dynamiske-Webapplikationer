  var $window = $(window);
  
  function checkScrollPosition() {
	var wHeight = $(window).height();
	var scrollTop = $(window).scrollTop();
	var contentHeight = $("#container").height();
	
	// barHeight : wHeight = wHeight : contentHeight
	var barHeight = parseInt(wHeight*wHeight / contentHeight);

    console.log("scrolling top "+ scrollTop + " out of "+ wHeight );
    console.log("scrolling bottom "+ (barHeight+scrollTop) + " (circa)");
	console.log("view: from "+ parseInt(scrollTop*100/wHeight) + " % of the contents");
	console.log("view: to   "+ parseInt((barHeight+scrollTop)*100/wHeight) + " % of the contents");
	
	if ( (scrollTop+wHeight) >= contentHeight ){
		console.log("at the bottom!");
    }
  }

  $(document).ready(function() {  
    $window.scroll(checkScrollPosition).scroll();
  });