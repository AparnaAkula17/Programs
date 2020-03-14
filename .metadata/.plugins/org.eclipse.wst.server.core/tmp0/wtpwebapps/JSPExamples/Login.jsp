<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="java.util.*"
    errorPage="MathsError.jsp"
    isErrorPage="false"
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	
	String lid=request.getParameter("name");
	String pwd=request.getParameter("password");
	if(lid.equals("admin") && pwd.equals("1234"))
	{
%>
	<b> Authorised User </b>
<%	}
	else
	{
%>		
	<b> Unauthorised User </b>	
<% 
	} 
%>
</body>
</html>