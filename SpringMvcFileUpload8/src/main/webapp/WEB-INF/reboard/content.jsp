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
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.1/font/bootstrap-icons.css">
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
				<th><fmt:formatDate value="${dto.writeday }"
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

			<!-- 댓글 -->
			<tr>
				<td colspan="4">
					<div id="answer">
						<b>댓글: ${acount }</b><br><br>
						<c:forEach items="${alist }" var="a">
							${a.nickname } : ${a.content } &nbsp;
							<span style="color:gray; font-size:0.9em">
							<fmt:formatDate value="${a.writeday }" pattern="yyyy-MM-dd HH:mm"/>
							</span>
							<%-- <a href="adelete?idx=${a.idx }&num=${a.num}&currentPage=${currentPage}" style="text-decoration: none"></a> --%>
							<i class="adel bi bi-trash-fill" style="cursor: pointer;" onclick="delAnswer(${a.idx})"></i><br>
						</c:forEach>
						<br>
					</div>
					<form action="ainsert" method="post">
						<!-- hidden -->
						<input type="hidden" name="num" value="${dto.num }"> <input
							type="hidden" name="currentPage" value="${currentPage }">

						<div class="d-inline-flex">
							<b>닉네임: </b> <input type="text" name="nickname"
								class="form-control" style="width: 120px" required="required">
							<b>비밀번호: </b> <input type="password" name="pass"
								class="form-control" style="width: 120px" required="required">
						</div>
						<br> <br>
						<div class="d-inline-flex">
							<input type="text" name="content" class="form-control"
								style="width: 500px" placeholder="댓글내용을 입력해주세요">
							<button type="submit" class="btn btn-outline-info">확인</button>
						</div>
					</form>
				</td>
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
	
	
	
	<script>
		function delAnswer(idx){
			var pass = prompt("비밀번호를 입력하세요!");
			
			
				$.ajax({
					type:"get",
					dataType:"json",
					data:{"idx": idx, "pass":pass },
					url:"adelete",					
					success:function(res){
						if(res=="1"){
							alert("성공!!");
							location.reload();
						}else{
							alert("비밀번호 불일치!!");
						}
					}
				});
			}
		
	</script>
</body>
</html>