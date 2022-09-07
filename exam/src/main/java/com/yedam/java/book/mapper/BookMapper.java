package com.yedam.java.book.mapper;

import java.util.List;

import com.yedam.java.book.service.BookVO;

public interface BookMapper {
	public int insert(BookVO bookVO);
	public List<BookVO> allBookList();
	public BookVO getBookNo();
}
