package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {

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
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("FISERV");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Venkatesh");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Ramamoorthy");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Mr");
		driver.findElement(By.className("smallSubmit")).click();
		String title = driver.getTitle();
		System.out.println("The title of the page is: "+title);
		driver.close();		
		}

}
