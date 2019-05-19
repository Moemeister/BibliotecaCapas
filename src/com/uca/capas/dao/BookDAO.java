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
}
