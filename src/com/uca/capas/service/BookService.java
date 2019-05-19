package com.uca.capas.service;

import java.math.BigInteger;
import java.util.List;


import com.uca.capas.domain.Book;

public interface BookService {

	public List<Book> findAll();
	public Book findOne(Integer codigo);
	public BigInteger availableAuthors();
	public BigInteger sumStock();
	public List<Book> findByGenre(String genero);
	public List<Book> findByAuthor(String autor);
	public List<Book> findByisbn(String isbn);
	public BigInteger countBooks(String autor);
	public BigInteger countBooksByGen(String gen);
	public BigInteger countBooksByisbn(String isbn);
}
