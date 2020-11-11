package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MotorsPage {
	
	public WebDriver driver;
	
	By usedCars=By.id("SiteHeader_SiteTabs_SubNavMotors_LinkUsedCars");
	
	public MotorsPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getUsedCars()
	{
		return driver.findElement(usedCars);
		
	}

}
