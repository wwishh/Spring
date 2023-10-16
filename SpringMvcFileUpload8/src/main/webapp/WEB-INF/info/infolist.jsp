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
<div class="alert alert-danger">
<b>${count }개의 데이터가 있습니다</b>
</div>
<br><br>
<button type="button" class="btn btn-info btn-sm" onclick="location.href='addform'">글쓰기</button>

<hr>
<table class="table table-bordered" style="width:800px;">
	<tr>
	<th>번호</th>
	<th>이름</th>
	<th>사진</th>
	<th>운전면허</th>
	<th>주소</th>
	<th>작성일</th>
	<th>편집</th>
	</tr>
	<c:forEach var="dto" items="${list }" varStatus="i">
		<tr>
		<td align="center">${i.count }</td>
		<td>${dto.name }</td>
		<td>
			<c:if test="${dto.photo!='no' }">
				<img alt="" src="../photo/${dto.photo }" width="50" height="50" class="img-circle">
			</c:if>
			
			<c:if test="${dto.photo=='no' }">
				<img alt="" src="../photo/noimage.png" width="50" height="50" class="img-circle">
			</c:if>
		</td>
		<td>${dto.driver }</td>
		<td>${dto.addr }</td>
		<td><fmt:formatDate value="${dto.gaipday }" pattern="yyyy-MM-dd HH:mm"/> </td>
		
		<td><button type="button" class="btn btn-outline-warning btn-sm" onclick="location.href='uform?num=${dto.num }'">수정</button>
<button type="button" class="btn btn-outline-danger btn-sm" onclick="location.href='delete?num=${dto.num }'">삭제</button>		
		</td>
		</tr>
	</c:forEach>
</table>

<div style="width:900px; text-align:center">
	<form action="list" class="d-inline-flex">
		<select name="title" class="form-control" style="width:120px">
			<option value="name" ${title=='name'?"selected":"" }>이름</option>
			<option value="addr" ${title=='addr'?"selected":"" }>주소</option>
			<option value="driver" ${title=='driver'?"selected":"" }>운전면허</option>
		</select>
		<input type="text" name="search" class="form-control" placeholder="검색단어" style="width:150px" value="${search }">
		
		<button type="submit" class="btn btn-success">검색</button>
	</form>
</div>
</body>
</html>