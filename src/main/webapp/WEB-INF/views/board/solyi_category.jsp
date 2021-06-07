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

카테고리 목록
<div>
<table>
	<thead>
		<tr>
			<th>카테고리 코드</th>	
			<th>카테고리 이름</th>	
		</tr>
	</thead>
	<tbody>
		<c:forEach  var="item" items="${categoryList}">
			<tr>
				<td>${item.CATEGORY_CODE}</td>
				<td>${item.CATEGORY_NAME}</td>
			<tr>
		</c:forEach>
	</tbody>
</table>
<input type=button value="카테고리 추가" OnClick="window.location='/sol/addCategory'"></td>
<!-- 추후 jquery 로 변경 -->
</div>
</body>
</html>