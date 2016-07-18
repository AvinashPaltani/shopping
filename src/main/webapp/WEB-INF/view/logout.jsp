 <script>
	function formSubmit() {
		document.getElementById("logout").submit();
	}
</script>
<body onload="">
 <%
               	response.setHeader("Cache-Control", "no-cache");
               		response.setHeader("Cache-Control", "no-store");
               		response.setHeader("Pragma", "no-cache");
               		if (session.getAttribute("token") == null) {
               			response.sendRedirect(request.getContextPath() + "/Login");
               		}
               %>
               </body>