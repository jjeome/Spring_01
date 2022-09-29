package com.yedam.java.test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.yedam.java.test.mapper.AaaMapper;
import com.yedam.java.test.service.AaaService;

public class AaaServiceImpl implements AaaService {
	@Autowired
	AaaMapper mapper;

	@Transactional
	@Override
	public void insert() {
		mapper.insert("101");
		mapper.insert("°ª");
	}
	
	
}
