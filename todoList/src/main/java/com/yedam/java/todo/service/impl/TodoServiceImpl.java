package com.yedam.java.todo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.java.todo.mapper.TodoListMapper;
import com.yedam.java.todo.service.ToDoVO;
import com.yedam.java.todo.service.TodoService;

@Service
public class TodoServiceImpl implements TodoService{
	@Autowired
	TodoListMapper mapper;

	
	@Override
	public int insertTodo(ToDoVO todoVO) {
		return mapper.insertTodo(todoVO);
	}

	@Override
	public List<ToDoVO> getTodoList() {
		return mapper.getTodoList();
	}

	@Override
	public int deleteTodo(ToDoVO todoVO) {
		return mapper.deleteTodo(todoVO);
	}
	
	
	
}
