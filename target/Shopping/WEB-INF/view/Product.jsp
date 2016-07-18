<%@include file="Header.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h1>
	Add a Product
</h1>
<hr>
<c:url var="addAction" value="/Admin/add" ></c:url>

 <form:form action="${addAction}" commandName="product"  modelAttribute="product"  enctype="multipart/form-data" method="post"  >
 <table>
	 <c:if test="${!empty product.name}">
	<tr>
		<td>
		Id
		</td>
		<td>
			<form:input path="id" readonly="true"  disabled="true"/>
			<form:hidden path="id" />
		</td> 
	</tr>
	</c:if>  
	<tr>
	 
		  <td>
			Product Name
		</td>
		<td>
			<form:input path="name"/>
		</td> 
	</tr>
	
	<tr>
		<td>
			Desp
		</td>
		<td>
			<form:input path="desp" />
		</td>
	</tr>
	<tr>
		<td>
			Price
		</td>
		<td>
			<form:input path="price" />
		</td>
	</tr>
	<tr>
		<td>
			Brand
		</td>
		<td>
			<form:input path="brand" />
		</td>
	</tr>
	 <tr>
        <td>
            <form:label path="image">
                <spring:message text="Photo to upload"/>
            </form:label>
        </td>
        <td>
            <form:input type="file" path="image" />
        </td><td></td>
        
    </tr> 
	<tr>
		<td colspan="2">
			<c:if test="${empty product.name}">
				<input type="submit"
					value="<spring:message text="Add Product"/>" />
			</c:if>
			 <c:if test="${!empty product.name}">
				<input type="submit"
					value="<spring:message text="Edit Product"/>" />
			</c:if> 
		</td>
	</tr>  
</table>	
</form:form> 
<br>
 <h3>Product List</h3>
 

<hr>
 <c:if test="${!empty list}"> 
	<table class="tg">
	<tr>
		<th width="80">Product ID</th>
		<th width="120">Product Name</th>
		<th width="120">Brand Name</th>
		<th width="120">Description</th>
		<th width="80">Price</th>
		<th width="60">Edit</th>
		<th width="60">Delete</th>
	</tr> 
	
	  <c:forEach items="${list}" var="product">
		<tr>
		
		<td>${product.id}</td>
		<td>${product.name}</td>	
			<td>${product.brand}</td>
			<td>${product.desp}</td> 
			<td>${product.price}</td>
			   <%-- <td><a href="<c:url value='/edit/$session.getContextPath()/{product.id}'/>" >Edit</a></td> --%>
			 <td><a href="<c:url value='/edit/${product.id}'/>" >Edit</a></td> 
			<td><a href="<c:url value='/remove/${product.id}'/>" >Delete</a></td>   
		</tr>
	</c:forEach>   
	</table>
  </c:if>  

</body>
</html>