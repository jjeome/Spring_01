<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>도서번호</th>
				<th>도서명</th>
				<th>표지</th>
				<th>출판일자</th>
				<th>금액</th>
				<th>출판사</th>
				<th>도서소개</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="book" items="${bookList }">
			<tr>
				<td>${book.bookNo }</td>
				<td>${book.bookName }</td>
				<td><img src="<c:url value="/resources/images/${book.bookCoverImg }"/>" alt="이미지"></td>
				<td><fmt:formatDate value="${book.bookDate }" pattern="YYYY/MM/DD" /></td>
				<td>${book.bookPrice }</td>
				<td>${book.bookPublisher }</td>
				<td>${book.bookInfo }</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>