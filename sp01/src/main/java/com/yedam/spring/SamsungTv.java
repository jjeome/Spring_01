package com.yedam.spring;

import org.springframework.stereotype.Component;

//tv��� �̸����� �� ���
@Component("tv")
public class SamsungTv implements TV{
	
	public void on() {
		System.out.println("spring �������");
	}
}
