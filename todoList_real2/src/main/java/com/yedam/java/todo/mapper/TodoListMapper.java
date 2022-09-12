package com.yedam.java.todo.mapper;

import java.util.List;

import com.yedam.java.todo.service.TodoVO;

public interface TodoListMapper {
	
	public int todoInsert(TodoVO todoVO);
	
	public List<TodoVO> todoSelect();
	
	public int todoDelete(TodoVO todoVO);
	
	public int todoUpdate(TodoVO todoVO);
}
