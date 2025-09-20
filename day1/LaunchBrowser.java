package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser 
{
	public static void main (String[]args)
	{
		ChromeDriver driver = new ChromeDriver();
		EdgeDriver driver1 = new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver1.get("https://www.facebook.com/");
		driver1.manage().window().maximize();
	}

}
