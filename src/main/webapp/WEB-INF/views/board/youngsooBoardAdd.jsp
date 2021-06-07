<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
$(function(){
	
})

function add_btn_click(){
	$("#add_form").submit();
}

function list_btn_click(){
	window.location.href = "/youngsooBoardList";
}
</script>
<title>게시물 등록</title>
</head>
<body>
	<form action="/youngsooBoardAdd" method="get" id="add_form" >
		<label for="TITLE">제목</label>
		<input type="text" id="TITLE" name="TITLE" required="required"><br>
		<label for="USER_NO">작성자</label>
		<input type="text" id="USER_NO" name="USER_NO" readonly="readonly"><br>
		<select name="CATEGORY_CODE"  required="required">
			<option value="F_01">자유게시판</option>
			<option value="F_02">질문게시판</option>
		</select><br>
		<p>내용</p><br>
		<textarea rows="10" cols="100" name="CONTENT" required="required"></textarea><br>
		<button type="button" id="add_btn" onclick="add_btn_click()">등록</button>
		<button type="button" id="list_btn" onclick="list_btn_click()">게시물 리스트로 돌아가기</button>
	</form>
</body>
</html>