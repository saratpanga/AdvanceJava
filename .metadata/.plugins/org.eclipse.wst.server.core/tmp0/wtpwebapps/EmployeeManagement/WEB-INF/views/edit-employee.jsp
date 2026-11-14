<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Epmployee</title>
</head>
<body>
<h2>Edit Employee</h2>
<form action="${pageContext.request.contextPath}/flm/employees/update" method="post">

<input type="text" value="${employee.employeeId}" name="empId" hidden="true">

<label for="empname">Employee Name:</label> 
<input type="text" value="${employee.employeeName}" name="empname"placeholder="Enter emp name"><br>

<label for="empemail">Employee Email:</label>
<input type="text" value="${employee.employeeEmail}" name="empemail"placeholder="Enter emp email"><br>

<label for="empage">Employee Age:</label>
<input type="text" value="${employee.employeeAge}" name="empage"placeholder="Enter emp age"><br>

<label for="empsalary">Employee Salary:</label>
<input type="text" value="${employee.employeeSalary}" name="empsalary"placeholder="Enter emp salary"><br>

<label for="empdept">Employee Dept:</label>
<input type="text" value="${employee.employeeDepartment}" name="empdept"placeholder="Enter emp dept"><br><br>

<input type="submit" value="Edit">
</form>`

</body>
</html>