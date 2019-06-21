package com.examples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class IteratorPattern {
	
	public static void main(String[] args) {
		Library library = new Library();
		library.add(new Book());
		library.add(new Book());
		library.add(new Book());
		
		//Iterator<Book> books = library.getBooks();
		Stream<Book> books = library.getBooks();
	}
	
}

class Library {
	//private List<Book> books = new ArrayList<>();
	private Set<Book> books = new HashSet<>();
	
	public void add(Book book) {
		books.add(book);
	}
	public Stream<Book> getBooks() {
		return books.stream();
	}
	/*public Iterator<Book> getBooks() {
		return books.iterator();
	}*/
	
}

class Book {
	
}
