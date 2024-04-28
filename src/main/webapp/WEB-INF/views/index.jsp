<%--
  Created by IntelliJ IDEA.
  User: BM
  Date: 4/22/2024
  Time: 11:39 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css"/>
</head>
<body>
<div class="container">
    <nav class="navbar bg-body-tertiary">
        <div class="conatiner">
            <a href="" class="navbar-brand mb-0 h1">
                Customer List
            </a>
        </div>
    </nav>


    <div class="conatiner mx-5 my-3">
        <a href="${pageContext.request.contextPath}/customers/add" class="btn btn-primary" >Add Customer</a>
<%--        <a href="${pageContext.request.contextPath}/customer/index/sort" class="btn btn-warning" >Sort Customers</a>--%>
    </div>

<%--    <div class="conatiner mx-5 my-3">--%>
<%--        <form action="${pageContext.request.contextPath}/customer/search">--%>
<%--            <input name="firstName" class="form-control" placeholder="Search"/>--%>
<%--            <input type="submit" value="Search" class="btn btn-primary my-3">--%>
<%--        </form>--%>
<%--    </div>--%>


    <div class="container">
        <table class="table table-striped my-3">
            <tr>
                <th>ID</th>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Email</th>
                <th>Options</th>
            </tr>

            <c:forEach items="${customers}" var="customer">
                <tr>
                    <td>${customer.id}</td>
                    <td>${customer.firstName}</td>
                    <td>${customer.lastName}</td>
                    <td>${customer.email}</td>
                    <td>
                        <a href="${pageContext.request.contextPath}/customers/delete/${customer.id}"  class="btn btn-danger mx-1">Delete</a>
                        <a href="${pageContext.request.contextPath}/customers/update/${customer.id}" class="btn btn-secondary mx-1">Update</a>
                    </td>
                </tr>
            </c:forEach>
        </table>


    </div>


</div>



    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
</body>
</html>
