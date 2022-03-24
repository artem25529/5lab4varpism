<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<form action="<c:url value="/rating"/>">
    mark1: <input type="number" name="marks"/><br/>
    mark2: <input type="number" name="marks"/><br/>
    mark3: <input type="number" name="marks"/><br/>
    mark4: <input type="number" name="marks"/><br/>
    mark5: <input type="number" name="marks"/><br/>
    <input type="submit" value="calculate">
</form>
</body>
</html>
