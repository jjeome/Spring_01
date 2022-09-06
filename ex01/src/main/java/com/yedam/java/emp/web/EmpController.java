package com.yedam.java.emp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yedam.java.emp.service.EmpService;
import com.yedam.java.emp.service.EmpVO;

@Controller
//class에도 경로 추가 가능
@RequestMapping("/emp")
public class EmpController {
	
	@Autowired
	EmpService empService;
	//등록
	
	
	//전체조회
	//get방식으로만 호출 가능
	@GetMapping("/allList") //java/emp/allList
	public String getEmpList(Model model) {
		//model에 값 담아야함 -> view에 넘겨줄 변수 이름, 실제값 -> views로 넘겨줌 -> dispatcherServlet에서 해당 경로에있는 데이터를 불러와서 파싱
		model.addAttribute("empList", empService.getEmpList());
		//emp 폴더 안의 empList jsp파일
		return "emp/empList";
	}
	
	
	//조회
	@GetMapping("/getInfo")
	//값을 반환해야 하니까 model써줘야함, empVO 넘겨줘야 해서 매개변수에도 넣어줘야함
	public String getEmpInfo(Model model, EmpVO empVO) {
		model.addAttribute("empInfo", empService.getEmp(empVO));
		return "emp/empInfo";
	}
	
	//수정 -POST방식으로
	@PostMapping("/updateInfo")
	public String updateEmpInfo(EmpVO empVO) {
		empService.updateEmp(empVO);
//		view가 아니라는 것을 redirect: 이걸로 알려줌
		return "redirect:allList";
	}
	
	
	//삭제
	//{}안에 값을 넣어주는 방식이 PathVariable임
	@GetMapping("/deleteInfo/{employeeId}")
	public String deleteEmpInfo(@PathVariable String employeeId) {
		EmpVO empVO = new EmpVO();
		empVO.setEmployeeId(employeeId);
		empService.deleteEmp(empVO);
		return "redirect:/emp/allList";
	}
	
	//등록 -view만 요청
	@GetMapping("/insertForm")
	public String insertEmpForm() {
		return "emp/impInsert";
	}
	
	//입력한걸 넘겨받는 
	@PostMapping("/insertInfo")
	public String insertEmpInfo(EmpVO empVO) {
		empService.insertEmp(empVO);
		return "redirect:allList";
	}
}
