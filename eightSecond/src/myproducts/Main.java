package myproducts;

import java.util.Scanner;

public class Main {

	static Scanner input=new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Product[] products=readProducts();
		
		sortArray(products);
		
		for (int i = 0; i < products.length; i++) {
			System.out.println(products[i].toString());
		}
		
		priceyAuthors(products);

	}
	
	public static void sortArray(Product[] array)
	{
		for(int i=0;i<array.length;i++)
		{
			int minIndex=i;
			for(int j=i+1;j<array.length; j++)
			{
				if(array[j].getUnitPrice()<array[minIndex].getUnitPrice())
				{
					minIndex=j;
				}
			}
			{
				Product tmp=array[minIndex];
				array[minIndex]=array[i];
				array[i]=tmp;
			}
		}
	}
	
	public static void priceyAuthors(Product[] products)
	{
		
		Book[] books=new Book[products.length];
		
		for (int i = 0; i < products.length; i++) {
			
			if(products[i] instanceof Book)
			{
				books[i]=(Book) products[i];
			}
		}
		
		System.out.println("Authors with greater than 20 Ft/page unit price: ");
			
		String[] authors=new String[books.length];
		int priceyAuthorCnt=0;
		
		for (int j = 0; j < books.length; j++) {
			if(books[j]!=null)
			{
				boolean contains = containsAuthor(books[j], authors);
				
				if(!contains && books[j].getUnitPrice()>20)
				{
					System.out.println(books[j].getAuthor());
					authors[priceyAuthorCnt]=books[j].getAuthor();
					priceyAuthorCnt++;
				}
			}
		}
	}

	public static boolean containsAuthor(Book book, String[] books) {
		boolean contains=false;
		for (int j = 0; j < books.length; j++) {
			if(books[j]!=null && books[j].equalsIgnoreCase(book.getAuthor()))
			{
				contains=true;
			}
		}
		return contains;
	}
	
	public static Product[] readProducts()
	{
		System.out.println("How many products do you want? ");
		int number=input.nextInt();
		input.nextLine();
		
		Product[] array=new Product[number];
		int cnt=0;
		
		int i=0;
		while(i<number)
		{
			System.out.println("Book or Bread?");
			
			String readString=input.nextLine();
			
			if(readString.equalsIgnoreCase("Bread"))
			{
				array[cnt]=readBread();
				cnt++;
			}
			else if(readString.equalsIgnoreCase("Book"))
			{
				array[cnt]=readBook();
				cnt++;
			}
			else
			{
				System.out.println("Incorrect input");
			}
			i++;
		}
		return array;
	}
	
	public static Bread readBread()
	{
		Bread bread=new Bread(null, 0, 0, 0);
		boolean ok;
		do
		{
			System.out.print("Please give the name, price, vat and quantity: ");
			try
			{
				ok=true;
				String all=input.nextLine();
				String[] elements=all.split(", ");
				bread.setName(elements[0]);
				bread.setNettoPrice(Integer.parseInt(elements[1]));
				bread.setVat(Integer.parseInt(elements[2]));
				bread.setQuantity(Integer.parseInt(elements[3]));
			}
			catch(Exception e)
			{
				ok=false;
				System.out.println("Wrong, wrong, wrong...");
			}
		}while(!ok);
		return bread;
	}
	
	public static Book readBook()
	{
		Book book=new Book(null, null, null, 0, 0);
		boolean ok;
		do
		{
			System.out.print("Please give the author, title, style, price and vat: ");
			try
			{
				ok=true;
				String all=input.nextLine();
				String[] elements=all.split(", ");
				book.setAuthor(elements[0]);
				book.setName(elements[1]);
				book.setStyle(elements[2]);
				book.setNettoPrice(Integer.parseInt(elements[3]));
				book.setVat(Integer.parseInt(elements[4]));
			}
			catch(Exception e)
			{
				ok=false;
				System.out.println("Wrong, wrong, wrong...");
			}
		}while(!ok);
		return book;
	}

}
