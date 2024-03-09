package com.jsp.lms.view;

import java.util.Scanner;

import com.jsp.lms.controller.Controller;
import com.jsp.lms.model.Book;
import com.jsp.lms.model.Library;

public class View {

	static private Library library = new Library();

	public static Library getLibrary() {
		return library;
	}

	public static void setLibrary(Library library) {
		View.library = library;
	}

	static Scanner myInput = new Scanner(System.in);
	static Controller controller = new Controller();
	//TO ADD LIBRARY DETAILS BEFORE MANUPULATING THE BOOK DATA
	static {
		System.out.println("------- Welcome to Library Management System -------");
		System.out.print("Enter Library Name : ");
		String name = myInput.nextLine();
		library.setLibraryName(name);
		System.out.print("Enter Library Address : ");
		library.setLibraryAddress(myInput.nextLine());
		System.out.print("Enter Pin Code : ");
		library.setLibraryPin(myInput.nextInt());
		myInput.nextLine();
		System.out.println("Library Added Successfully");
	}

	public static void main(String[] args) {
		//GIVE THE BELOW OPTIONS TO THE USER EVERYTIME IRRESPECTIVE OF THE CONDITION.
		do {
			System.out.println("Select Option to perform");
			System.out.println("1.Add Book\n2.Remove Book\n3.Update Book\n4.Get Book\n0.Exit");
			System.out.print("Enter Digit respective to Desired option : ");
			byte userChoice = myInput.nextByte();
			myInput.nextLine();
			switch (userChoice) {
			case 0:
				myInput.close();
				System.out.println("----- Exited -----");
				System.exit(0);
				break;
			case 1:
				Book book = new Book(); //using book object for local case block
				System.out.print("Enter Book Name: ");
				String bookName = myInput.nextLine();
				book.setBookName(bookName);
				System.out.print("Enter Book Author Name : ");
				String bookAuthor = myInput.nextLine();
				book.setBookAuthor(bookAuthor);
				System.out.print("Enter Book Price : ");
				double price = myInput.nextDouble();
				book.setBookPrice(price);
				myInput.nextLine();
				controller.addBook(book);
				System.out.println("Book Added Successfully!");
				break;
			case 2:
				System.out.print("Enter a Book to remove from library : ");
				boolean removeBook = controller.removeBook(myInput.nextLine());
				if(removeBook == true) {
					System.out.println("Book Removed Successfully");
				}
				else {
					System.out.println("Book not Found to deletion");
				}
				break;
			case 3: 
				System.out.print("Please Enter the name of Book which is to be updated : ");
				Book bookExist = controller.fetchBook(myInput.nextLine());
				if(bookExist!=null) {
					Book bookUpdate = bookExist;
					System.out.println("What to Update ?");
					System.out.println("1.Book Name\n2.Auther Name\n3. Book Price");
					System.out.print("Enter Digit Respective to Desired Option : ");
					byte updateChoice = myInput.nextByte();
					myInput.nextLine();
					switch (updateChoice) {
					case 1:
						System.out.print("Enter Updated Book Name : ");
						bookUpdate.setBookName(myInput.nextLine());

						break;
					case 2:
						System.out.print("Enter Updated Auther Name : ");
						bookUpdate.setBookAuthor(myInput.nextLine());

						break;
					case 3:
						System.out.print("Enter Updated Price : ");
						bookUpdate.setBookPrice(myInput.nextDouble());
						myInput.nextLine();

						break;

					default:
						System.out.println("-----Invalid Selection-----");
						break;
					}
					if (controller.updateBook(bookExist, bookUpdate)) {
						System.out.println("Book Updated");
					}
					else {
						System.out.println("Book Not Updated");
					}

				} else {
					System.out.println("Book not Found , Updation can't be Perform");
				}
				
				break;
			case 4:
				System.out.print("Enter book name you are looking for : ");
				Book GetBook = controller.fetchBook(myInput.nextLine());
				if(GetBook != null ) {
					System.out.println("Book is available");
					System.out.println("Details : ");
					System.out.println(GetBook);
				}
				else {
					System.out.println("Book is not available");
				}
				break;
			default:
				System.out.println("Invalid Selection. Please choose a valid option.");
				break;
			}
		} while (true);
	}

}
