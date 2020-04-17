package seleniumPractice;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToolsQA_hover {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://Users//hashi//Downloads//Drivers//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//Opens the Website 
		driver.get("http://www.toolsqa.com");
		
		//Gets Title 
		System.out.println("The Title is: " + driver.getTitle());
		
		//Performs Hover 
		Actions act = new Actions (driver);
		WebElement parentMenu = driver.findElement(By.xpath("//*[@id=\'primary-menu\']/li[8]/a/span/span"));
		act.moveToElement(parentMenu).build().perform();
		Thread.sleep(3000);
		
		//Clicks the Link
		driver.findElement(By.xpath("//span[contains(.,'Automation Practice Switch Windows')]")).click();
		
		// Clicking on new window button
		driver.findElement(By.xpath("//*[@id=\'button1\']")).click(); 
		
		
		//Switching Window
		String parent = driver.getWindowHandle();
		System.out.println("Print ID is " + parent);
		
		Set<String> allWindows = driver.getWindowHandles();
		int count = allWindows.size();
		
		for (String child : allWindows) {
			if (!parent.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);
				System.out.println("child object window switched ...");

			}
		}
		
		

		System.out.println("The Child's page title is: " + driver.getTitle()); //

		//Explicit wait 
		WebDriverWait wait = new WebDriverWait(driver, 10);

		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//*[@id=\'content\']/div[1]/div/div/div/div/div/div/div/div[2]/div/h1/span")));

		if (element.isDisplayed()) {
			System.out.println("Project passed");
			System.out.println(element.getText());
			driver.manage().window().maximize();
		} else {
			System.out.println("fail");
		}
		
		
		WebElement pic = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\'page\']/div[1]/header/div/a/img")));

		if (pic.isDisplayed()) {
			System.out.println("Picture Found");
			System.out.println(pic.getText());
			driver.manage().window().maximize();
		} else {
			System.out.println("fail");
		}
		
		//IP Address of the Website
//		System.out.println("Ip Address is: " +InetAddress.getLocalHost().getHostAddress());
//		
//		Screenshott shot = new Screenshott();
		
	//	shot.ScreenShot(driver, screenshotName);
		
		
		

		
		
		
		

	}

}
