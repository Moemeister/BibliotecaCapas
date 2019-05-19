package com.uca.capas.controller;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.domain.Book;
import com.uca.capas.service.BookService;

@Controller
public class BookController {

	@Autowired
	public BookService bookService;
	
	@RequestMapping("/buscarTodos")
	public ModelAndView verTodos() {
		ModelAndView mav = new ModelAndView();
		List<Book> libros = bookService.findAll();
		BigInteger x = bookService.sumStock();
		BigInteger y = bookService.availableAuthors();
		mav.addObject("libros", libros);
		mav.addObject("x", x);
		mav.addObject("y", y);
		mav.setViewName("libros");
		
		return mav;
	}
}
