<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Courses</title>
</head>
<body>
    <h2>Available Courses</h2>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Duration</th>
        </tr>
        <c:forEach var="course" items="${courses}">
            <tr>
                <td>${course.id}</td>
                <td>${course.name}</td>
                <td>${course.duration}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
