package day4.LibraryBook;

public class LibraryBook {
	
	private String title;
	private String author;
	private boolean issued;
	public static int totalBooks = 0;
	
	public LibraryBook(String title, String auther) {
		this.title = title;
		this.author = auther;
		this.issued = false;
		totalBooks++;
	}

	public void issue() {
		if(!issued) {
			issued = true;
		}
	}
	
	public void returnBook() {
		if (issued) {
			issued = false;
		}
	}
	
	public boolean isIssued() {
		return issued;
	}

}
