package com.yedam.java.product.service;

import java.util.List;

public interface ProductService {
	//상품 번호 조회
	public int getProductNo();
	
	//상품 등록
	public int insertProduct(ProductVO proVO);
	
	//상품 목록 조회
	public List<ProductVO> selectProductList();
	
	//매출 현황 조회
	public List<SalesVO> selectSalesList();
}
