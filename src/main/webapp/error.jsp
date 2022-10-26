
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
   String message = pageContext.getException().getMessage();
   String exception = pageContext.getException().getClass().toString();
   //pageContext.getSession()
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Error page</title>
</head>
<body>
   E R R O R!
   <p>Type: <%= exception%></p>
   <p>Message: <%= message %></p>
</body>
</html>