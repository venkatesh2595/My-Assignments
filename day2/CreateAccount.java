package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("guest");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));		
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Venkatesh250395");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		WebElement dropDown1 = driver.findElement(By.name("industryEnumId"));
		Select option1 = new Select(dropDown1);
		option1.selectByValue("IND_SOFTWARE");
		
		WebElement dropDown2 = driver.findElement(By.name("ownershipEnumId"));
		Select option2 = new Select(dropDown2);
		option2.selectByVisibleText("S-Corporation");
		
		WebElement dropDown3 = driver.findElement(By.id("dataSourceId"));
		Select option3 = new Select(dropDown3);
		option3.selectByValue("LEAD_EMPLOYEE");
		
		WebElement dropDown4 = driver.findElement(By.id("marketingCampaignId"));
		Select option4 = new Select(dropDown4);
		option4.selectByIndex(5);
		
		WebElement dropDown5 = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select option5 = new Select(dropDown5);
		option5.selectByValue("TX");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		//driver.close();				
	}

}
