<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시물 목록</title>
</head>
<body>
<h1>게시물</h1>
<span>
	<c:if test="${not empty USER_ID  }">
		${USER_ID } 님 안녕하세요.
		<a href="/logout">로그아웃</a><br>
	</c:if>
	<c:if test="${empty USER_ID  }">
		<a href="/loginForm">로그인</a><br>
	</c:if>
</span>
<section id="boardListSection">
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
</section><br>
<section id="btnSection">

</section>
</body>
</html>