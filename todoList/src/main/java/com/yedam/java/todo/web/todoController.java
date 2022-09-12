package com.yedam.java.todo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yedam.java.todo.service.ToDoVO;
import com.yedam.java.todo.service.TodoService;

@RestController
@CrossOrigin(origins = "https://192.168.35.88:8088")
public class todoController {
	
	@Autowired
	TodoService service;
	
	//전체조회
	@RequestMapping("/todo")
	public List<ToDoVO> getTodoList(){
		return service.getTodoList();
	}
	
	//등록
	@PostMapping("/todo")
	public ToDoVO insertTodo(@RequestBody ToDoVO todoVO) {
		service.insertTodo(todoVO);
		return todoVO;
	}
	
	//삭제
	@DeleteMapping("/todo/{todoId}")
	public ToDoVO deleteTodo(@PathVariable String todoId) {
		ToDoVO todoVO = new ToDoVO();
		todoVO.setTodoId(todoId);
		service.deleteTodo(todoVO);
		return todoVO;
	}

}
