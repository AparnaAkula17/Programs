<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Insert title here</title>
</head>
<body>

<c:catch var="myexe">
<%int x=2/0; %>
</c:catch>

<c:if test="${myexe!=null }">
<p>the type of exception is:${myexe}<br/>
there is an exception:${myexe.message}<br/>
</c:if>

</body>
</html>
