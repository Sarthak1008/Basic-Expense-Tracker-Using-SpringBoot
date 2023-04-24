<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<c:set var="contextRoot" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Expense Tracker</h1>
    <p>${message}</p>

    <a href="${contextRoot}/expense">Add Expense</a>
        <c:forEach var="expense" items="${expenses}">
                <h3>${expense.expenseName}</h3>
                <p>&#8377;${expense.amount}</p>
                <a href="${contextRoot}/expense/${expense.id}">Edit</a>
        </c:forEach>
</body>
</html>