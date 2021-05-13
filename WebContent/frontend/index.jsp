<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fanatics Ecommerce</title>
	<link rel="stylesheet" href="css/bootstrap.min.css">
	<link rel="stylesheet" href="css/main.css">
	<script src="https://kit.fontawesome.com/9a13e85c91.js" crossorigin="anonymous"></script>
</head> 
<body>
 <header>
 	<jsp:include page="header.jsp" />
 </header>

<div class="container-fluid bg-light">
	<div class="row justify-content-center">
		<div class="d-flex justify-content-center my-3">
				<h4 class=" my-4">Shop Your Favorite League</h4>
		</div>
		
		<c:forEach varStatus="status" var="fl" items="${listaAll}">
		<div class="colunas">
			<img alt="" src="data:image/jpg;base64,${fl.base64Image}" class="w-50"> <br>
			<p class="font-weight-bolder">${fl.league}</p>
		</div>
		</c:forEach>
		
	</div>
</div>

<footer>
	<jsp:include page="footer.jsp" />
</footer>
</body>
</html>