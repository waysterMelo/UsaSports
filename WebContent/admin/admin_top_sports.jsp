<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Administration</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<link
	href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css"
	rel="stylesheet">
</head>

<body>

	<header>
	<jsp:include page="header.jsp"></jsp:include>
	</header>
	
	
	<div class="col-lg-12 py-5 text-center">
	
		<h1 class="text-primary ">Manage Top Sports List <c:out value="${sessionScope.User_email}" /></h1> <span><a href="logout">logout</a></span>
		<p>wayster h c de melo
	</div>
	<div class="container">
		<div class="col-lg-12">
		<div class="row">
			<div class="row">
			<button class="btn btn-info my-4">Add new sport</button>
			</div>
			<table class="table">
				<thead class="thead-dark">
					<tr>
					<th scope="col">#</th>
					<th scope="col">name</th>
					<th scope="col">image</th>
					<th>actions</th>
					</tr>
				</thead>
				<tbody>
				<c:forEach varStatus="status" var="sport" items="${lista}">
					<tr>
					<td>${status.index + 1}</td>
					<td>${sport.league}</td>
					<td><img alt="image" src="data:image/jpg;base64,${sport.base64Image}" class=""></td>
					</tr>
				</c:forEach>
				</tbody>
			</table>		
		</div>
		</div>
	</div>



<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" ></script>
	
</body>
</html>