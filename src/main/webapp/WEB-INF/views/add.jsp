<%--
  Created by IntelliJ IDEA.
  User: BM
  Date: 4/22/2024
  Time: 12:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add Customer</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/WEB-INF/resources/css/style.css"/>
</head>
<body>
<div class="container d-flex justify-content-center align-items-center flex-column">
    <form:form method="post" action="${pageContext.request.contextPath}/customers" modelAttribute="customer">
        <form:hidden path="id"/>
        <div class="mb-3">
            <label for="firstName" class="form-label">First Name</label>
            <form:input path="firstName" type="text" class="form-control" id="firstName"/>
        </div>
        <div class="mb-3">
            <label for="lastName" class="form-label">Last Name</label>
            <form:input path="lastName" type="text" class="form-control" id="lastName"/>
        </div>
        <div class="mb-3">
            <label for="email" class="form-label">Email address</label>
            <form:input path="email" type="email" class="form-control" id="email" aria-describedby="emailHelp"/>
        </div>
        <input type="submit" class="btn btn-primary" value="Operate">
    </form:form>

</div>


    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>
