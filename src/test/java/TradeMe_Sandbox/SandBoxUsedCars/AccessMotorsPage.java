package TradeMe_Sandbox.SandBoxUsedCars;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

//import org.testng.Assert;
//import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.MotorsPage;
import pageObjects.UsedCarsPage;
import resources.base;

public class AccessMotorsPage extends base {
	
	@BeforeTest
	 public void initialize() throws IOException
	 {
		driver=initializeDriver();
		driver.get("https://www.tmsandbox.co.nz/");
		driver.manage().window().maximize();
	 }

	@Test
	public void accessMotors () throws IOException
	{
		HomePage hp=new HomePage(driver);
		hp.getMotors().click();
		MotorsPage mp=new MotorsPage(driver);
		mp.getUsedCars().click();
		UsedCarsPage up=new UsedCarsPage(driver);
		up.getUsedCarsDetails().click();
		AssertJUnit.assertEquals(up.getKeyDetailsNP().getText(), "Number plate");
		AssertJUnit.assertEquals(up.getKeyDetailsKM().getText(), "Kilometres");
		AssertJUnit.assertEquals(up.getKeyDetailsBody().getText(), "Body");
		AssertJUnit.assertEquals(up.getKeyDetailsSeats().getText(), "Seats");
				
	}
	
	@AfterTest
	
	public void teardown()
	{
		driver.close();
	}
	

}
