<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.sql.*" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
 <%--  
  <%
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mlm", "root", "");
			String query = "select * from registration";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
			
	%> --%>
  
  

	<h1>Resister Here</h1>
	<form:form method="post" action="com.controller.insertser">
	
	 
		<table>
			<tr>
				<td> Name :</td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td> Surname :</td>
				<td><form:input path="surname" /></td>
			</tr>
			<tr>
				<td> Username :</td>
				<td><form:input path="username" /></td>
			</tr>
			<tr>
				<td>Enter Email:</td>
				<td><form:input path="email" /></td>
			</tr>
				
			<tr>
			
			<tr>
				 <td>Enter Password:</td>
				 <td><input type="password" id="newpass" name="password" >
				
				
				 
			</tr>
			
			
			<tr>
				<td>Mobile No :</td>
				<td><form:input path="mobile" /></td>
				<%-- <td>Toady's Availability</td>
				<td><input type="text" readonly="readonly"
					 value="<%=rs.getString(3)%>">
				</td> --%>
			</tr>

        
 
 
			<tr>
				<td>Enrollment Fee :</td>			
/ <td> <input type="radio" name="enrollment_fee" value="200">Bronze<br></td>
 <td> <input type="radio" name="enrollment_fee" value="300"> Silver<br></td>
 <td> <input type="radio" name="enrollment_fee" value="400"> Gold<br></td>
 <td> <input type="radio" name="enrollment_fee" value="500">Diamond<br></td>
				
			</tr>
			<tr>
			<td><input type="submit" value="save&continue"> </td>
			</tr>
		</table>
	
		
		</form:form>
		
<%-- 			<a href="Registration2?id="<%=rs.getString(1) %>>Next Step</a>
	<%
			}
	rs.close();
			stmt.close();
			con.close();

		} catch (Exception x) {
			System.out.println(x);
		}
	
		 %>	  --%>
</body>
</html>