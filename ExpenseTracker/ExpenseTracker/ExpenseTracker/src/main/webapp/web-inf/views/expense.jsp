<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<c:set var="contextRoot" value="${pageContext.request.contextPath}"></c:set>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Add Expense</h1>
        <form:form action="${contextRoot}/expense" method="post" modelAttribute="expense">
                <form:input path="expenseName" placeholder="Enter Expense Name"/>
                <form:input path="amount" placeholder="Enter Expense Amount"/>
                <form:input path="note" placeholder="Notes"/>
                <button type="submit">Add Expense To List</button>
        </form:form>
</body>
</html>