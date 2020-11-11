package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
	public WebDriver driver;
	public WebDriver initializeDriver() throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\SandBoxUsedCars\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		if(browserName.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\SandBoxUsedCars\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		else if(browserName.equals("Firefox"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\SandBoxUsedCars\\drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		
		else if(browserName.equals("IE"))
		{
			
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	

}
