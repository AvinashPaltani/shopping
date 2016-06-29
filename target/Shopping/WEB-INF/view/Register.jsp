<%@ include file="Header.jsp"%>
<div>
<form:form action="add" method="post" commandName="register">
<form:input path="firstname"/>
<form:input path="lastname"/>
<form:input path="email"/>
<form:input path="gender"/>
<form:input path="birthDate"/>
</form:form>
</div> 