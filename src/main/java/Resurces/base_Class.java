package Resurces;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class base_Class {

	
	public Properties pro;
	public WebDriver Driver;
	
	public WebDriver intializeDrivers() throws IOException {
		
		
	    pro = new Properties();
		FileInputStream Fis = new FileInputStream("C:\\Users\\Ahmad\\OneDrive\\Desktop\\AJ SELENUIM\\Selenium\\src\\main\\java\\Resurces\\Data.properties");
		
		pro.load(Fis);
	    String browserName = pro.getProperty("browser");
	    
	
		if(browserName.equals("Chrome")) {
		
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("headless");
		
		
			
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ahmad\\OneDrive\\Desktop\\AJ SELENUIM\\Selenium\\Driver\\chromedriver.exe");
		Driver = new ChromeDriver();
			
		Driver.manage().window().maximize();
			
			
				
			
		}else if (browserName.equals("Firefox")) {
			

			
		}
		
		
		
		return Driver;
		
	}
	
/*public void getScreenShot() throws IOException {
		
		
	File srs = ((TakesScreenshot)Driver).getScreenshotAs(OutputType.FILE);
		
	
	FileUtils.copyFile(srs, new File("C:\\Users\\Ahmad\\OneDrive\\Pictures\\Screenshots.png"));
	
		
	}*/
	
	
	
	
}
