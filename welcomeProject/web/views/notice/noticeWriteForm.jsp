<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String userId = (String)session.getAttribute("userId");	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>noticeWriteForm</title>
<style>
	input[type=file]{
  		apperance: none;
  		-webkit-apperance: none;

	}
</style>
</head>
<body>
<%@include file="../../adminHeader.jsp" %>
<h1 align="center">공지사항 새 글 등록 페이지</h1>
<br>
<form action="/hello/ninsert" method="post" enctype="multipart/form-data">
	<table align="center">
		<tr>
			<th>제목</th>
			<td><input type="text" name="ntitle"></td>
		</tr>
		<tr>
		</tr>
		<tr>
			<th>작성자</th>
			<td><input type="text" name="nwriter" value="<%=userId%>" readonly></td>
		</tr>
		<tr>
			<th>첨부파일</th>
			<td><input multiple="multiple" type = "file" name = "upfile[]"></td>
		</tr>
		<tr>
			<th>내용 : </th>
			<td><textarea name="ncontent" cols="70" rows="7"></textarea></td>
		</tr>
		<tr>
			<th colspan="2">
				<input type="submit" value="등록"> &nbsp;
				<input type="reset" value="취소"> &nbsp;
				<a href="/hello/nlist">목록</a>
			</th>
		</tr>
	</table>
</form>
<script type="text/javascript">
	/* $(document).on("click", "input[type=file]",function(){
		if(){
			
		}
		else{
			
		}
	}); */
</script>
<%@include file="../../footer.jsp" %>
</body>
</html>