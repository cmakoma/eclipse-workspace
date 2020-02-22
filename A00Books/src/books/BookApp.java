// Assignement A00Books
// Program BookApp
// Author Christian Makoma
// Created Jan 28, 2020


package books;

import java.util.ArrayList;
import java.util.Collections;

public class BookApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Book> MyBooks = Book.getList("books.csv");
		
		
		///sorting by date 
		Collections.sort(MyBooks);
		
		////sorting  by year
		Collections.sort(MyBooks);
		
		System.out.println("\nSorted book list: ");
		
		for(Book b: MyBooks) {
			System.out.println(b);
		}

		System.out.println("\nReverse order: ");
		Collections.reverse(MyBooks);
		for(Book b: MyBooks) {
			System.out.println(b);
		}

	}

}
