package tax;

public class EBook extends Book {

	private String url;
	
	public EBook(String title, String author, int price, int pages, int nettoPrice, String url) {
		super(title, author, pages, nettoPrice);
		this.url=url;
	}
	
	
	
	
	
	/*@Override
	public String toString()
	{
		return "Title: "+getTitle()+"\nAuthor: "+getAuthor()+"\nYear of publication: "+getYearOfPublication()+"\nPrice: "+getPrice()+" Ft\n"+"Page number: "+getPages()+"\nStyle: "+getStyle()+"\nURL: "+url;
	}*/

	@Override
	public String toString() {
		return "\nUrl: " + url + "\nTitle: " + getName() + "\nAuthor: " + getAuthor()+"\nPages: " + getPages() + "\nGross price: " + getTaxedValue() + "\n";
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
}
