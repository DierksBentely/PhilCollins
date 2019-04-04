// the comments were added for clear dividers for which question is which

"use strict"
$( document ).ready(function() {

// question 1---------------------------------------------------------------------------
$("body #q1").click(function(ev)
{
	$('#q1').hide();
});
//--------------------------------------------------------------------------------------

// question 2---------------------------------------------------------------------------
var $toggle = false;
$('body #q2').click(function()
{
	if ($toggle == false)
	{
		$('#q2 ul li').css('backgroundColor','yellow')
		$toggle = true
	}
	else
	{
		$('#q2 ul li').css('backgroundColor','white')
		$toggle = false;
	}
});
//--------------------------------------------------------------------------------------
	
// question 3---------------------------------------------------------------------------
$('body #q3').click(function()
{
	$('#q3').dblclick(function(ev)
	{
		$('#q3 p').css('backgroundColor','blue');
	})
	$('#q3 p').css('backgroundColor','red');
});
//--------------------------------------------------------------------------------------

// question 4---------------------------------------------------------------------------
$('body #q4').keydown(function(ev)
{
	var $key = ev.which;
	var $key = String.fromCharCode($key).toLowerCase();
	$('#q4 p').append($key);
});
//--------------------------------------------------------------------------------------

// question 5---------------------------------------------------------------------------
$('body #q5 button').click(function(ev)
{	
	var $width= document.getElementById('width').value;
	var $height = document.getElementById('height').value;

	$('#q5 div').height($height);
	$('#q5 div').width($width);
});
//--------------------------------------------------------------------------------------

// question 6---------------------------------------------------------------------------
$('body #q6 button').click(function()
{
	$('#q6 img').fadeToggle();
});
//--------------------------------------------------------------------------------------

// question 7---------------------------------------------------------------------------
$("#q7").on("click", "li", function(ev)
{
	$(this).after("<li> new item, that wasn't there before </li>");
});
//--------------------------------------------------------------------------------------
	
// question 8---------------------------------------------------------------------------
var $first = true;
$('body #q8 div').click(function()
{
	if($first == true)
	{
		$('#q8 div').hide(2000).delay(1000).show(2000)
	}
	else
	{
		$('#q8 div').slideUp(3000).delay(1000).slideDown(3000);
	}	
	$first = false;
	
});
//--------------------------------------------------------------------------------------
});
