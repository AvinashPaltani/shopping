<%@ include file="Header.jsp" %>
<h1>ADMIN PAGE
</h1>
<HR>
<c:if test="${pageContext.request.userPrincipal.name=='admin@gmail.com'}">
<a href="Category">Add Category</a>
<br>

<a href="Product">Add Product</a>
</c:if>















<%@include file="Footer.jsp" %>