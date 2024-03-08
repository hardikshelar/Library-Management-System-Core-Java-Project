package com.jsp.lms.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.jsp.lms.model.Book;
import com.jsp.lms.model.Library;
import com.jsp.lms.view.View;

public class Controller {
	//
	private static Library library = View.getLibrary();
	//Creating book list of book object type to store the data of books.
	List<Book> books = library.getBook();
	public void addBook(Book book) {
		if (books == null) {
			books = new ArrayList<>();
		}
		books.add(book);
		library.setBook(books);
	}

	public boolean removeBook(String bookName) {
		if (books != null) {
			for (Book book : books) {
				if (book.getBookName().equalsIgnoreCase(bookName)) {
					books.remove(book);
					return true;
				}
			}

		}
		return false;
	}
	public boolean updateBook(Book bookExist,Book bookUpdate) {
		if(books!= null) {
			for (Book book : books) {
				if(book.getBookName().equalsIgnoreCase(bookExist.getBookName())) {
					books.remove(book);
					books.add(book);
					return true;
				}
			}
		}
		return false;
	}
			
		
		
	public Book fetchBook(String bookName) {
		
		if (books != null) {// list of book exists.
			for (Book books : books) {
				if (books.getBookName().equalsIgnoreCase(bookName)) {
					return books;
				}
			}
		}
		return null;
	}
}
