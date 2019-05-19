package com.uca.capas.dao;

import java.math.BigInteger;
import java.util.List;

import org.springframework.dao.DataAccessException;

import com.uca.capas.domain.Book;


public interface BookDAO {

	public List<Book> findAll() throws DataAccessException;
	public Book findOne(Integer codigo) throws DataAccessException;
	public BigInteger availableAuthors() throws DataAccessException;
	public BigInteger sumStock() throws DataAccessException;
	public List<Book> findByGenre(String genero) throws DataAccessException;
	public List<Book> findByAuthor(String autor) throws DataAccessException;
	public List<Book> findByisbn(String isbn) throws DataAccessException;
	public BigInteger countBooks(String autor) throws DataAccessException;
	public BigInteger countBooksByGen( String gen) throws DataAccessException;
	public BigInteger countBooksByisbn(String isbn) throws DataAccessException;
}
