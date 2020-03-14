<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Output page:Fetching details</title>
</head>
<body>

<%
	String name1=(String)session.getAttribute("sname");
	String passwd1=(String)session.getAttribute("spasswd");
	int age1=(Integer)session.getAttribute("sage");
	out.print("Hello User : You have entered the name:" +name1);
	out.print(age1 +"   "+ passwd1);


%>
</body>
</html>