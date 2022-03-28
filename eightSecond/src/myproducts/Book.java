package myproducts;

import myproducts.Book;

public class Book extends Product{
	
	private String author;
	private final int yearOfPublication;
	private int pages;
	private String style;

	
	//static java.time.LocalDate currentDate = java.time.LocalDate.now();
	//final static int year = currentDate.getYear();
	
	public Book(String author, String name, String style, int pages, int nettoPrice, int vat)
	{
		super(name, nettoPrice, vat);
		this.author=author;
		this.yearOfPublication=java.time.LocalDate.now().getYear();
		if(pages>=0)
		{
			this.pages=pages;
		}
		else
		{
			this.pages=0;
		}
		this.style=style;
		
	}
	
	public Book(String author, String name, String style, int nettoPrice, int vat)
	{
		super(name, nettoPrice, vat);
		this.author=author;
		this.pages=100;
		this.style=style;
		this.yearOfPublication=java.time.LocalDate.now().getYear();
	}
	
	
	@Override
	int getUnitPrice()
	{
		return (int) Math.round((double)this.grossPrice()/pages);
	}
	
	public static int avgPrice(Book[] books, String style)
	{
		int cnt=0, sum=0;
		for (int i = 0; i < books.length; i++) {
			if(books[i].getStyle().equalsIgnoreCase(style))
			{
				sum+=books[i].grossPrice();
				cnt++;
			}
		}
		if(cnt==0)
		{
			return 0;
		}
		else
		{
			return Math.round(sum/cnt);
		}
		
	}
	
	public static int listBooksWithStyle(Book[] books, String style)
	{
		int cnt=0;
		for (int i = 0; i < books.length; i++) {
			if(books[i].getStyle().equalsIgnoreCase(style))
			{
				books[i].toString();
				cnt++;
			}
		}
		return cnt;
	}
	
	/*public static void discountBooks(Book[] books, String style)
	{
		for (int i = 0; i < books.length; i++) {
			if(books[i].getStyle().equalsIgnoreCase(style))
			{
				books[i].decreasePrice(10);
			}
		}
	}*/
	
	public static int countStyles(Book[] books)
	{
		String[] styles=new String[books.length];
		int styleCnt=0;
		
		for (int i = 0; i < books.length; i++) {
			
			boolean contains = containsStyle(books[i], styles);
			
			if(!contains)
			{
				styles[styleCnt]=books[i].getStyle();
				styleCnt++;
			}
		}
		
		return styleCnt;
	}

	public static boolean containsStyle(Book book, String[] styles) {
		boolean contains=false;
		for (int j = 0; j < styles.length; j++) {
			if(styles[j]!=null && styles[j].equalsIgnoreCase(book.getStyle()))
			{
				contains=true;
			}
		}
		return contains;
	}
	
	/*@Override
	public void decreasePrice(int overridePercent)
	{
		if(style.equals("children"))
		{
			overridePercent+=7;
		}
		else if(style.equals("guide"))
		{
			overridePercent+=5;
		}
		super.decreasePrice(overridePercent);
	}*/
	
	public static void listBookArray(Book[] bookArray)
	{
		for (Book book : bookArray) {
			System.out.println(book.toString());
		}
	}
	
	public static Book getLongestEvenPagesBook(Book[] array)
	{
		Book max=null;
		int index=0;
		int cnt=0;
		for (int i = 0; i < array.length; i++) {
			if((array[i].getPages()%2==0) && (Book.getLonger(max, array[i])==array[i]))
			{
				max=array[i];
				index=i;
				cnt++;
			}
		}
		if(cnt==0)
		{
			return null;
		}
		else
		{
			return(array[index]);
		}
	}
	
	public static Book getLongestBook(Book[] array)
	{
		Book max=null;
		int index=0;
		for (int i = 0; i < array.length; i++) {
			if(Book.getLonger(max, array[i])==array[i])
			{
				max=array[i];
				index=i;
			}
		}
		return(array[index]);
	}
	
	public static Book getLonger(Book first, Book second)
	{
		if(first.getPages()<second.getPages())
		{
			return second;
		}
		else
		{
			return first;
		}
	}
	
	public boolean hasEvenPages()
	{
		if(getPages()%2==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static int comparePublicationDate(int firstYear, int secondYear)
	{
		if(firstYear>secondYear)
		{
			return 1;
		}
		else if(firstYear<secondYear)
		{
			return 2;
		}
		else
		{
			return 0;
		}
	}
	
	
	public String getAuthor()
	{
		return author;
	}
	
	public void setAuthor(String author)
	{
		this.author=author;
	}
	
	public int getYearOfPublication()
	{
		return yearOfPublication;
	}
	
	/*public void setYearOfPublication(int yearOfPublication)
	{
		if(yearOfPublication<1950 || yearOfPublication>2021)
		{
			this.yearOfPublication=2021;
		}
		else
		{
			this.yearOfPublication=yearOfPublication;
		}
	}*/
	
	
	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		if(pages>=0)
		{
			this.pages=pages;
		}
	}
	
	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	/*@Override
	public String toString() {
		return "Book [title=" + getName() + ", author=" + author + ", pages=" + pages + ", style=" + style
				+ ", getYearOfPublication()=" + getYearOfPublication() + ", getPrice()=" + grossPrice() + "]";
	}*/
	
	
	@Override
	public String toString()
	{
		return "\nAuthor: "+author+"\nTitle: "+getName()+"\nStyle: "+style+"\nNetto price: "+getNettoPrice()+" Ft"+"\nVat: "+getVat()+"\nUnit price: "+getUnitPrice()+"\n";
	}

}
