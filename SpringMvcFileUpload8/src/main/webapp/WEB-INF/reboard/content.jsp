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
	<table class="table table-bordered" style="width: 600px">
		<tr>
			<th>${dto.num}</th>
			<th>${dto.subject }</th>
			<th><fmt:formatDate value="${dto.writeday }"
					pattern="yyyy-MM-dd" /></th>
			<th>${dto.writer }</th>
		</tr>

		<tr>
			<c:if test="${dto.photo!='no' }">
				<td colspan="2"><c:forEach var="p" items="${dto.photo }">
						<img src="../upload/${p }" width="200px">
					</c:forEach></td>
			</c:if>

			<c:if test="${dto.photo=='no' }">
			<td colspan="2">
				<img src="../photo/noimage.png" width="200px"></td>
			</c:if>

			<td colspan="2">${dto.content }</td>
		</tr>
	</table>
</body>
</html>