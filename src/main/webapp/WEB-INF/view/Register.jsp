<%@ include file="Header.jsp"%>
<div>
<form:form action="add" method="post" commandName="register" modelAttribute="register">
First Name:<form:input path="firstname"/><br/>
Last Name:<form:input path="lastname"/><br/>
Email:<form:input path="email"/><br/>
password:<form:password path="password"/><br/>
<input type="submit" value="Register">
</form:form>
</div> 