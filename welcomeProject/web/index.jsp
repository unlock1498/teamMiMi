<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	//jsp 파일 안에는 request, session 객체도 내장되어 있다
	String userId = (String)session.getAttribute("userId");
%> 
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>hello</title>
<style type="text/css">
	
	
</style>
</head>
<body>
	<%if(userId != null && userId.equals("admin")){ %>
		<%@include file="adminHeader.jsp" %>
	<%}else{ %>
		<%@include file="header.jsp" %>
	<%} %>
 	
 	<hr>
 	<section>
 	</section>
	<hr>
	<%@include file="footer.jsp" %>
	
</body>
</html>