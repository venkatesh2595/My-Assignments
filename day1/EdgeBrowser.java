package week2.day1;

public class EdgeBrowser 
{
	public void browserName (String name) 
	{
		System.out.println(name);
	}
	
	
	public static void main(String[]args)
	{
		Browser browseOptions1 = new Browser();
		EdgeBrowser browseOptions2 = new EdgeBrowser();
		browseOptions1.loadUrl();
		browseOptions2.browserName("Edge");
		
		
	}

}
