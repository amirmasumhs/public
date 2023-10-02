<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
    Country Status: ${country.status} <br/>
    Country Total Result: ${country.totalResults} <br/>
    Country Article: <br/>
    <c:forEach items="${country.article}" var="article">
        <tr>
            <td> author: <<c:out value="${article.author}"</td><br/>
            <td> title: <<c:out value="${article.title}"</td><br/>
            <td> url: <<c:out value="${article.url}"</td><br/>
            <td> publishedAt: <<c:out value="${article.publishedAt}"</td><br/>
</body>

