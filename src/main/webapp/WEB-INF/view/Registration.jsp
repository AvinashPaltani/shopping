
<%@include file="Header.jsp"%>


<div class="container" id="wrap">
	<div class="row">

		<div class="col-md-6 col-md-offset-3">
			<div>Sign Up</div>
			<h4>It's free and always will be.</h4>
			 <form:form action="add" method="post" commandName="register">
				<div class="row">
					<div class="col-xs-6 col-md-6">
						
					<input type="text" name="firstname" value="" class="form-control input-lg" placeholder="First Name"  />                
					</div>
					<div class="col-xs-6 col-md-6">
						<input type="text" name="lastname" value=""
							class="form-control input-lg" placeholder="Last Name" />
					</div>
				</div>
				<input type="text" name="email" value=""
					class="form-control input-lg" placeholder="Your Email" />
				<input type="password" name="password" value=""
					class="form-control input-lg" placeholder="Password" />
				
					 <br /> <span class="help-block">By clicking Create my
						account, you agree to our Terms and that you have read our Data
						Use Policy, including our Cookie Use.</span>
					<button class="btn btn-lg btn-primary btn-block signup-btn"
						type="submit">Create my account</button>
       </form:form>
 
        
 				</div>
		</div>
	</div>



	