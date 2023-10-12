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
	<form action="write" method="post">
		<table style="width:500px" class="table table-bordered">
			<tr>
				<th>이름</th>
				<td><input type="text" name="name" class="form-control" required="required" style="width:100px"></td>
			</tr>
			
			<tr>
				<th>핸드폰 번호</th>
				<td><input type="text" name="hp" class="form-control" required="required" style="width:150px"></td>
			</tr>
			
			<tr>
				<th>주소</th>
				<td><input type="text" name="addr" class="form-control" required="required" style="width:150px"></td>
			</tr>
						
			<tr>
			<td colspan="2" align="center">
			<button type="submit" class="btn btn-info">멤버등록</button>  
			<button type="button" class="btn btn-success" onclick="location.href='list'">멤버목록</button>  
			</td>
			</tr>
		</table>
	</form>
</body>
</html>