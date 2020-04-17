package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Switch_Q32 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C://Users//hashi//Downloads//Drivers//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//Opens the Website 
		driver.get("http://www.toolsqa.com");
		
		//Gets Title 
		System.out.println("The Title is: " + driver.getTitle());
		
		Actions act= new Actions (driver);
		WebElement ele = driver.findElement(By.xpath("//span[contains(.,'DEMO SITES')]"));
		act.moveToElement(ele).build().perform();
		
		driver.findElement(By.xpath("//span[contains(.,'Automation Practice Switch Windows')]")).click();
		
		driver.findElement(By.xpath("//button[@onclick='newBrwWin()']")).click();
		
		

	}

}
