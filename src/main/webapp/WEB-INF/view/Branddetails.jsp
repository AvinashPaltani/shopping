<%@include file="Header.jsp"%>

<script src = "https://ajax.googleapis.com/ajax/libs/angularjs/1.3.3/angular.min.js"></script>
	 <!-- rupee symbol -->
	 <link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">  
	  <link href="https://cdnjs.cloudflare.com/ajax/libsl/twitter-bootstrap/4.0.0-alpha/css/bootstrap.min.css" rel="stylesheet"/>
	
	<link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.0.0-alpha/css/bootstrap.css" rel="stylesheet"/>  
	  <script> 
	var prod;
	var app=angular.module("searchApp",[]).controller("TableCtrl",function($scope)
	                    {
	            
	             $scope.prod=${access};
	                    });
	
	</script> 
	</head>
	<body>
	
	 
	<div  ng-app="searchApp">
	<div class="container" ng-controller="TableCtrl">
	<div class="search"> 
 	<div class ="col-sm-8"></div>
 	<div class="col-sm-4">
    <input type="search" ng-model="searchText" class="form-control" id="inputSearch" placeholder="Search Here" />
     </div>
     <br/>
     <br/>
     <br/>
     <br/>
	  <table class ="table table-bordered">
	  <thead>
	  <tr>
	  <th>Name</th>
	  <th>Brand</th>
	  <th>Price</th>
	  <th>Description</th>
	 </tr>
	  </thead>
	  <tbody>
	  
	    
	   <tr  ng-repeat="p in prod|filter:searchText">
	    <td>{{ p.name }}</td>
	    <td>{{p.brand}}</td>
	    <td><i class="fa fa-inr"></i>{{p.price}}</td>
	       <td>{{p.desp}}</td>
	    </tr>   
	</tbody>         
	       
	    </table></div>
	</div> 
	
	
	
	<%@include file="Footer.jsp" %>