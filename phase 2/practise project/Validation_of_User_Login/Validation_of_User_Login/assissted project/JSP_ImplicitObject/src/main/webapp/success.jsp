<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

String name=(String)  session.getAttribute("uname");
   out.print("welcome " +name);

%> <br>
welcome again  <%= session.getAttribute("uname")%>
context: <%= application.getAttribute("pwd")%>



</body>
</html>