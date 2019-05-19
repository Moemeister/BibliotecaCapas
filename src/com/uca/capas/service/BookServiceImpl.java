package com.uca.capas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.uca.capas.dao.BookDAO;
import com.uca.capas.domain.Book;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	BookDAO bookDao;
	
	@Override
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		return bookDao.findAll();
	}

	@Override
	public Book findOne(Integer codigo) {
		// TODO Auto-generated method stub
		return bookDao.findOne(codigo);
	}

}
