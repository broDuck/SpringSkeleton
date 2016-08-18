<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>Home</title>
	
	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery/dist/jquery.min.js"></script>
	
	<script>
		console.log("${pageContext.request.contextPath}");
		
		$(document).ready(function() {
			$("p").html("hello");
		});
	</script>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
