<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script>

</script>
</head>
<body>


카테고리 추가 페이지
<div>

<form method="post" action="/sol/insertCategory" name="insertCategory">
	
	<label for="category_code">코드명</label>
	<input name="category_code" id="category_code">
	<label for="category_name">이름</label>
	<input name="category_name" id="category_code">
	<input type="submit">
</form>
</div>
</body>
</html>