 <%@include file="Header.jsp"%>
<script src = "https://ajax.googleapis.com/ajax/libs/angularjs/1.3.3/angular.min.js"></script>
	   
	 <link href="https://cdnjs.cloudflare.com/ajax/libsl/twitter-bootstrap/4.0.0-alpha/css/bootstrap.min.css" rel="stylesheet"/>
	
	<link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.0.0-alpha/css/bootstrap.css" rel="stylesheet"/>  
	 <script> 
	var prod;
	var app=angular.module("searchApp",[]).controller("TableCtrl",function($scope)
	                    {
	            
	             $scope.prod=${access};
	                    });
	
	</script>  
	
	  
	<div  ng-app="searchApp">
	<div ng-controller="TableCtrl">
	  <table class ="table table-bordered">
	  <thead>
	  <tr>
	  <th>Image</th>
	  <th>Name</th>
	  <th>Brand</th>
	  <th>Price</th>
	  <th>Description</th>
	  
	 </tr>
	  </thead>
	  <tbody>
	 
	    
	   <tr  ng-repeat="p in prod">
	    <td><img src="<c:url value="/resources/pics/{{p.id}}.jpg" />"  height="300" width="300" alt="watches"/></td>
	    <td>{{ p.name }}</td>
	    <td>{{p.brand}}</td>
	    <td>{{p.price|currency}}</td>
	       <td>{{p.desp}}</td>
	    </tr>   
	</tbody>         
	       
	    </table>
	    </div>
	</div>  
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	