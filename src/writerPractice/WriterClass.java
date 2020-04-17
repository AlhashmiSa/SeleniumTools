package writerPractice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WriterClass {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\hashi\\eclipse-workspace\\SeleniumTools\\src\\writerPractice\\Writer.properties");
		prop.load(fis);
		
		
		System.setProperty("webdriver.chrome.driver", "C://Users//hashi//Downloads//Drivers//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://opensource.demo.orangehrmlive.com");
		
		driver.findElement(By.id("txtUsername")).sendKeys(prop.getProperty("Username"));
		driver.findElement(By.id("txtPassword")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		
		File myFile = new File ("C:\\Users\\hashi\\eclipse-workspace\\SeleniumTools\\src\\writerPractice\\Writer.properties");
		myFile.createNewFile();
		
		FileWriter fileWrite = new FileWriter("C:\\Users\\hashi\\eclipse-workspace\\SeleniumTools\\src\\writerPractice\\Writer.properties");
		
		BufferedWriter bWriter = new BufferedWriter (fileWrite);
		
		bWriter.write("Username:" + "admin");
		bWriter.newLine();
		bWriter.write("password:" + "admin");
		
		bWriter.close();
		
		//Reader 
		FileReader fileRead = new FileReader("C:\\Users\\hashi\\eclipse-workspace\\SeleniumTools\\src\\writerPractice\\Writer.properties");
		
		BufferedReader bReader = new BufferedReader(fileRead);
		
		//System.out.println(bReader.readLine());
		
		String read;
		while ((read=bReader.readLine())!=null) {
			System.out.println(read);
			
		}
		
		
		
		
		
		

	}

}
