package com.yedam.junit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Restaurant {
	//레스토랑의 필드로 등록
	@Autowired
	Chef chef;
	
	public void open() {
		chef.cooking();
	}
}
