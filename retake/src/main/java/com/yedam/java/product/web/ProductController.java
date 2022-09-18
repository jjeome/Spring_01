package com.yedam.java.product.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yedam.java.product.service.ProductService;
import com.yedam.java.product.service.ProductVO;

@Controller
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	ProductService service;
	
	//상품 등록폼
	@GetMapping("/insert")
	public String productInsertForm(Model model) {
		model.addAttribute("productId", service.getProductNo());
		return "product/insert";
	}
	
	//상품 등록
	@PostMapping("/insert")
	public String productInsert(ProductVO productVO) {
		service.insertProduct(productVO);
		return "redirect:list";
	}
	
	//상품 목록 조회
	@GetMapping("/list")
	public String productList(Model model) {
		model.addAttribute("productList", service.selectProductList());
		return "product/list";
	}
	
	//매출 현황 조회
	@GetMapping("/saleslist")
	public String saleList(Model model) {
		model.addAttribute("salesList", service.selectSalesList());
		return "product/saleslist";
	}
	

}
