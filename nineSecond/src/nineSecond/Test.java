package nineSecond;

public class Test {

	public static void main(String[] args) {
		
		Marketable property=new Property(24000000, 70, "New York");
		System.out.println(property.toString());
		
		convertCurrency(property);
		System.out.println(property.toString());
		
		Marketable book=new Book("J. K. Rowling", "Harry Potter", 3560, 578, "Fictional" );
		System.out.println(book.toString());
		
		convertCurrency(book);
		System.out.println(book.toString());

	}
	
	public static void convertCurrency(Marketable item)
	{
		if(item.getCurrency().equalsIgnoreCase("€"))
		{
			item.setPrice(item.getPrice()*367);
			item.setCurrency("Ft");
		}
		else if(item.getCurrency().equalsIgnoreCase("Ft"))
		{
			item.setPrice(Math.round((float)item.getPrice()/367));
			item.setCurrency("€");
		}
	}

}
