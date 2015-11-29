<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Cooltools</title>
<link rel="stylesheet" type="text/css"
	href="<c:url value="/resources/style.css" />">
</head>
<body>
	<h1>Welcome to cooltools</h1>
	<a href="<c:url value="/spittles" />">entries</a> |
	<a href="<c:url value="/spitter/register" />">Register</a>
</body>
</html>