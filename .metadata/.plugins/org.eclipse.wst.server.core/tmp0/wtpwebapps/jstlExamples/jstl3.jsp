<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<c:set var="String" value="JSTL Programming"/>
	<c:if test="${fn:contains(String, 'Programming')}">
	<p>Found Programming string with contains tag</p>
	
	</c:if>
	<b>After contains tag</b>
	<c:if test="${fn:contains(String, 'programming')}">
	<p>Not Found contains Programming string</p>

	</c:if>
	<c:if test="${fn:containsIgnoreCase(String, 'programming')}">
	<p>Found Ignore case programming string</p>
	</c:if>

	<c:if test="${fn:endsWith(String, 'Programming')}">
	<p>Found ends with Programming string</p>
	</c:if>

	<c:set var="string1" value="It is first String."/>
	<c:set var="string2" value="IT Is <xyz>SECOND STRING</xyz>"/>
	
	<p>Index-1 : ${fn:indexOf(string1,"first")}</p>
	<p>Index-2 : ${fn:indexOf(string2,"second")}</p>

	<c:set var="str1" value="${fn:length(str1)}"/>
	<p>String-2 Length is: ${fn:length(str2) }</p>
	<p>Final value of string is :${str2}</p>
	
	<c:set var="msg" value="The Example of Jstl fn:startsWith() Function"/>
	The string starts with "The":${fn:startsWith(msg, 'The')}
	<br>The string starts with "Example":${fn:startsWith(msg,'Example')}
	
	<p>To upper case:${fn:toUpperCase(string1)}</p>
	<p>To Lower case:${fn:toLowerCase(string2) }</p>
</body>
</html>