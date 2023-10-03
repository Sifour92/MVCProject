<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
<head>
    <title>All Employess</title>
</head>
<body>
<style>
    table {
        width: 80%;
        margin: 0 auto;
        border-collapse: collapse;
        font-family: 'Arial', sans-serif;
    }

    th, td {
        border: 1px solid #ddd;
        padding: 8px;
        text-align: left;
    }

    th {
        background-color: #f2f2f2;
    }

    input[type="button"] {
        background-color: #008CBA;
        color: #fff;
        border: none;
        padding: 8px 16px;
        text-align: center;
        text-decoration: none;
        display: inline-block;
        font-size: 14px;
        margin: 4px 2px;
        cursor: pointer;
        border-radius: 5px;
        transition: background-color 0.3s ease;
        font-family: 'Arial', sans-serif;
    }

    input[type="button"]:hover {
        background-color: #005f7f;
    }

    h1 {
        font-size: 24px;
        color: #333;
        font-family: 'Helvetica', sans-serif;
        text-align: center;
    }

    input[type="button"][value="ADD"] {
        background-color: #4CAF50;
        margin-left: 10%;
    }

    input[type="button"][value="ADD"]:hover {
        background-color: #45a049;
    }
</style>
<h1>All Employess</h1>
<br>

<table>
    <tr>
        <th>
            Name
        </th>
        <th>
            Surname
        </th>
        <th>
            Department
        </th>
        <th>
            Salary
        </th>
        <th>
            Operations
        </th>
    </tr>
<c:forEach var="emp" items="${allemps}">

    <c:url var="updateButton" value="/updateInfo">
        <c:param name="empId" value="${emp.id}"/>
    </c:url>

    <c:url var="deleteButton" value="/deleteEmployee">
        <c:param name="empId" value="${emp.id}"/>
    </c:url>
<tr>

    <td>
        ${emp.name}
    </td>
    <td>
        ${emp.surname}
    </td>
    <td>
        ${emp.department}
    </td>
    <td>
        ${emp.salary}
    </td>
    <td>
        <input type = "button" value="update"
               onclick="window.location.href ='${updateButton}'"/>
        <input type = "button" value="delete"
               onclick="window.location.href='${deleteButton}'">
    </td>

</tr>
</c:forEach>

</table>

<br>
<br>

<input type="button" value="ADD"
onclick="window.location.href='addNewEmployee'"/>

</body>
</html>
