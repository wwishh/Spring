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
	<div style="margin: 50px 50px">
		<table class="table table-bordered" style="width: 600px">
			<caption align="top">
				<b>상세 페이지</b>
			</caption>
			<tr>
				<th>${dto.num}</th>
				<th>${dto.subject }</th>
				<th><fmt:formatDate
						value="${dto.writeday }"
						pattern="yyyy-MM-dd" />&nbsp;&nbsp;조회수 ${dto.readcount }</th>
				<th>${dto.writer }</th>
			</tr>

			<tr>
				<c:if test="${dto.photo!='no' }">
					<td colspan="2"><c:forEach var="p" items="${dto.photo }">
							<img src="../upload/${p }"
								style="width: 150px; height: 150px; border: 2px solid black">
						</c:forEach></td>
				</c:if>

				<c:if test="${dto.photo=='no' }">
					<td colspan="2"><img src="../photo/noimage.png"
						style="width: 150px; height: 150px; border: 2px solid black"></td>
				</c:if>

				<td colspan="2">${dto.content }</td>
			</tr>

			<tr>
				<td colspan="4" align="center">
					<button type="button" class="btn btn-outline-info"
						onclick="location.href='writeform'">글쓰기</button>
					<button type="button" class="btn btn-outline-secondary"
						onclick="location.href='writeform?num=${dto.num}&regroup=${dto.regroup }&restep=${dto.restep }&relevel=${dto.relevel }&currentPage=${currentPage }'">답글</button>
					<button type="button" class="btn btn-outline-warning"
						onclick="location.href='updatepassform?num=${dto.num }&currentPage=${currentPage}'">수정</button>
					<button type="button" class="btn btn-outline-danger"
						onclick="location.href='deletepassform?num=${dto.num }&currentPage=${currentPage}'">삭제</button>
					<button type="button" class="btn btn-outline-success"
						onclick="location.href='list?currentPage=${currentPage}'">목록</button>
				</td>
			</tr>
		</table>
	</div>
</body>
</html>