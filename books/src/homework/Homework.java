package homework;

public class Homework {

	public static void main(String[] args) {
		
		Book book=new Book();
		
		book.setTitle("The Lord of the Rings");
		book.setAuthor("J. R. R. Tolkien");
		book.setYearOfPublication(1955);
		book.setPrice(12349);
		
		System.out.println(book.displayInfo());
		
		/*System.out.println("Title: "+firstBook.getTitle());
		System.out.println("Author: "+firstBook.getAuthor());
		System.out.println("Year of publishing: "+firstBook.getYearOfPublication());
		System.out.println("Price: "+firstBook.getPrice());*/
		
		book.increasePrice(10);
		System.out.println();
		
		/*System.out.println("Title: "+firstBook.getTitle());
		System.out.println("Author: "+firstBook.getAuthor());
		System.out.println("Year of publishing: "+firstBook.getYearOfPublication());
		System.out.println("Price: "+firstBook.getPrice());*/
		
		System.out.println(book.displayInfo());
	}

}
