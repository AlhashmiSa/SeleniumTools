package seleniumPractice;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//hashi//Downloads//Drivers//chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		//implicit
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Opens the Website
		driver.get("https://www.amazon.com/gp/goldbox?ref_=nav_cs_gb_azl");

		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println("The links are " + list.size());

		for (int i = 0; i < list.size(); i++) {
			WebElement ele = list.get(i);
			String url = ele.getAttribute("href");
			verifyLinkActive(url);
		}

	}

	// Validate response
	public static void verifyLinkActive(String linkurl) {

		try {
			URL url = new URL(linkurl);
			HttpURLConnection httpconnect = (HttpURLConnection) url.openConnection();
			httpconnect.setConnectTimeout(4000);
			httpconnect.connect();
			if (httpconnect.getResponseCode() == 200) {
				System.out.println(linkurl + " - " + httpconnect.getResponseMessage());
			}
			if (httpconnect.getResponseCode() == HttpURLConnection.HTTP_NOT_FOUND) {
				System.out.println(
						linkurl + " - " + httpconnect.getResponseMessage() + " -" + HttpURLConnection.HTTP_NOT_FOUND);
				;
			}
		} catch (Exception e) {

		}

	}

}
