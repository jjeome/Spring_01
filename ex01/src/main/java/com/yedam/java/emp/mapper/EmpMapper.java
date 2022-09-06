package com.yedam.java.emp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yedam.java.emp.service.EmpVO;

//mybatis가 scan해서 해당 bean을 만들거라서 별도의 어노테이션 필요 없음
//사용하고자 하는 sql에 대응되는 메소드 만들면 됨
public interface EmpMapper {
	//보통 VO를 담아옴
	
	
	//전체조회
	public List<EmpVO> getEmpList();
	
	//단건조회 : 조회조건 - EmpVO
	public EmpVO getEmp(EmpVO empVO);
	
	//등록
	public int insertEmp(EmpVO empVO);
	
	
	//수정
	/* public int updateSalary(int employeeId); */
	// param뒤의 값이 매개변수로 넘어감
	public int updateSalary(@Param("empId")int employeeId);
	
	//수정 : 사원정보를 넘겨받아서 이름, 성, 이메일을 수정할 수 있는 메서드
	public int updateEmp(EmpVO empVO);
	
	/*
	 * //랜덤으로 이름, 성, 이메일 넘겨받아서 수정 public int updateRandom(EmpVO empVO) {
	 * 
	 * };
	 */
	
	//삭제
	public int deleteEmpInfo(int employeeId);
}










