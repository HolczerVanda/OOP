package project;

public class Main {

	public static void main(String[] args) {
		Config config = Config.getInstance();
		System.out.println(config.getConfig());

		int timeout=Integer.parseInt(config.getValue("timeout"));
		
		System.out.println("timeout : "+timeout+"s");
		
		printConfig();
		
		config.getConfig().put("home_dir", "/home/valami");
		
		printConfig();

	}
	
	public static void printConfig()
	{
		System.out.println(Config.getInstance().getConfig());
	}

}
