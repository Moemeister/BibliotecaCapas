package com.uca.capas.controller;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	@RequestMapping("/buscarLibro")
//	public ModelAndView autor(@RequestParam(value="target") String target,
//			@RequestParam(value="genero") String genero,@RequestParam(value="author") String autor,
//			@RequestParam(value="isbn") String isbn) {
	public ModelAndView autor(@RequestParam(value="target") String target, @RequestParam(value="finder") String finder) {
		ModelAndView mav = new ModelAndView();
		List<Book> libros;
		BigInteger x;
		String s_var =null;
		if(target.equals("Genero")) {
			libros = bookService.findByGenre(finder);
			x = bookService.countBooksByGen(finder);
			s_var = finder;
		}else if(target.equals("ISBN")){
			libros = bookService.findByisbn(finder);
			x = bookService.countBooksByisbn(finder);
			s_var = finder;
		}else {
			libros = bookService.findByAuthor(finder);
			x = bookService.countBooks(finder);
			s_var = finder;
		}
		mav.addObject("var", s_var);
		mav.addObject("x", x);
		mav.addObject("libros",libros);
		mav.setViewName("buscador");
		
		
		
		return mav;
	}
}
