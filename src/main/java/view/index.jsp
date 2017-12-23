<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		double num = Math.random();
		if (num > 0.95) {
	%>
	<h2>You'll have a luck day!</h2>
	<p>
		(<%=num%>)
	</p>
	<%
		} else {
	%>
	<h2>Well, life goes on ...</h2>
	<p>
		(<%=num%>)
	</p>
	<%
		}
	%>
	<a href="<%=request.getRequestURI()%>"><h3>Try Again</h3></a>

</body>
</html>