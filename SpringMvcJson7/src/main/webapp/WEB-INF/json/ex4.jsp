<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://fonts.googleapis.com/css2?family=Dongle&family=Gaegu:wght@700&family=Nanum+Pen+Script&family=Single+Day&display=swap"
	rel="stylesheet">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.7.0.js"></script>
<title>Insert title here</title>
</head>
<body>
	<h3 class="alert alert-success">ex4번 예제</h3>
	<br>
	<h4>메뉴명을 입력 후 엔터를 쳐주세요</h4>
	<input type="text" id="search" class="form-control"
		style="width: 150px">
	<br>
	<br>
	<h2 id="fname"></h2>
	<img alt="" src="" id="photo">

	<script>
	$("#search").keyup(function(e){
		
		if(e.keyCode == 13) { // enter는 13이다!
		
		var name = $(this).val();
		//alert(name)
	 	    
	        $.ajax({
	        	type:"get",
	        	dataType : "json",
				url : "list4",
				data:{"name": name},
				success:function(res){
					$("#fname").html(res.name);
					$("#photo").attr("src", "image/" + res.photo);
					$("#search").val('');
				}
	        });
	    }
	});
	</script>
</body>
</html>