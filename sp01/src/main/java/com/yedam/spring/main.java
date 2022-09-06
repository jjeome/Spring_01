package com.yedam.spring;

import org.springframework.context.support.GenericXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		//xml파일을 읽는 순간 bean이 생기고 이걸 들고있다가 클래스 요청시 넘겨줌
		//new 연산자 안썼음
		
		//이름 형식
		TV tv1 = (TV)ctx.getBean("TV");
		
		//클래스 형식
		TV tv = (TV)ctx.getBean(SamsungTv.class);
		
		tv.on();
		tv1.on();
	}

}
