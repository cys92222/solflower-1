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

SOLYI BOARD PAGE
<div>
<table>
	<thead>
		<tr>
			<th>카테고리 코드</th>	
			<th>카테고리 이름</th>	
		</tr>
	</thead>
	<tbody>
		<c:forEach  var="a" items="${categoryList}">
			<tr>
				<td>${a.CATEGORY_CODE }</td>
				<td>${a.CATEGORY_NAME}</td>
			<tr>
		</c:forEach>
	</tbody>
</table>
<input type=button value="글쓰기" OnClick="window.location='/sol/addCategory'"></td>

</div>
</body>
</html>