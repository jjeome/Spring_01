<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시글 작성</title>
</head>
<body>
	<!-- 자바스크립트에서 form태그는 name을 붙여준 form은 알아서 제어함 -->
	<form name="insertForm" action="insert" method="post" onsubmit="return false">
		<div>
			<h3>게시글 등록</h3>
		</div>
		<table>
			<tr>
				<th>번호</th>
				<td><input type="number" name="bno" value="${ no } readonly"></td>
			</tr>
			<tr>
				<th>제목</th>
				<td><input type="text" name="title"></td>
			</tr>
			<tr>
				<th>작성자</th>
				<td><input type="text" name="writer"></td>
			</tr>
			<tr>
				<th>내용</th>
				<td><textarea name="contents"></textarea></td>
			</tr>
			<tr>
				<th>첨부이미지</th>
				<td><input type="text" name="image"></td>
			</tr>
		</table>
		<button type="submit" onclick="formOption()">등록</button>
		<button type="button">목록</button>
	</form>
	<script>
		//등록버튼 누르면 submit바로 실행하지 않고 작업한 후에 submit되도록 함
		function formOption(){
			let title = document.getElementsByName('title')[0];
			let writer = document.getElementsByName('writer')[0];
			let contents = document.getElementsByName('contents')[0];
			
			if(title.value == ""){
				alert("제목이 입력되지 않았습니다.")
				title.focus();
				return
			} 
			if(writer.value == ""){
				alert("작성자가 입력되지 않았습니다.")
				writer.focus();
			}
			if(contents.value == ""){
				alert("내용이 입력되지 않았습니다.")
				contents.focus();
			}
			
			insertForm.submit();
		}
	</script>
</body>