package TestNGProgram;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class ParametBrowser {
	public WebDriver driver;
	@Test
	 @Parameters({"browser"}) 
	  public void SelectBrowser(String browser)
	  {
		 if(browser.equalsIgnoreCase("chrome")) 
		 {
		  driver = new ChromeDriver();
		  driver.get("https://kite.zerodha.com");
		
		 }
		 else if(browser.equalsIgnoreCase("edge"))
		 {
		  driver = new EdgeDriver();
		  driver.get("https://www.facebook.com/");
		  
		  
		 }
	  }
}
