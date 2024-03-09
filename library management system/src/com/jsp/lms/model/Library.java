package com.jsp.lms.model;

import java.util.List;

public class Library {
	private String libraryName;
	private String libraryAddress;
	private int libraryPin;
	@Override
	public String toString() {
		return "Library [libraryName=" + libraryName + ", libraryAddress=" + libraryAddress + ", libraryPin="
				+ libraryPin + ", book=" + book + "]";
	}
	private List<Book> book;
	public String getLibraryName() {
		return libraryName;
	}
	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}
	public String getLibraryAddress() {
		return libraryAddress;
	}
	public void setLibraryAddress(String libraryAddress) {
		this.libraryAddress = libraryAddress;
	}
	public int getLibraryPin() {
		return libraryPin;
	}
	public void setLibraryPin(int libraryPin) {
		this.libraryPin = libraryPin;
	}
	public List<Book> getBook() {
		return book;
	}
	public void setBook(List<Book> book) {
		this.book = book;
	}
}
