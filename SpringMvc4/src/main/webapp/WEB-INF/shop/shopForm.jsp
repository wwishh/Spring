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
	<form action="process2" method="post">
		<table class="table table-bordered" style="width: 300px">
		<caption algn="top"><b>상품 정보 출력</b></caption>
			<tr>
				<th>상품명</th>
				<td><input type="text" name="sang" class="form-control"
					style="width: 100px"></td>
			</tr>

			<tr>
				<th>수량</th>
				<td><input type="text" name="su" class="form-control"
					style="width: 100px"></td>
			</tr>

			<tr>
				<th>단가</th>
				<td><input type="text" name="dan" class="form-control"
					style="width: 100px"></td>
			</tr>

			<tr>
				<th>색상</th>
				<td><input type="color" name="color" class="form-control"
					style="width: 100px"></td>
			</tr>

			<tr>
				<td colspan="2" align="center">
					<button type="submit" class="btn btn-info">서버에 전송</button>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>