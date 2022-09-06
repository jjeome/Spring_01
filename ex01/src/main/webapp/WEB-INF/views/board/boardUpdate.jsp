<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form name="updateForm" action="update" method="post" onsubmit="return false">
		<div>
			<h3>게시글 수정</h3>
		</div>
		<table>
			 <tr>
           <th>번호</th>
           <td><input type="text" name="bno" value=${board.bno } readonly></td>
       </tr>
			<tr>
				<th>제목</th>
				<td><input type="text" name="title" value=${board.title }></td>
			</tr>
			<tr>
				<th>작성자</th>
				<td><input type="text" name="writer" value=${board.writer } readonly></td>
			</tr>
			<tr>
				<th>내용</th>
				<td><textarea name="contents" >${board.contents }</textarea></td>
			</tr>
			<tr>
				<th>첨부이미지</th>
				<td><img src="<c:url value="/resources/images/${board.image }"/>" alt="이미지"></td>
			</tr>
		</table>
		<button type="submit" onclick="formUpdate()">수정</button>
		<button type="button">목록</button>
	</form>

	<script>
		function formUpdate(){
			let title = document.getElementsByName('title')[0];
			let writer = document.getElementsByName('writer')[0];
			let contents = document.getElementsByName('contents')[0];
			
			if(title.value == ""){
				title.focus();
				return
			}
			if(writer.value == ""){
				writer.focus();
			}
			if(contents.value == ""){
				contents.focus();
			}
			updateForm.submit();
		}
	</script>
</body>
</html>