<%@include file="Header.jsp" %>
<h1>Welcome Admin</h1>
<hr>
<br/>
<br/>
<h2>
	Add a Person
</h2>
<hr>
<c:url var="addAction" value="/Admin/add" ></c:url>

<form:form action="${addAction}" commandName="product">
<table>
	<c:if test="${!empty product.productname}">
	<tr>
		<td>
			<form:label path="productId">
				<spring:message text="ID"/>
			</form:label>
		</td>
		
		<td>
			<form:input path="productId"  />
			<form:hidden path="productId" />
		</td> 
	</tr>
	</c:if>
	<tr>
		<td>
			<form:label path="productname">
				<spring:message text="Name"/>
			</form:label>
		</td>
		<td>
			<form:input path="productname" />
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="Desp">
				<spring:message text="description"/>
			</form:label>
		</td>
		<td>
			<form:input path="Desp" />
		</td>
	</tr>
	<tr>
		<td colspan="2">
			<c:if test="${!empty product.productname}">
				<input type="submit"
					value="<spring:message text="Edit Product"/>" />
			</c:if>
			<c:if test="${empty product.productname}">
				<input type="submit"
					value="<spring:message text="Add Product"/>" />
			</c:if>
		</td>
	</tr>
</table>	
</form:form>
<br>
<h3>Product List</h3>
<c:if test="${!empty listProduct}">
	<table class="tg">
	<tr>
		<th width="80">Product ID</th>
		<th width="120">Product Name</th>
		<th width="120">description</th>
		<th width="60">Edit</th>
		<th width="60">Delete</th>
	</tr>
	<c:forEach items="${listProduct}" var="product">
		<tr>
			<td>${listProduct.productId}</td>
			<td>${listProduct.productname}</td>
			<td>${listProduct.Desp}</td>
			<td><a href="<c:url value='/edit/${product.productid}' />" >Edit</a></td>
			<td><a href="<c:url value='/remove/${product.productid}' />" >Delete</a></td>
		</tr>
	</c:forEach>
	</table>
	</c:if>