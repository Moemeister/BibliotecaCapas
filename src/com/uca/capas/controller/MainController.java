package com.uca.capas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uca.capas.dao.BookDAO;

@Controller
public class MainController {

	@Autowired
	private BookDAO bookDao;
	
	
	@RequestMapping("/")
	public String initMain() {
		return "main";
	}
}
