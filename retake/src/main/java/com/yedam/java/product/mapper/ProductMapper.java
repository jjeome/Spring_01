package com.yedam.java.product.mapper;

import java.util.List;

import com.yedam.java.product.service.ProductVO;
import com.yedam.java.product.service.SalesVO;

public interface ProductMapper {
	//상품 번호 조회
	public int getProductNo();
	
	//상품 등록
	public int insertProduct(ProductVO proVO);
		
	//상품 목록 조회
	public List<ProductVO> selectProductList();
		
	//매출 현황 조회
	public List<SalesVO> selectSalesList();
}
