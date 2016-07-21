<!DOCTYPE html>
<%@page import="java.nio.file.attribute.UserPrincipal"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Luxury Watches</title>
<link rel="shortcut icon" href="resources/images/tag.ico" />
<link href="resources/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="resources/bootstrap/css/bootstrap-theme.min"
	rel="stylesheet">
<script>
	function formSubmit() {
		document.getElementById("logout").submit();
	}
</script> 

<!-- <link
href="https://cdnjs.cloudflare.com/ajax/libsl/twitter-bootstrap/4.0.0-alpha/css/bootstrap.min.css"
rel="stylesheet" />

 <link
href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.0.0-alpha/css/bootstrap.css"
rel="stylesheet" />
 -->
<!-- nav bar  -->
<style type="text/css">
.navbar {
	margin-top: 20px;
}
</style>
<!-- carousel -->
<style type="text/css">
.carousel {
	background: #2f4357;
	margin-top: 20px;
}

.carousel .item img {
	margin: 0 auto; /* Align slide image horizontally center */
}

.bs-example {
	margin: 20px;
}
</style>
</head>
<body>
	<div class="container">
		<nav role="navigation" class="navbar navbar-inverse">
			<!-- Brand and toggle get grouped for better mobile display -->
			<div class="navbar-header">
				<!--  <button type="button" data-target="#navbarCollapse" data-toggle="collapse" class="navbar-toggle">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                
            </button> -->
				<a href="Landing" class="navbar-brand">DA<sub>3</sub>M
				</a>
			</div>



			<c:url value="/perform_logout" var="logout" />
			<form action="${logout}" method="post" id="logout">
				<input type="hidden" name="${_csrf.parameterName}"
					value="${_csfr.token}" />

			</form>
			​




			<!-- Collection of nav links, forms, and other content for toggling -->
			<div id="navbarCollapse" class="collapse navbar-collapse">
				<ul class="nav navbar-nav">
					<li class="active"><a href="Landing">Home</a></li>

					<!-- men -->
					<li class="dropdown"><a data-toggle="dropdown"
						class="dropdown-toggle" href="#">MEN<b class="caret"></b></a>
						<ul role="menu" class="dropdown-menu">
							<li><a href="Branddetails/Titan-Men">Titan</a></li>
							<li><a href="Branddetails/Casion">Casion</a></li>
							<li><a href="#">Fastrack</a></li>
							<li><a href="#">Sonata</a></li>
							<li class="divider"></li>
							<li><a href="Branddetails/Tommy-Hilfiger">Tommy Hilfiger</a></li>
							<li><a href="Branddetails/Fossil">Fossil</a></li>
							<li><a href="#">Seiko</a></li>
							<li><a href="#">Swatch</a></li>
						</ul></li>

					<li class="dropdown"><a data-toggle="dropdown"
						class="dropdown-toggle" href="#">WOMEN<b class="caret"></b></a>
						<ul role="menu" class="dropdown-menu">
							<li><a href="Branddetails/Titan-Women">Titan</a></li>
							<li><a href="Branddetails/Casion">Casion</a></li>
							<li><a href="#">Fastrack</a></li>
							<li><a href="#">Sonata</a></li>
							<li class="divider"></li>
							<li><a href="Branddetails/Tommy-Hilfiger">Tommy Hilfiger</a></li>
							<li><a href="Branddetails/Fossil">Fossil</a></li>
							<li><a href="#">Seiko</a></li>
							<li><a href="#">Swatch</a></li>
						</ul></li>
					<li><a href="Contact">Contact Us </a></li>
				</ul>


				<c:if test="${pageContext.request.userPrincipal.name!=null}">
					<font size=5 color="blue">welcome:${pageContext.request.userPrincipal.name}</font>
					<!-- <a href="javascript:formSubmit()">LOGOUT</a> -->
					<a href="javascript:formSubmit()">LOGOUT</a>
				</c:if>

				​

				<c:if test="${pageContext.request.userPrincipal.name==null}">

					<ul class="nav navbar-nav navbar-right">
						<li><a href="Login">Login</a></li>
						<li><a href="Registration">New User</a></li>
						</c:if>
						<c:if test="${pageContext.request.userPrincipal.name=='admin@gmail.com'}">
						<li><a href="Admin">Admin</a></li>
				</c:if>
				
			
				</ul>
			</div>
		</nav>
	</div>


	<script src="https://code.jquery.com/jquery-2.1.3.min.js"></script>

	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="resources/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>