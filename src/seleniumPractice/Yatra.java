package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yatra {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://Users//hashi//Downloads//Drivers//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//Opens the Website 
		driver.get("http://www.yatra.com");
		
		driver.findElement(By.xpath("//input[@id='BE_flight_origin_city']")).sendKeys("Washington");
		driver.findElement(By.xpath("//input[@id='BE_flight_arrival_city']")).sendKeys("London");
		
		driver.findElement(By.xpath("//i[contains(@class,'date')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//td[@id='06/08/2018']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//i[contains(@class,'font-icon icon-inside icon-calendar blur_class BE_flight_arrival_date')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//td[@id='17/08/2018']")).click();
		Thread.sleep(4000);
		
	//	List<WebElement>alldates=driver.findElements(By.xpath("//td[@title='Tuesday, 19 June 2018']"));
		
		
		
		
	
	}

}
