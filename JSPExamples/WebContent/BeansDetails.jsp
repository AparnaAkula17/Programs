<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<jsp:useBean id="u" class="examples.Details"></jsp:useBean>
<!--
<jsp:setProperty property="username" name="u" />
<jsp:setProperty property="password" name="u" />
<jsp:setProperty property="age" name="u" />
 -->
 
jsp:setProperty property="*" name="u" />


You have entered below details: <br>
<jsp:getProperty property="username" name="u" /> <br>
<jsp:getProperty property="password" name="u" /> <br>
<jsp:getProperty property="age" name="u" /> <br>