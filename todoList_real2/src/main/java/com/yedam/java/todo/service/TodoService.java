package com.yedam.java.todo.service;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface TodoService {
	//등록
	public int todoInsert(TodoVO todoVO);
	
	//조회
	public List<TodoVO> todoSelect();
	
	//삭제
	public int todoDelete(TodoVO todoVO);
	
	//수정
	public int todoUpdate(TodoVO todoVO);
	
}