<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.wrox.Ticket, com.wrox.Attachment" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/template" %>

<%--@elvariable id="loginFailed" type="java.lang.Boolean"--%>
<template:loggedOut htmlTitle="Log In" bodyTitle="Log In">
  You must log in to access the customer support site.<br /><br />
  <c:if test="${loginFailed}">
	  <b>The username or password you entered are not correct. Please try again.</b><br /><br />
  </c:if>
  <form method="POST" action="<c:url value="/login" />">
    Username<br />
    <input type="text" name="username" /><br /><br />
    Password<br />
    <input type="password" name="password" /><br /><br />
    <input type="submit" value="Log In" />
  </form>
</template:loggedOut>