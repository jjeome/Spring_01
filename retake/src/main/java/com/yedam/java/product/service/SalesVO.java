package com.yedam.java.product.service;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class SalesVO {
	private int saleSeq;
	@DateTimeFormat(pattern="yy/MM/dd")
	private Date saleDate;
	private int productId;
	private int saleQty;
	private int salePrice;
	private String memberId;
}
