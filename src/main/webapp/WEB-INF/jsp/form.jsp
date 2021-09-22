<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Rectangle Form</title>
</head>
<body>
	<h3>Rectangle Details</h3>
	<form:form action="submit" modelAttribute="rectangle">
Length:<form:input path="length" />
		<br>
		<br>
Breadth:<form:input path="breadth" />
		<br>
		<br>
		<input type="submit" value="submit" />
	</form:form>
</body>
</html>