package com.yedam.java.emp.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yedam.java.emp.service.EmpService;
import com.yedam.java.emp.service.EmpVO;

//view�� �ƴ϶� data�� ������ (rest����)
@RestController
//동일한 출처를 통해서 들어오는 것이 아닌, 외부에 대한 요청을 승인하는 것 ("*"): 보안무력화 / ("주소")
@CrossOrigin(origins = "*")
public class EmpRestController {
	
	@Autowired
	EmpService service;
	
	//전체조회
	@RequestMapping("/emp")
	public List<EmpVO> empSelect(){
		return service.getEmpList();
	}
	
	//단건조회
	@GetMapping("emp/{employeeId}")
	//��ΰ��̶� pathVariable�� ���� �޾ƿ���
	public EmpVO empFind(@PathVariable String  employeeId) {
		EmpVO empVO = new EmpVO();
		empVO.setEmployeeId(employeeId);
		return service.getEmp(empVO);
	}
	
	//사원등록
	@PostMapping("/emp")
	public EmpVO empInsert(@RequestBody EmpVO empVO) {
		service.insertEmp(empVO);
		return empVO;
	}
	
	//사원 수정 - 경로에 접근하려는 사원 정보, body에 수정하려는 정보 가지고 옴
	@PutMapping("/emp/{employeeId}")
	public EmpVO empUpdate(@PathVariable String employeeId, @RequestBody EmpVO empVO) {
		empVO.setEmployeeId(employeeId);
		service.updateEmp(empVO);
		return empVO;
	}

	//삭제
	@DeleteMapping("/emp/{employeeId}")
	public EmpVO empDelete(@PathVariable String employeeId) {
		EmpVO empVO = new EmpVO();
		empVO.setEmployeeId(employeeId);
		service.deleteEmp(empVO);
		return empVO;
	}
	
	
}
