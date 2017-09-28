$.fx.speeds._default = 250;

$.fx.speeds.zippy = 150;

$(document).ready(function() {
  $('#fx-toggle').show().bind('click', function() {
    $.fx.off = !$.fx.off;
  });

  function showDetails() {
    var $member = $(this);
    if ($member.hasClass('active')) {
      return;
    }

    $('div.member.active')
      .removeClass('active')
      .children('div').fadeOut();
    $member.addClass('active');

    $member.find('div').css({
      display: 'block',
      left: '-300px',
      top: 0
    }).each(function(index) {
      $(this).animate({
        left: 0,
        top: 25 * index
      }, {
        duration: 'slow', // 'zippy' 
        specialEasing: {
          top: 'easeInBounce' //'easeInQuart'
        }
      });
    });
  }

  $('div.member').bind('mouseenter mouseleave', function(event) {
    var size = event.type == 'mouseenter' ? 85 : 75;
    var padding = event.type == 'mouseenter' ? 0 : 5;
    $(this).find('img').stop().animate({
      width: size,
      height: size,
      paddingTop: padding,
      paddingLeft: padding
    });
  }).click(showDetails);
});
