package com.uca.capas.service;

import java.util.List;


import com.uca.capas.domain.Book;

public interface BookService {

	public List<Book> findAll();
	public Book findOne(Integer codigo);
}
