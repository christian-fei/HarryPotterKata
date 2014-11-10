package com.harrypotterkata.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.harrypotterkata.src.Book;
import com.harrypotterkata.src.Cart;

public class HarryPotterKataTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test_Book_AnyBook_Costs8Euro() throws Exception {
		Book book = new Book("Harry Potter and the Philosopher Stone");
		assertEquals(8, book.getPrice());
	}
	
	@Test
	public void test_Cart_oneItemInCart_Returns8Euro() throws Exception {
		Cart cart = new Cart();
		cart.add(new Book("Harry Potter and the Philosopher Stone"));
		assertEquals(8, cart.getTotalPrice());
	}
	
	@Test
	public void test_Cart_differentBooks_returnLinearAmount () throws Exception {
		Cart cart = new Cart();
		cart.add(new Book("Harry Potter and the Philosopher Stone"));

		cart.add(new Book("Harry Potter and the Chamber of Secrets"));
		assertEquals(16, cart.getTotalPrice());
	}
	
}
