<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="com.vidvaan.model.EmployDetails"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
<head>

<style>
#customers {
	font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

#customers td, #customers th {
	border: 1px solid #ddd;
	padding: 8px;
}

#customers tr:nth-child(even) {
	background-color: #f2f2f2;
}

#customers tr:hover {
	background-color: #ddd;
}

#customers th {
	padding-top: 12px;
	padding-bottom: 12px;
	text-align: left;
	background-color: #4CAF50;
	color: white;
}
</style>
</head>
<body>
	<%
		List<EmployDetails> employee = (List<EmployDetails>) request.getAttribute("emp");
	%>

	<table id="customers">
		<tr>
			<th>EmpId</th>
			<th>Name</th>
			<th>Gender</th>
			<th>Salary</th>
			<th>Department</th>
			<th>Delete</th>
			<th>UpDate</th>
			<%
				for (EmployDetails emp : employee) {
			%>
		</tr>
		<tr>
			<td>
				<%
					out.print(emp.getId());
				%>
			</td>
			<td>
				<%
					out.print(emp.getName());
				%>
			</td>
			<td>
				<%
					out.print(emp.getGender());
				%>
			</td>
			<td>
				<%
					out.print(emp.getSalary());
				%>
			</td>
			<td>
				<%
					out.print(emp.getDepartment());
				%>
			</td>
			<td><a href="./delete?id=<%= emp.getId()%>"><i class="fa fa-id-card" aria-hidden="true"></i>delete</a>
			</td>
			</td>
			<td><a href="./update?id=<%= emp.getId() %>"><button>update</button></a>
			</td>
			


		</tr>
		<%
			}
		%>
		
	</table><hr>
	<a href="home.jsp"><center><b style="color: lightblue"><button>Home</button></b></center></a>

</body>

</body>
</html>