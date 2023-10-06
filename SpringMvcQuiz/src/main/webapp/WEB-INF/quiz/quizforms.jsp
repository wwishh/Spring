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

	<h2>메세지 전달</h2>

	<h2>get방식폼</h2>
	<form action="quiz1" method="get">
		이름: <input type="text" name="name" size="10"><br>

	</form>
	<br>
	<br>

	<h2>get방식폼</h2>
	<form action="quiz2" method="get">
		이름: <input type="text" name="name" size="10"><br>
		학교: <input type="text" name="sname" size="10"><br>
		학년: <input type="text" name="grade" size="10"><br>
		학교주소: <input type="text" name="addr" size="10"><br>
	</form>
	<br>
	<br>

	<h2>post방식폼_dto읽기</h2>
	<form action="quiz3" method="post">
		상품명: <input type="text" name="name" size="10"><br>
		카테고리: <input type="text" name="category" size="10"><br>
		색상: <input type="text" name="color" size="10"><br>
		가격: <input type="text" name="price" size="10"><br>
		<button type="submit">post방식 전송</button>
	</form>
	<br>
	<br>

	<h2>post방식폼_map읽기</h2>
	<form action="quiz4" method="post">
		이름: <input type="text" name="name" size="10"><br>
		나이: <input type="text" name="age" size="10"><br>
		혈액형: <input type="text" name="blood" size="10"><br>
		주소: <input type="text" name="addr" size="10"><br>
		<button type="submit">post방식 전송</button>
	</form>
</body>
</html>