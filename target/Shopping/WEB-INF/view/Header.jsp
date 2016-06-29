<!DOCTYPE html>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html >
<head>
<meta charset="ISO-8859-1">
<title>Luxury Watches</title>
<link href="resources/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="resources/bootstrap/css/bootstrap-theme.min" rel="stylesheet">

 <!-- <link
href="https://cdnjs.cloudflare.com/ajax/libsl/twitter-bootstrap/4.0.0-alpha/css/bootstrap.min.css"
rel="stylesheet" />

 <link
href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.0.0-alpha/css/bootstrap.css"
rel="stylesheet" />
 -->
<!-- nav bar  -->
<style type="text/css">
	.navbar{
		margin-top: 20px;
	}
</style>
<!-- carousel -->
<style type="text/css">
.carousel{
    background: #2f4357;
    margin-top: 20px;
}
.carousel .item img{
    margin: 0 auto; /* Align slide image horizontally center */
}
.bs-example{
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
            <a href="#" class="navbar-brand">DA<sub>3</sub>M</a>
        </div>
        <!-- Collection of nav links, forms, and other content for toggling -->
        <div id="navbarCollapse" class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
                <li class="active"><a href="Landing">Home</a></li>
                <!-- men -->
             
                
                
                
                
                <li><a href="#">Profile</a></li>
                <li class="dropdown">
                    <a data-toggle="dropdown" class="dropdown-toggle" href="#">MEN<b class="caret"></b></a>
                    <ul role="menu" class="dropdown-menu">
                        <li><a href="#">Inbox</a></li>
                        <li><a href="#">Drafts</a></li>
                        <li><a href="#">Sent Items</a></li>
                        <li class="divider"></li>
                        <li><a href="#">Trash</a></li>
                    </ul>
                </li>
                
           <li class="dropdown">
                    <a data-toggle="dropdown" class="dropdown-toggle" href="#">WOMEN<b class="caret"></b></a>
                    <ul role="menu" class="dropdown-menu">
                        <li><a href="#">Inbox</a></li>
                        <li><a href="#">Drafts</a></li>
                        <li><a href="#">Sent Items</a></li>
                        <li class="divider"></li>
                        <li><a href="#">Trash</a></li>
                    </ul>
                </li>     
                
                
                
            </ul>
          
            <ul class="nav navbar-nav navbar-right">
                <li><a href="index">Login</a></li>
                <li><a href="Register">New User</a></li>
            </ul>
        </div>
    </nav>
</div>






<script src="https://code.jquery.com/jquery-2.1.3.min.js"></script>

    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="resources/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>