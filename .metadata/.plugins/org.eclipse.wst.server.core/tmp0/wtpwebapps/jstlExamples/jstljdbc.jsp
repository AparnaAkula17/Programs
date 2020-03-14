<%@ page import="java.io.*,java.util.*,java.sql.*" %>
<%@ page import="javax.servlet.http.*,javax.servlet.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<html>
<head>
<title>Insert title here</title>
</head>
<body>
<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"
					url="jdbc:mysql://localhost/cts"
					user="root" password="root" />
 
 
   
<c:set var="htno" value="<%=request.getParameter(\"id\") %>" />
<c:set var="name" value="<%=request.getParameter(\"name\") %>" />
<c:set var="branch" value="<%=request.getParameter(\"brnch\") %>" />
<c:set var="clg" value="<%=request.getParameter(\"clg\") %>" />
<sql:update dataSource="${db}" var="count" >
insert into students values(?,?,?,?)
<sql:param value="${htno}" />
<sql:param value="${name}" />
<sql:param value="${branch}" />
<sql:param value="${clg}" />
</sql:update>

<sql:query dataSource="${db}" var="rs">  
SELECT * from Students;  
</sql:query> 
			
<table border="2" width="100%">  
<tr>  
<th>HTNO</th>  
<th>Name</th>  
<th>Branch</th>  
<th>College</th>  
</tr> 
 
<c:forEach var="table" items="${rs.rows}">  
<tr>  
<td><c:out value="${table.htno}"/></td>  
<td><c:out value="${table.name}"/></td>  
<td><c:out value="${table.branch}"/></td>  
<td><c:out value="${table.clg}"/></td>  
</tr>  
</c:forEach>  
</table>  
		
</body>
</html>