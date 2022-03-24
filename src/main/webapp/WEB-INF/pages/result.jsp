<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Your result is: <fmt:formatNumber type="number" maxFractionDigits="2" value="${result}"/> </h2>
<a href="<c:url value="/home"/>">home</a>
</body>
</html>
