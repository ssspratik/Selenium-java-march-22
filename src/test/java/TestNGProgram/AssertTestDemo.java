package TestNGProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertTestDemo {
	public WebDriver driver;
	@Test
	  public void chromeTest()
	  {
		  driver = new ChromeDriver();
		  driver.get("https://kite.zerodha.com");
		  String exceptedTitle = "Kite - Zerodha's fast and elegant flagship trading platform";
		  String actualTitle = driver.getTitle();
		  SoftAssert sassert =new SoftAssert();
		  sassert.assertEquals(exceptedTitle, actualTitle);
		  WebElement Kitelogo = driver.findElement(By.xpath("//img[contains(@src,'kite-logo.svg')]"));
		  sassert.assertTrue(Kitelogo.isDisplayed());
		  System.out.println(Kitelogo.isDisplayed());
		  sassert.assertAll();
	 }
	
	@Test
	  public void edgeTest()
	  {	 
		  driver = new EdgeDriver();
		  driver.get("https://www.facebook.com/");
		  String excTitle = "facebook – Log in or sign up";
		  String actTitle = driver.getTitle();
		  Assert.assertNotEquals(excTitle, actTitle);
	  }
}
	
