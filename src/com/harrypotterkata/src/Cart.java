package com.harrypotterkata.src;

import java.util.ArrayList;
import java.util.Iterator;

public class Cart {

	private ArrayList<Book> books;
	
	public Cart(){
		books = new ArrayList<Book>();
	}

	public void add(Book book) {
		books.add(book);
	}
	
	public int getTotalPrice() {
		int totalPrice = 0;
		for (Book book : books) {
			totalPrice += book.getPrice();
		}
		return totalPrice;
	}

}
