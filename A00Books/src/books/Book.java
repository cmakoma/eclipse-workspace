// Assignement A00Books
// Program Book
// Author Christian Makoma
// Created Jan 28, 2020


package books;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;



public class Book implements Comparable<Book>{
	
	
	private String title;
	private String author;
	private int year;
//	public static final Comparator<Book>BY_DATE =  new ByDate();
//	public static final Comparator<Book>BY_AUTHOR = new ByAuthor();
//	
	
	public Book(String title, String author, int year) {
		super();
		this.title = title;
		this.author = author;
		this.year = year;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public int getYear() {
		return year;
	}

	@Override
	public String toString() {
		return String.format("%s by %s (%d)", title, author, year);
	}
	
	public static ArrayList<Book> getList(String file){
		ArrayList<Book> myBooks = new ArrayList<Book>();
		File readIn = new File(file);
		String pattern = "[^,]*,[^,]*,\\d{4}";
		
		try {
			Scanner inputStream = new Scanner(readIn);
			int numberOfBooks = 0;
			while(inputStream.hasNext()) 
			{
				
				String data = inputStream.nextLine();
				if(Pattern.matches(pattern, data)) {
						numberOfBooks ++;
						String[] newString = data.split(",");
						Book newBook = new Book(newString[0], newString[1], Integer.parseInt(newString[2]));
						myBooks.add(newBook);
						
					}  else {
						System.err.println("couldn't read: " + data);
					}
				}
			System.out.println("Number of read in Books: " +  numberOfBooks);
			}
		 catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return myBooks;
		
	/////// comparing books 
	
	}

	@Override
	public int compareTo(Book o) {
		return this.title.compareTo(o.title);
	}

}
