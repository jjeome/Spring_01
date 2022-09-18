<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 등록</title>
<style>
	table, tr, th, td {
		border : 1px solid black;
	}
	input {
		border : 0;
		width : 400px;
	}
	button {
		margin-top : 20px;
		border : 0;
	}
</style>
</head>
<body>
	<h3>상품 등록</h3>
	<form name="productInsertForm" action="insert" method="POST" onSubmit="return false">
		<table>
			<tr>
				<td>상품 ID</td>
				<td><input type="number" name="productId" value="${productId }"
					readOnly></td>
			</tr>
			<tr>
				<td>이름</td>
				<td><input type="text" name="productName" ></td>
			</tr>
			<tr>
				<td>단가</td>
				<td><input type="number" name="productPrice" ></td>
			</tr>
			<tr>
				<td>상품정보</td>
				<td><input type="text" name="productInfo" ></td>
			</tr>
			<tr>
				<td>등록일자</td>
				<td><input type="text" name="productDate" placeholder="날짜/월/일 형식으로 적어주십시오."></td>
			</tr>
			<tr>
				<td>공급업체</td>
				<td><input type="text" name="company" ></td>
			</tr>
			<tr>
				<td>담당자</td>
				<td><input type="text" name="managerId" ></td>
			</tr>
		</table>
		<button type="button" onclick="javaseript:productInsert();">등록</button>
	</form>
	<script>
		function productInsert(){
			let productName = document.querySelector("input[name='productName']");
			
			if(productName.value == ""){
				alert("상품명이 등록되지 않았습니다.");
				productName.focus();
				return;S
			}
			
			alert("상품 등록이 완료 되었습니다.");
			productInsertForm.submit();
			
		}
	</script>
</body>
</html>