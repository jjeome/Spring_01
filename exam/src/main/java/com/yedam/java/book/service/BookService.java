package com.yedam.java.book.service;

import java.util.List;

public interface BookService {
	public int insert(BookVO bookVO);
	public List<BookVO> allBookList();
	public int getBookNo();
}
