package com.yedam.java.todo.mapper;

import java.util.List;

import com.yedam.java.todo.service.ToDoVO;

public interface TodoListMapper {
	//등록
		public int insertTodo(ToDoVO todoVO);
		
		//조회
		public List<ToDoVO> getTodoList();
		
		//삭제
		public int deleteTodo(ToDoVO todoVO);
}
