package com.yedam.java.user.web;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.yedam.java.user.service.UserListVO;
import com.yedam.java.user.service.UserVO;

@Controller
public class UserController {
	
//	@RequestMapping("/inputForm")
	@RequestMapping(value="inputForm", method= {RequestMethod.GET, RequestMethod.POST})
	public String inputForm() {
		//받는 것도 없고 단순히 문자형태로 반환 
		// -> view페이지 호출할때 방식
		//dispatcherServlet으로 보냄
		return "inputForm";
	}
	
	//경로 매핑 -> 지정된 view
	@RequestMapping("/users") //GetMapping : value="/", method=RequestMethod.GET
	//경로에 매칭된 메소드가 실행이 됨-> 필드로 들어온 값들로 작동됨
	//숫자를 string으로 받을 수 있음 -> ""안에
	//받는 애들은 필드값을 가지는 객체형태여야함
	//public String pocess(UserVO userVO) {
	
	//저쪽에서 보내온 경로에서 해당값을 매개변수에 넣어줌
	//주의 : 보내온 필드명과 매개변수 이름이 같아야함
	// 다를경우 : requestParam에 내가 가지고 오려는 값을 정해줘야함 @RequestParam("name") 형식
	//객체의 형태가 아닌 개별적으로 값을 받을 때 @RequestParam 사용
//	public String process(@RequestParam String name,@RequestParam int age) {
//		System.out.println(userVO.getName());
//		System.out.println(userVO.getAge());
	
	//map방식 이용 -> key값으로 String, value는 object나 integer, double 등 사용
	//vo형식은 아니지만 간단한 형식으로 여러값 받을 수 있음
	public String process(@RequestParam Map<String, Object> map) {
		System.out.println(map.get("name") + ", "+ map.get("age"));
		return "";
	}
	
	@RequestMapping("/nameList")
	public String nameProcess(@RequestParam List<String> name) {
		for(String temp : name) {
			System.out.println(temp);
		}
		return "";
	}
	
	
	@RequestMapping("/userList")
	public String listProcess(UserListVO userListVO) {
		List<UserVO> userList = userListVO.getList();
		for(UserVO vo : userList) {
			System.out.println(vo.getName() + ", "+ vo.getAge());
		}
		return "";
	}
}
