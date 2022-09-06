package com.yedam.java.emp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yedam.java.emp.mapper.EmpMapper;
import com.yedam.java.emp.service.EmpVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/*-context.xml")
public class EmpTest {
	
	@Autowired
	EmpMapper empMapper;
	
	//전체조회

	public void empListTest() {
		List<EmpVO> findList = empMapper.getEmpList();
		for(EmpVO findVO : findList) {
			System.out.println(findVO.getLastName());
		}
	}
	
	//단건조회
	@Test
	public void empInfoTest() {
		EmpVO info = new EmpVO();
		info.setEmployeeId("149");
		EmpVO findVO = empMapper.getEmp(info);
		assertNotNull(findVO.getEmail());
	}
	
	//등록
	public void empInsertTest() {
		EmpVO info = new EmpVO();
		info.setFirstName("윤권");
		info.setLastName("신");
		info.setEmail("hke@naver.com");
		info.setJobId("IT_PROG");
		info.setSalary("100000");
		//mapper반환되는 것도 없음
		empMapper.insertEmp(info);
		assertEquals(info.getEmployeeId(), "9999999");
	}
	
	//수정
	public void empUpdateSalaryTest() {
		int result = empMapper.updateSalary(100);
		assertEquals(result, 1);
	}
	
	
	public void updateEmpInfo() {
		EmpVO info = new EmpVO();
		info.setFirstName("현정");
		/* info.setLastName(); */
		info.setEmail("melong");
		info.setEmployeeId("100");
		
		int result = empMapper.updateEmp(info);
		assertEquals(result, 1);
	}
}











