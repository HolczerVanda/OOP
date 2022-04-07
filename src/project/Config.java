package project;

import java.util.Hashtable;

public class Config {

	private Hashtable<String, String> data= new Hashtable<>();
	
	private static Config instance= new Config();
	
	private Config()
	{
		//read config
		System.out.println("Reading your password...and credit card info");
		data.put("timeout", "12");
		data.put("db_ip", "localhost");
		data.put("db_port", "3000");
		data.put("threads", "12");
	}
	
	public static Config getInstance()
	{
		return instance;
	}
	
	public String getValue(String key)
	{
		return data.get(key);
	}
	
	public Hashtable<String, String> getConfig()
	{
		return this.data;
	}
}
