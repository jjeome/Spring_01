package com.yedam.java.todo.service;

import java.util.List;

public interface TodoService {
	//등록
	public int insertTodo(ToDoVO todoVO);
	
	//조회
	public List<ToDoVO> getTodoList();
	
	//삭제
	public int deleteTodo(ToDoVO todoVO);
	
	//수정
	public int updateTodo()
	
}