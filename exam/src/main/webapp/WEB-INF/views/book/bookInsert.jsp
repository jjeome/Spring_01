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
			<h3>���� ���</h3>
		</div>
		<table>
			<tr>
				<th>������ȣ</th>
				<td><input type="number" name="bookNo" value="${no}" readonly></td>
			</tr>
			<tr>
				<th>������</th>
				<td><input type="text" name="bookName"></td>
			</tr>
			<tr>
				<th>����ǥ��</th>
				<td><input type="text" name="bookCoverImg"></td>
			</tr>
			<tr>
				<th>��������</th>
				<td><input type="Date" name="bookDate"></td>
			</tr>
			<tr>
				<th>�ݾ�</th>
				<td><input type="number" name="bookPrice"></td>
			</tr>
			<tr>
				<th>���ǻ�</th>
				<td><input type="text" name="bookPublisher"></td>
			</tr>
			<tr>
				<th>�����Ұ�</th>
				<td><textarea name="bookInfo"></textarea></td>
			</tr>
		</table>
		<button type="submit" onclick="fomrOption()">���</button>
		<button type="button">��ȸ</button>
	</form>
	<script>
		function fomrOption() {
			let bookName = document.getElementsByName("bookName")[0];
			
			if(bookName.value == ""){
				alert("�������� �Էµ��� �ʾҽ��ϴ�.");
				bookName.focus();
				return
			}
			
			insertForm.submit();
			alert("��������� �Ϸ�Ǿ����ϴ�.")
			
		}
	</script>
</body>
</html>