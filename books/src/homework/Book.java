package homework;


public class Book {
	
	private String title;
	private String author;
	private int yearOfPublication;
	private int price;
	
	/*Book(String title, String author, String date, int price)
	{
		this.title=title;
		this.author=author;
		this.publishDate=publishDate;
		this.price=price;
	}*/
	
	
	public String getTitle()
	{
		return this.title;
	}
	
	public String getAuthor()
	{
		return this.author;
	}
	
	public int getYearOfPublication()
	{
		return this.yearOfPublication;
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
	
	public void setYearOfPublication(int yearOfPublication)
	{
		if(yearOfPublication<1950 || yearOfPublication>2021)
		{
			this.yearOfPublication=2021;
		}
		else
		{
			this.yearOfPublication=yearOfPublication;
		}
	}
	
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
	
	
	public void increasePrice(int percent)
	{
		if(percent>0)
		{
			price+=Math.round(price*((float)percent/100));
		}
	}
	
	public String displayInfo()
	{
		return "Title: "+title+"\nAuthor: "+author+"\nYear of publication: "+yearOfPublication+"\nPrice: "+price+" Ft";
	}

}
