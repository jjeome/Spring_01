<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table, tr, th, td {
		border : 1px solid black;
	}
</style>
</head>
<body>
	<h3>상품 조회/수정</h3>
	<table>
		<thead>
			<tr>
				<th>판매번호</th>
				<th>판매날짜</th>
				<th>상품ID</th>
				<th>판매량</th>
				<th>판매가</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${salesList }" var="sale">
				<tr>
					<td>${sale.saleSeq}</td>
				  <td><fmt:formatDate pattern="yyyy/MM/dd" value="${sale.saleDate }" /></td>
					<td>${sale.productId }</td>
					<td>${sale.saleQty }</td>
					<td>${sale.salePrice }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>