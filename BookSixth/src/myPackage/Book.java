package myPackage;


public class Book {
	
	private String title;
	private String author;
	private int yearOfPublication;
	private int price;
	private int pageNumber;

	private static String publisher="Mora";
	
	static java.time.LocalDate currentDate = java.time.LocalDate.now();
	final static int year = currentDate.getYear();
	
	Book(String title, String author, int price, int pageNumber)
	{
		this.title=title;
		this.author=author;
		this.yearOfPublication=year;
		this.price=price;
		this.pageNumber=pageNumber;
	}
	
	Book(String title, String author, int pageNumber)
	{
		this(title, author, 2500, pageNumber);
	}
	
	public static Book longerBook(Book first, Book second)
	{
		if(first.getPageNumber()>second.getPageNumber())
		{
			return first;
		}
		else
		{
			return second;
		}
	}
	
	public boolean isEven()
	{
		if(getPageNumber()%2==0)
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
	
	
	public String getTitle()
	{
		return this.title;
	}
	
	public String getAuthor()
	{
		return this.author;
	}
	
	public static int getYearOfPublication()
	{
		return year;
	}
	
	public int getPrice()
	{
		return this.price;
	}
	
	
	public void setTitle(String title)
	{
		this.title=title;
	}
	
	
	public void setAuthor(String author)
	{
		this.author=author;
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
	
	public void setPrice(int price)
	{
		if(price<1000)
		{
			this.price=1000;
		}
		else
		{
			this.price=price;
		}
	}
	
	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public static String getPublisher() {
		return publisher;
	}

	public static void setPublisher(String publisher) {
		Book.publisher = publisher;
	}
	
	
	public void increasePrice(int percent)
	{
		if(percent>0)
		{
			price+=Math.round(price*((float)percent/100));
		}
	}
	
	@Override
	public String toString()
	{
		return "Title: "+title+"\nAuthor: "+author+"\nYear of publication: "+yearOfPublication+"\nPrice: "+price+" Ft\n"+"Page number: "+pageNumber+"\nPublisher: "+publisher;
	}

}
