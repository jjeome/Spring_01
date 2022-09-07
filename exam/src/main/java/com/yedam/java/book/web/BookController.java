package com.yedam.java.book.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import com.yedam.java.book.service.BookService;
import com.yedam.java.book.service.BookVO;

@Controller
public class BookController {
	
	@Autowired
	BookService service;
	
	//전체조회
	@GetMapping("/list")
	public String allBookList(Model model) {
		model.addAttribute("bookList", service.allBookList());
		return "book/bookList";
	}
	
	//등록 -db insert
	@PostMapping("/insert")
	public String insertBook(BookVO bookVO) {
		service.insert(bookVO);
		//도서 리스트 조회로 넘거가기
		return "redirect:list";
	}
	
	//등록 -입력폼
	@GetMapping("/insert")
	public String insertBookForm(Model model) {
		model.addAttribute("no", service.getBookNo());
		//뷰만 처리
		return "book/bookInsert";
	}
}
