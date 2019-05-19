package com.uca.capas.service;

import java.math.BigInteger;
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

	@Override
	public BigInteger availableAuthors() {
		// TODO Auto-generated method stub
		return bookDao.availableAuthors();
	}

	@Override
	public BigInteger sumStock() {
		// TODO Auto-generated method stub
		return bookDao.sumStock();
	}

	@Override
	public List<Book> findByGenre(String genero) {
		// TODO Auto-generated method stub
		return bookDao.findByGenre(genero);
	}

	@Override
	public List<Book> findByAuthor(String autor) {
		// TODO Auto-generated method stub
		return bookDao.findByAuthor(autor);
	}

	@Override
	public List<Book> findByisbn(String isbn) {
		// TODO Auto-generated method stub
		return bookDao.findByisbn(isbn);
	}

	@Override
	public BigInteger countBooks(String autor) {
		// TODO Auto-generated method stub
		return bookDao.countBooks(autor);
	}

	@Override
	public BigInteger countBooksByGen(String gen) {
		// TODO Auto-generated method stub
		return bookDao.countBooksByGen(gen);
	}

	@Override
	public BigInteger countBooksByisbn(String isbn) {
		// TODO Auto-generated method stub
		return bookDao.countBooksByisbn(isbn);
	}

}
