<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage = "true" %>    
<!-- scriptlet 태그라고 함 :일반 메소드 안에서의 코드를 작성하는 영역이라고 생각하면 됨 -->
<%
	//이 페이지로 포워딩된 request 객체 안의 저장된 값
	//꺼내기
	//jsp에는 내장된 객체들이 있음
	//request 객체도 내장된 객체임. 그냥 사용하면 됨.
	String message = (String)request.getAttribute("message");
	
%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>회원서비스 에러났습니다.</h1>
	<h3><%=message%></h3>
</body>
</html>