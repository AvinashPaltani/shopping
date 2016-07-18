<%@include file="Header.jsp" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h1>
	Add a Category
</h1>
<hr>
<c:url var="addAction" value="/Admin/add" ></c:url>

<form:form action="${addAction}" commandName="category" method="post">
 <table>
	 <c:if test="${!empty category.name}">
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
			Category Name
		</td>
		<td>
			<form:input path="name"/>
		</td> 
	</tr>
	
	<tr>
		<td>
			Description 
		</td>
		<td>
			<form:input path="description" />
		</td>
	</tr>
	<%-- <tr>
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
	</tr> --%>
	<tr>
		<td colspan="2">
			<c:if test="${empty category.name}">
				<input type="submit"
					value="<spring:message text="Add category"/>" />
			</c:if>
			 <c:if test="${!empty category.name}">
				<input type="submit"
					value="<spring:message text="Edit category"/>" />
			</c:if> 
		</td>
	</tr>  
</table>	
</form:form>
<br>
 <h3>Category List</h3>
<hr>
<c:if test="${!empty list}">
	<table class="tg">
	<tr>
		<th width="80">Category ID</th>
		<th width="120">Category Name</th>
		<th width="120">Description</th>
		<th width="60">Edit</th>
		<th width="60">Delete</th>
	</tr> 
	
	  <c:forEach items="${list}" var="category">
		<tr>
		
		<td>${category.id}</td>
		<td>${category.name}</td>	
			<td>${category.description}</td> 
			   <%-- <td><a href="<c:url value='/edit/$session.getContextPath()/{product.id}'/>" >Edit</a></td> --%>
			 <td><a href="<c:url value='/edit/${category.id}'/>" >Edit</a></td> 
			<td><a href="<c:url value='/remove/${category.id}'/>" >Delete</a></td>   
		</tr>
	</c:forEach>   
	</table>
 </c:if> 

</body>
</html>