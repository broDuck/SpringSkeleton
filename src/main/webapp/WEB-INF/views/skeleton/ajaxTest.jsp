<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ include file="../include/header.jsp" %>

<title>ajaxTest</title>

 <script>

	$(document).ready(function() {
		
		$.ajax({
			url: '/skeleton/readAjaxTest',
			method: 'post',
			contentType: "application/json",
			data: JSON.stringify({
				integer: 123,
				string: "sdaffsdaf"
			}),
			success: function(res) {
				console.log(res);
				$("#response").html(JSON.stringify(res));
			}
		});
	});
 </script>

</head>
<body>

<span id="response">hello</span>


</body>
</html>