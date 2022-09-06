package com.yedam.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yedam.junit.Restaurant;

//테스트 컨테이너가 필요하면 두개의 어노테이션 추가하기
//spring-test가 제공하는 anotation class로 추가
@RunWith(SpringJUnit4ClassRunner.class)
//참고할 context , 빈 설정 파일의 위치를 지정할 때 사용되는 어노테이션
//classpath를 바로 쓴 이유는 resources 바로 안에 applicationContext있기 때문에 
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TestClass {
	
	@Autowired
	ApplicationContext ctx;
	
	@Autowired
	Restaurant res;
	
	// 실행
	@Test
	//컨테이너가 필요하지않고 단순히 동작만 하려면 test메서드만 추가해도 사용 가능
	public void beanTest() {
		Restaurant res = ctx.getBean(Restaurant.class);
		res.open();
	}
	
}
