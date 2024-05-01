package com.learn.learning;

public class LibrarySystem {

	
    private String id;
	private String Title;
	private String Author;
	private int ISBN;
	private int Year;
	
	
	public LibrarySystem(String string, String Title, String Author, int ISBN, int Year) {
		super();
		this.id = string;
		this.Title = Title;
		this.Author = Author;
		this.ISBN = ISBN;
		this.Year = Year;
		
	}
		public String getId() {
			return id;
		}


		public void setId(String id) {
			this.id = id;
		}


		public String getTitle() {
			return Title;
		}


		public void setTitle(String title) {
			Title = title;
		}


		public String getAuthor() {
			return Author;
		}


		public void setAuthor(String author) {
			Author = author;
		}


		public int getISBN() {
			return ISBN;
		}


		public void setISBN(int iSBN) {
			ISBN = iSBN;
		}


		public int getYear() {
			return Year;
		}


		public void setYear(int year) {
			Year = year;
		

	    }

}
