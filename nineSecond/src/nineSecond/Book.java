package nineSecond;

public class Book extends Product{
	
	private String author;
	private final int yearOfPublication;
	private int pages;
	private String style;
	
	public Book(String author, String name, int nettoPrice, int pages, String style) {
		super(name, nettoPrice, 27);
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
	
	
	@Override
	public String toString()
	{
		return "Author: "+author+"\nTitle: "+getName()+"\nPrice: "+grossPrice()+" "+getCurrency()+"\nVat: "+getVat()+"%"+"\nPages: "+pages+"\nStyle: "+style+"\n";
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

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public int getYearOfPublication() {
		return yearOfPublication;
	}

}
