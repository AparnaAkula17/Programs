<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Insert title here</title>
</head>
<body>

<c:set var="salary" scope="session" value="${2000*2}" />
	<c:if test="${income>8000}">
		<p> My income is: <c:out value="${income}" /> </p>
	</c:if>
	<c:out value />
	
</body>
</html>