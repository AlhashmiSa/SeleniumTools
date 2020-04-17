package seleniumPractice;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshott {
	
	public static void ScreenShot (WebDriver driver, String screenshotName) {
		
		try {
			TakesScreenshot screenshotObj = (TakesScreenshot)driver;
			File source = screenshotObj.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("C:\\Users\\hashi\\eclipse-workspace\\SeleniumTools\\Screenhotsss.png" + screenshotName));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
