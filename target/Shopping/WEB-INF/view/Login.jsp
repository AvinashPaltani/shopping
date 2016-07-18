<%@include file="Header.jsp" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<div class="col-xs-offset-2 col-xs-10">
<h2> login page </h2>
</div>

<form:form class="form-horizontal " action="isValidUser" method="post" >
    <div class="form-group">
        <label for="inputEmail" class="control-label col-xs-2">Email:</label>
        <div class="col-xs-5">
            <input type="email" class="form-control" id="inputEmail" name="name" placeholder="Email">
        </div>
    </div>
    <div class="form-group">
        <label for="inputPassword" class="control-label col-xs-2">Password:</label>
        <div class="col-xs-5">
            <input type="password" class="form-control" id="inputPassword" name="password" placeholder="Password">
        </div>
    </div>
    <div class="form-group">
        <div class="col-xs-offset-2 col-xs-10">
            <div class="checkbox">
                <label><input type="checkbox"> Remember me</label>
            </div>
        </div>
    </div>
    <div class="form-group">
        <div class="col-xs-offset-2 col-xs-10">
            <button type="submit" class="btn btn-primary">Login</button>
        </div>
    </div>
</form:form>


<%@include file="Footer.jsp" %>
<script src="https://code.jquery.com/jquery-2.1.3.min.js"></script>

    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="resources/bootstrap/js/bootstrap.min.js"></script>

