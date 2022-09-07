<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>�Խ���</title>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>
</head>
<body>
	<header>
		<tiles:insertAttribute name="header"></tiles:insertAttribute>
	</header>
		<main>
			<tiles:insertAttribute name="main"></tiles:insertAttribute>
		</main>
		<footer>
			<div id="footer">
				<h2 class="skip">ī�Ƕ���Ʈ</h2>
				<div id="address">
		<address>
		<span class="bold">(��)�������������б�</span> �뱸������ �߱� �߾Ӵ�� 403 (���ϵ� 135-1, 5��)				
		<span class="colorCCC">/</span>
		<span class="bold">��ǥ��</span>:������		
			<span class="colorCCC">/</span>
		<span class="bold">����ڹ�ȣ</span>:504-86-00471						
		<span class="colorCCC">/</span>
		<span class="bold">Tel</span>:053-421-2460			
		<span class="colorCCC">/</span>
		<span class="bold">Fax</span>:053-356-3939	
		</address>
		<p>
		<span class="bold">��ǥ E-mail</span>:ask@yedam.ac	
		<span class="colorCCC">/</span>
		<span class="bold">����������ȣå����</span>:������ (ask@yedam.ac)			</p>

		<p>Copyright &copy; 2009 <span>(��)�������������б�</span> All Rights Reserved.</p>
		</footer>
</body>
</html>