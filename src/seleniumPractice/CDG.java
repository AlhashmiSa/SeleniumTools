package seleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CDG {
	static WebDriver driver;
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

//		System.setProperty("webdriver.chrome.driver", "C://Users//hashi//Downloads//Drivers//chromedriver.exe");
//
//		driver = new ChromeDriver();
//
//		// driver.get("https://www.congress.gov");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String word1 = "99th 5";
		String word2 = word1.substring(0, 2);
		String abc = word1.replaceAll("[(a-z)]", "");
		System.out.println("This is word1" + word2);
		System.out.println("This is also word1" + abc);
		
	}

}
