package com.yedam.java.emp.service;

import java.util.List;

import org.springframework.stereotype.Service;


@Service
public interface EmpService {
	//empService와 관련된 기능들(CRUD)
	//전체조회
	public List<EmpVO> getEmpList();

	//단건조회
	public EmpVO getEmp(EmpVO empVO); //VO의 기준으로 값을 넘겨줌
	
	//등록
	public void insertEmp(EmpVO empVO);
	
	//수정
	public void updateEmp(EmpVO empVO);
	
	//삭제
	public void deleteEmp(EmpVO empVO);
}
