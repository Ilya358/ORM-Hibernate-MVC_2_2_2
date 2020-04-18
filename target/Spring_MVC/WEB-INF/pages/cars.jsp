<%--
  Created by IntelliJ IDEA.
  User: manager
  Date: 18.04.2020
  Time: 2:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="stream" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<body>
<div align="center">
<table border="1" cellpadding="5">


    <caption><h2><stream:message code="locale.greeting" /> </h2></caption>
    <tr>
        <th>Name</th>
        <th>Model</th>
        <th>Series</th>
    </tr>
    <c:forEach var="cars" items="${carList}">
        <tr>
            <td><c:out value="${cars.name}" /></td>
            <td><c:out value="${cars.model}" /></td>
            <td><c:out value="${cars.series}" /></td>
        </tr>
    </c:forEach>
</table>
</div>
</body>
</html>
