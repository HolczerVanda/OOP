package tax;

public class Book extends Product{
	
	private String author;
	private int pages;
	
	public Book(String name, String author, int pages, int nettoPrice)
	{
		super(name, nettoPrice, 5);
		this.author=author;
		this.pages=pages;
	}
	
	@Override
	public String toString()
	{
		return "\nAuthor: "+author+"Title: "+getName()+"\nNumber of pages: "+pages+"\nNetto price: "+getNettoPrice()+"\nVat: "+getTax()+"\nGross price: "+getTaxedValue()+"\nUnit price: "+getUnitPrice()+"\n";
	}
	
	public int getUnitPrice()
	{
		return Math.round((float)super.getTaxedValue()/pages);
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

}
