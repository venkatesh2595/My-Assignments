package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookAccountCreation {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		driver.findElement(By.name("firstname")).sendKeys("venkatesh");
		driver.findElement(By.name("lastname")).sendKeys("ramamoorthy");
		WebElement dropDown1 = driver.findElement(By.id("day"));
		Select option1 = new Select(dropDown1);
		option1.selectByValue("25");
		WebElement dropDown2 = driver.findElement(By.id("month"));
		Select option2 = new Select(dropDown2);
		option2.selectByValue("3");
		WebElement dropDown3 = driver.findElement(By.id("year"));
		Select option3 = new Select(dropDown3);
		option3.selectByValue("1995");
		driver.findElement(By.xpath("//input[@value='2']")).click();
		driver.findElement(By.name("reg_email__")).sendKeys("8667303198");
		driver.findElement(By.id("password_step_input")).sendKeys("Venkat@95");
		driver.findElement(By.name("websubmit")).click();
	}

}
