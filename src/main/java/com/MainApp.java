package com;

import com.model.Author;
import com.model.Book;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book();
		book.setTitle("Subconscious of Mind");
		Author author = new Author();
		author.setName("Joseph Murphy");
		book.setAuthor(author);
		System.out.println(book);

		Book book1 = new Book();
		book1.setTitle("Psychology of Money");
		Author author1 = new Author();
		author1.setName("Morgan Housel");
		book1.setAuthor(author1);
		System.out.println(book1);
	}
}
