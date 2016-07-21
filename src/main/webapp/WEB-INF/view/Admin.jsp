<%@ include file="Header.jsp" %>
<h1>ADMIN PAGE
</h1>
<HR>
<c:if test="${pageContext.request.userPrincipal.name=='admin@gmail.com'}">
<a href="CustomerQuery">View Customer Query</a><span class="badge">${Customer}</span>
<br>

<a href="Product">Add Product</a>
</c:if>















<%@include file="Footer.jsp" %>