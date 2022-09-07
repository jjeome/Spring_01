package com.yedam.java.book.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.java.book.mapper.BookMapper;
import com.yedam.java.book.service.BookService;
import com.yedam.java.book.service.BookVO;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	BookMapper mapper;
	
	@Override
	public int insert(BookVO bookVO) {
		return mapper.insert(bookVO);
	}

	@Override
	public List<BookVO> allBookList() {
		return mapper.allBookList();
	}

	@Override
	public int getBookNo() {
		BookVO vo = mapper.getBookNo();
		return vo.getBookNo();
	}
	
	

	
}
