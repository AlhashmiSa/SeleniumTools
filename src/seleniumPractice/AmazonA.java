package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonA {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C://Users//hashi//Downloads//Drivers//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//Opens the Website 
		driver.get("http://www.amazon.com");
		
//		WebElement logo = driver.findElement(By.xpath("//span[@class='nav-logo-base nav-sprite']"));
//		
//		String actual =driver.findElement(By.xpath("//span[contains(.,'Departments')]")).getText();
//		
//		String exprected = "Departments";
		
		Actions act = new Actions (driver);
		WebElement ele = driver.findElement(By.xpath("//span[contains(.,'Hello. Sign in')]"));
		act.contextClick(ele);
		
		
		
		
		
		

	}

}
