package com.johnabbott.libsyst.service;

import java.util.List;

import com.johnabbott.libsyst.model.Book;

public interface LibraryService {
	public List<Book> getCompBooks();
	public List<Book> getNovelBooks();

}
