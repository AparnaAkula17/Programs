<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Passing the input value to a session</title>
</head>
<body>

<%
	String uname=request.getParameter("inputname");
	String passwd=request.getParameter("password");
	int age=Integer.parseInt(request.getParameter("age"));
	
	out.print("Welcome "+uname);
	
	session.setAttribute("sname",uname);
	session.setAttribute("spasswd",passwd);
	session.setAttribute("sage",age);
%>
<a href="outputsession.jsp"> Check Output Page</a>

</body>
</html>