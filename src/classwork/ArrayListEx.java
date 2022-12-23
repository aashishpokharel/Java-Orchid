package classwork;
import java.util.ArrayList; 
public class ArrayListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b = new Book("Laxmi Khatri", "Money", 500, "CCCDDDEEE");
		ArrayList<Book> bl = new ArrayList<Book>();
		bl.add(b);
		for(Book item: bl) {
			System.out.println("Author : "+ item.author + "\nTitle:" + item.bookTitile +"\nPages:" + item.pages +"ISBN:" + item.ISBN);
		}
	}

}

class Book{
	String author;
	String bookTitile;
	int pages;
	String ISBN;
	public Book(String author, String bookTitle, int pages, String ISBN) {
		this.author = author;
		this.bookTitile = bookTitle;
		this.pages = pages;
		this.ISBN = ISBN;	
	}
}