package com.yedam.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yedam.junit.Restaurant;

//�׽�Ʈ �����̳ʰ� �ʿ��ϸ� �ΰ��� ������̼� �߰��ϱ�
//spring-test�� �����ϴ� anotation class�� �߰�
@RunWith(SpringJUnit4ClassRunner.class)
//������ context , �� ���� ������ ��ġ�� ������ �� ���Ǵ� ������̼�
//classpath�� �ٷ� �� ������ resources �ٷ� �ȿ� applicationContext�ֱ� ������ 
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class TestClass {
	
	@Autowired
	ApplicationContext ctx;
	
	@Autowired
	Restaurant res;
	
	// ����
	@Test
	//�����̳ʰ� �ʿ������ʰ� �ܼ��� ���۸� �Ϸ��� test�޼��常 �߰��ص� ��� ����
	public void beanTest() {
		Restaurant res = ctx.getBean(Restaurant.class);
		res.open();
	}
	
}
