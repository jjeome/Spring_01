package com.yedam.java.todo.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.java.todo.mapper.TodoListMapper;
import com.yedam.java.todo.service.TodoService;
import com.yedam.java.todo.service.TodoVO;

@Service
public class TodoServiceImpl implements TodoService {
	
	@Autowired
	TodoListMapper mapper;
	
	
	@Override
	public int todoInsert(TodoVO todoVO) {
		return mapper.todoInsert(todoVO);
	}

	@Override
	public List<TodoVO> todoSelect() {
		return mapper.todoSelect();
	}

	@Override
	public int todoDelete(TodoVO todoVO) {
		return mapper.todoDelete(todoVO);
	}

	@Override
	public int todoUpdate(TodoVO todoVO) {
		return mapper.todoUpdate(todoVO);
	}

}
