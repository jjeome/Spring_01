package com.yedam.java.product.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.java.product.mapper.ProductMapper;
import com.yedam.java.product.service.ProductService;
import com.yedam.java.product.service.ProductVO;
import com.yedam.java.product.service.SalesVO;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductMapper mapper;

	@Override
	public int getProductNo() {
		return mapper.getProductNo();
	}

	@Override
	public int insertProduct(ProductVO proVO) {
		return mapper.insertProduct(proVO);
	}

	@Override
	public List<ProductVO> selectProductList() {
		return mapper.selectProductList();
	}

	@Override
	public List<SalesVO> selectSalesList() {
		return mapper.selectSalesList();
	}

}
