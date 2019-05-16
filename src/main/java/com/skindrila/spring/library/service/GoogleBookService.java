package com.skindrila.spring.library.service;

import java.util.List;

import com.skindrila.spring.library.dto.BookDTO;

public interface GoogleBookService {

	List<BookDTO> searchBookList(String searchText);
	
	BookDTO getSingleBook(String googleId);
}
