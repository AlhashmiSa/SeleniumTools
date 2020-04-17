package seleniumPractice;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hover_Q34 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "C://Users//hashi//Downloads//Drivers//geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		//driver.manage().window().maximize();
		
		//Opens the Website 
//		driver.get("http://www.facebook.com");
//		
//		WebElement ele = driver.findElement(By.xpath("//select[@title='Month']"));
//		Select sel=new Select(ele);
//		sel.selectByVisibleText("Sep");
//		
//		WebElement day=driver.findElement(By.xpath("//select[contains(@id,'day')]"));
//		Select sel2=new Select(day);
//		sel2.selectByVisibleText("16");
//		
//		driver.findElement(By.xpath("//input[contains(@id,'u_0_9')]")).click();
//		
//		TakesScreenshot shot = (TakesScreenshot)driver;
//		File src = shot.getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(src, new File ("C:\\Users\\hashi\\eclipse-workspace\\SeleniumTools\\Shots\\book.png"));
		
		//Q36
		driver.get("http://demo.guru99.com/test/delete_customer.php ");
		
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("678");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		Alert alert = driver.switchTo().alert();
		String getMessage=alert.getText();
		System.out.println(getMessage);
		Thread.sleep(4000);
		
		alert.accept();
		
	}

}
