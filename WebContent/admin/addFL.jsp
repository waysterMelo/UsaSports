<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UsaSports Administration</title>
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
	
		<h1 class="text-primary ">Manage Top Sports List <c:out value="" /></h1> <span><a href="logout">logout</a></span>
		<p>wayster h c de melo
	</div>
	<div class="container">
		<div class="col-lg-12">
		<div class="row justify-content-center">
			<div class="alert alert-info">
			<h1 class="lead ">Add new sport</h1>
			</div>
			</div><!-- row -->
			<div class="row justify-content-center">
				<form action="saveFL" method="post"  enctype="multipart/form-data">
			
				<div class="form-group">
					<label id="name">League</label>
					<input id="name" placeholder="type name's league here..." class="form-control" name="league" type="text"/>
				</div>
				
				
				
				<div class="form-group">
					<label id="file">Image</label>
					<input  type="file" id="file" name="image" class="form-control"/>
				</div>
				
				
				<div class="form-group">
					<button class="form-control btn btn-success">Save</button>
				</div>
				
			</form>
			</div>
		</div>
	</div>



<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" ></script>
	
</body>
</html>