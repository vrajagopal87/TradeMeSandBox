package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UsedCarsPage {
	
	public WebDriver driver;
	
	By usedCarsList=By.xpath("//*[@id=\"ListViewList\"]/li[1]/div[1]/div/a/div[2]/div[1]");
	By keyDetailsNP=By.xpath("//*[@id=\"AttributesDisplay_attributesSection\"]/ul/li[1]/div[1]/label");
	By keyDetailsKM=By.xpath("//*[@id=\"AttributesDisplay_attributesSection\"]/ul/li[2]/div[1]/label");
	By keyDetailsBody=By.xpath("//*[@id=\"AttributesDisplay_attributesSection\"]/ul/li[3]/div[1]/label");
	By keyDetailsSeats=By.xpath("//*[@id=\"AttributesDisplay_attributesSection\"]/ul/li[4]/div[1]/label");
	
	
	public UsedCarsPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getUsedCarsDetails()
	{
		return driver.findElement(usedCarsList);
		
	}
	
	public WebElement getKeyDetailsNP()
	{
		return driver.findElement(keyDetailsNP);
	}

	public WebElement getKeyDetailsKM()
	{
		return driver.findElement(keyDetailsKM);
	}
	public WebElement getKeyDetailsBody()
	{
		return driver.findElement(keyDetailsBody);
	}
	public WebElement getKeyDetailsSeats()
	{
		return driver.findElement(keyDetailsSeats);
	}
}
