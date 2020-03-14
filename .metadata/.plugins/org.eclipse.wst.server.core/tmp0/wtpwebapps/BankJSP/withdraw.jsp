<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="java.sql.*"
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%
try
	{
		int bal=Integer.parseInt(request.getParameter("amt"));
		String uid=request.getParameter("lid");
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
		String sql = "update bank set balance=(balance+?) where loginid=?";
		PreparedStatement pst=connection.prepareStatement(sql);
		pst.setInt(1,bal);
		pst.setString(2,uid);
  		int count=pst.executeUpdate();
   		if(count!=0)
		{
			out.print("amount added successfully");
		}
		else
		{
			out.print("amount added unsuccessfull");
		}
		pst.close();
		connection.close();
	}
	catch(Exception e)
	{
		out.println(e);
	}
%>


</body>
</html>