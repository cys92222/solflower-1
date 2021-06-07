<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

솔이 게시판
<div>
<table>
	<thead>
		<tr>
			<th>글 번호</th>	
			<th>제목</th>	
			<th>내용</th>	
			<th>작성자</th>	
			<th>작성일자</th>	
		</tr>
	</thead>
	<tbody>
		<c:forEach  var="a" items="${list}">
			<tr>
				<td>${a.BOARD_NO }</td>
				<td>${a.TITLE }</td>
				<td>${a.CONTENT }</td>
				<td>${a.NAME }</td>
				<td>${a.CREATE_DATE}</td>
			<tr>
		</c:forEach>
	</tbody>

</table>
</div>
</body>
</html>