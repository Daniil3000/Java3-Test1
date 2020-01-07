package com.johnabbott.libsyst.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.johnabbott.libsyst.model.Book;

@Service
public class LibraryServiceImpl implements LibraryService{
	
	public List<Book> getCompBooks(){
		List<Book> compBooks = new ArrayList<Book>();
		compBooks.add(new Book("compAuthor1", "compBook1"));
		compBooks.add(new Book("compAuthor2", "compBook2"));
		compBooks.add(new Book("compAuthor3", "compBook3"));
		
		return compBooks;
	
	}
	
	public List<Book> getNovelBooks(){
		List<Book> novelBooks = new ArrayList<Book>();
		novelBooks.add(new Book("novelAuthor1", "novelBook1"));
		novelBooks.add(new Book("novelAuthor2", "novelBook2"));
		novelBooks.add(new Book("novelAuthor3", "novelBook3"));
		
		return novelBooks;
	
	}

}
