<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="wrox" uri="http://www.wrox.com/jsp/tld/wrox" %>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/template" %>

<template:basic htmlTitle="Active Sessions" bodyTitle="Active Sessions">
  There are a total of ${numberOfSessions} active sessions in this application.<br /><br />
  <c:forEach items="${sessionList}" var="s">
    <c:out value="${s.id} - ${s.getAttribute('username')}" />
    <c:if test="${s.id == pageContext.session.id}">&nbsp;(you)</c:if>
    &nbsp; - last active
    ${wrox:timeIntervalToString(timestamp - s.lastAccessedTime)} ago<br />
  </c:forEach>
</template:basic>