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
				<th>상품ID</th>
				<th>이름</th>
				<th>단가</th>
				<th>담당자</th>
				<th>등록일자</th>
				<th>공급업체</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${productList }" var="product">
				<tr>
					<td>${product.productId}</td>
					<td>${product.productName }</td>
					<td>${product.productPrice }</td>
					
					<td>
					<c:if test="${product.managerId eq 'E201'}">
						김사원
					</c:if>
					<c:if test="${product.managerId ne 'E201'}">
						이대리
					</c:if>
					</td> 
					
					<td><fmt:formatDate pattern="yyyy/MM/dd" value="${product.productDate }" /></td>
					<td>${product.company }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>