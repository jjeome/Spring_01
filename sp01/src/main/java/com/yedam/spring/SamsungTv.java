package com.yedam.spring;

import org.springframework.stereotype.Component;

//tv라는 이름으로 빈 등록
@Component("tv")
public class SamsungTv implements TV{
	
	public void on() {
		System.out.println("spring 방식으로");
	}
}
