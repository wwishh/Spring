<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

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
	<button type="button" class="btn btn-outline-info" onclick="location.href='ilike/movie'">제목을 메세지로 받아서 출력하고 그 아래 이미지_result1</button><br>
	<button type="button" class="btn btn-outline-success" onclick="location.href='school/myinfo'">get방식 테이블출력(이름,학교,학년,학교주소)_result2</button><br>
	<button type="button" class="btn btn-outline-danger" onclick="location.href='shop/ipgo'">post방식_dto_ 테이블출력(상품명,카테고리,색상,가격)_result3</button><br>
	<button type="button" class="btn btn-outline-warning" onclick="location.href='myshinsang'">post방식 Map출력(이름,나이,혈액형,주소)_result4</button><br>
</body>
</html>