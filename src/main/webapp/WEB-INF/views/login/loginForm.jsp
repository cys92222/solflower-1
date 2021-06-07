<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
$(function(){
	var msg = "${msg}";
	if(msg != "test"){
		alert(msg);
	}
})
</script>
<title>로그인</title>
</head>
<body>
<form action="/login" method="post">
	<label for="USER_ID">아이디</label>
	<input type="text" id="USER_ID" name="USER_ID" required="required" placeholder="아이디"><br>
	<label for="USER_PW">비밀번호</label>
	<input type="password" id="USER_PW" name="USER_PW" required="required" placeholder="비밀번호"><br>
	<button type="submit">로그인</button>
</form>
</body>
</html>