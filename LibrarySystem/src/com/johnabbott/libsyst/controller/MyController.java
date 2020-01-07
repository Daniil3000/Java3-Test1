package com.johnabbott.libsyst.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.johnabbott.libsyst.model.Book;
import com.johnabbott.libsyst.service.LibraryService;



@Controller
public class MyController {

	@Autowired
	LibraryService service;
	
	@RequestMapping("/showcompbooks")
	public ModelAndView getCompBooks() {
		ModelAndView modelView = new ModelAndView("computer-books");
		List<Book> compBooks = service.getCompBooks();
		modelView.addObject("compBookList", compBooks);
		
		return modelView;
	}
	
	@RequestMapping("/shownovelbooks")
	public ModelAndView getNovelBooks() {
		ModelAndView modelView = new ModelAndView("novel-books");
		List<Book> novelBooks = service.getNovelBooks();
		modelView.addObject("novelBookList", novelBooks);
		
		return modelView;
	}
}
