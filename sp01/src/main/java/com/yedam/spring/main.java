package com.yedam.spring;

import org.springframework.context.support.GenericXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		//xml������ �д� ���� bean�� ����� �̰� ����ִٰ� Ŭ���� ��û�� �Ѱ���
		//new ������ �Ƚ���
		
		//�̸� ����
		TV tv1 = (TV)ctx.getBean("TV");
		
		//Ŭ���� ����
		TV tv = (TV)ctx.getBean(SamsungTv.class);
		
		tv.on();
		tv1.on();
	}

}
