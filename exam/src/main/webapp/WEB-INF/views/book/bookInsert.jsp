<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form name="insertForm" action="insert" method=	"post" onsubmit="return false">
		<div>
			<h3>도서 등록</h3>
		</div>
		<table>
			<tr>
				<th>도서번호</th>
				<td><input type="number" name="bookNo" value="${no}" readonly></td>
			</tr>
			<tr>
				<th>도서명</th>
				<td><input type="text" name="bookName"></td>
			</tr>
			<tr>
				<th>도서표지</th>
				<td><input type="text" name="bookCoverImg"></td>
			</tr>
			<tr>
				<th>출판일자</th>
				<td><input type="Date" name="bookDate"></td>
			</tr>
			<tr>
				<th>금액</th>
				<td><input type="number" name="bookPrice"></td>
			</tr>
			<tr>
				<th>출판사</th>
				<td><input type="text" name="bookPublisher"></td>
			</tr>
			<tr>
				<th>도서소개</th>
				<td><textarea name="bookInfo"></textarea></td>
			</tr>
		</table>
		<button type="submit" onclick="fomrOption()">등록</button>
		<button type="button">조회</button>
	</form>
	<script>
		function fomrOption() {
			let bookName = document.getElementsByName("bookName")[0];
			
			if(bookName.value == ""){
				alert("도서명이 입력되지 않았습니다.");
				bookName.focus();
				return
			}
			
			insertForm.submit();
			alert("도서등록이 완료되었습니다.")
			
		}
	</script>
</body>
</html>