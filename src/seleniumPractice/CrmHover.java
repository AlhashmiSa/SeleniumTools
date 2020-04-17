package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class CrmHover {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C://Users//hashi//Downloads//Drivers//geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		//Opens the Website 
		driver.get("http://www.freecrm.com");
		
		driver.findElement(By.name("username")).sendKeys("Hashmi");
		driver.findElement(By.name("password")).sendKeys("Hashmi123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		Thread.sleep(4000);
		
		Actions act = new Actions (driver);
		WebElement parentMenu = driver.findElement(By.xpath("//*[@id=\'navmenu\']/ul/li[3]/a"));
		act.moveToElement(parentMenu).build().perform();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\'navmenu\']/ul/li[3]/ul/li[1]/a")).click();
		Thread.sleep(3000);
		
		//WebElement crm = driver.findElement(By.cssSelector(".logo_text"))
	}

}
