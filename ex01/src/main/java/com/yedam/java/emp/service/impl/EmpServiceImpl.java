package com.yedam.java.emp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.java.emp.mapper.EmpMapper;
import com.yedam.java.emp.service.EmpService;
import com.yedam.java.emp.service.EmpVO;

@Service
public class EmpServiceImpl implements EmpService {

	//별다른 연산은 없음	
	
	@Autowired
	EmpMapper empMapper;
	
	
	@Override
	//값을 받아온걸 반환만 해주면 되는 역할
	public List<EmpVO> getEmpList() {
		return empMapper.getEmpList();
	}

	@Override
	public EmpVO getEmp(EmpVO empVO) {
		return empMapper.getEmp(empVO);
	}

	@Override
	public void insertEmp(EmpVO empVO) {
		empMapper.insertEmp(empVO);
	}

	@Override
	public void updateEmp(EmpVO empVO) {
		empMapper.updateEmp(empVO);
	}

	@Override
	public void deleteEmp(EmpVO empVO) {
		empMapper.deleteEmpInfo(Integer.parseInt(empVO.getEmployeeId()));
	}

}
