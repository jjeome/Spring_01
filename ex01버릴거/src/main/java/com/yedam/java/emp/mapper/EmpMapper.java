package com.yedam.java.emp.mapper;

import java.util.List;

import com.yedam.java.emp.service.EmpVO;

//mybatis가 scan해서 해당 bean을 만들거라서 별도의 어노테이션 필요 없음
//사용하고자 하는 sql에 대응되는 메소드 만들면 됨
public interface EmpMapper {
	public List<EmpVO> getEmpList();
	
}
