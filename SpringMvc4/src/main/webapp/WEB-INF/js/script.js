/**
 * 
 */
 
 $(function(){
 	$("#myimg").attr("src","../image/1.png");
	
	$("#myimg").hover(function(){
		$(this).attr("src", "../image/2.jpg");
		}, function(){
			$(this).attr("src", "../image/1.png");
		});

 });