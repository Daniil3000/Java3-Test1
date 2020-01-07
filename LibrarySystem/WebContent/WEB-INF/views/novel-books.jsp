<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Novel books</title>
</head>
<body>
	<div align="left">
		List of novel books
		<table border="1">
			<tr>
				<th>author name</th>
				<th>title</th>
			</tr>

			<c:forEach var="book" items="${novelBookList}">
				<tr>
					<td><c:out value="${book.author}"></c:out></td>
					<td><c:out value="${book.title}"></c:out></td>
				</tr>
			</c:forEach>

		</table>


	</div>
</body>
</html>