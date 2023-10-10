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
	<h2>입력 정보 출력</h2>

	이름: ${dto.name }<br>
	좋아하는 색: <div style="display:inline-block; width:20px; height:20px; background-color:${dto.color}"></div><br>
	<c:if test="${dto.hobby==null }">
	취미: 없음<br></c:if>
	
	<c:if test="${dto.hobby!=null }">
	취미: 
	<c:forEach var="hobby" items="${dto.hobby}">
		[${hobby}]
	</c:forEach>
	<br>
	</c:if>
	가장 좋아하는 언어: ${dto.lang }
</body>
</html>