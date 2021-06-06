<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1">
<c:forEach items="${boardList }" var="list">
	<TR>
		<TD>글번호 ${list.BOARD_NO }</TD>
		<TD>카테고리 ${list.CATEGORY_CODE }</TD>
		<TD>작성일 ${list.CREATE_DATE }</TD>
		<TD>회원번호 ${list.USER_NO }</TD>
		<TD>제목 ${list.TITLE }</TD>
		<TD>내용 ${list.CONTENT }</TD>
	</TR>
	
</c:forEach>
</table>
</body>
</html>