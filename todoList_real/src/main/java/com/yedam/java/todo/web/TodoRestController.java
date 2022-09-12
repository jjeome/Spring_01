package com.yedam.java.todo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yedam.java.todo.service.TodoVO;
import com.yedam.java.todo.service.TodoService;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5500/")
public class TodoRestController {
   
   @Autowired
   TodoService service;
   
   //전체조회
   @RequestMapping("/todoSelect")
   public List<TodoVO> getTodoList(){
      return service.todoSelect();
   }
   
   //등록
   @PostMapping("/todoInsert")
   public TodoVO insertTodo(TodoVO todoVO) {
      service.todoInsert(todoVO);
      return todoVO;
   }
   
   //삭제
   @DeleteMapping("/todoDelete/{todoId}")
   public TodoVO deleteTodo(@PathVariable int todoId) {
      TodoVO todoVO = new TodoVO();
      todoVO.setTodoId(todoId);
      service.todoDelete(todoVO);
      return todoVO;
   }
   
   //수정
   @PutMapping("/todoUpdate/{todoId}")
   public TodoVO updateTodo(@PathVariable int todoId, @RequestBody TodoVO todoVO) {
      todoVO.setTodoId(todoId);
      service.todoUpdate(todoVO);
      return todoVO;
   }

}