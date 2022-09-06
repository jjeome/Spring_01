package com.yedam.java.user.service;

import java.util.List;

import lombok.Data;

@Data
public class UserListVO {
	//UserVO로 값을 받기위해 하나의 VO를 더 받는 것
	private List<UserVO> list;
}
