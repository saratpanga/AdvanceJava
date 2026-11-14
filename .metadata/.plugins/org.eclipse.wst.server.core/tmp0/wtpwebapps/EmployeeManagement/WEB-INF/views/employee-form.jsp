<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Epmployee</title>
</head>
<body>
<h2>Add Employee</h2>
<form action="save" method="post">
<label for="empname">Employee Name:</label> 
<input type="text" name="empname"placeholder="Enter emp name"><br>

<label for="empemail">Employee Email:</label>
<input type="text" name="empemail"placeholder="Enter emp email"><br>

<label for="empage">Employee Age:</label>
<input type="text" name="empage"placeholder="Enter emp age"><br>

<label for="empsalary">Employee Salary:</label>
<input type="text" name="empsalary"placeholder="Enter emp salary"><br>

<label for="empdept">Employee Dept:</label>
<input type="text" name="empdept"placeholder="Enter emp dept"><br><br>

<input type="submit" value="Add">
</form>`

</body>
</html>