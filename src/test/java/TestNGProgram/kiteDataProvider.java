package TestNGProgram;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;

public class kiteDataProvider 
{
  WebDriver driver;
  @Test(dataProvider = "dp")
  public void kitelogin(String username, String password , String pin) throws InterruptedException 
  {
	  ChromeOptions option=new ChromeOptions();
	  option.addArguments("--disable-notifications");
	  driver = new ChromeDriver(option);
	  driver.get("https://kite.zerodha.com/");
	  
	  WebElement userid = driver.findElement(By.xpath("//input[@id='userid']"));
	  WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
	  WebElement LoginBtn = driver.findElement(By.xpath("//button[@class='button-orange wide']"));
	  
	  userid.sendKeys(username);
	  Password.sendKeys(password);
	  LoginBtn.click();
	  
	  Thread.sleep(2000);
	  WebElement Pin = driver.findElement(By.xpath("//input[@id='pin']"));
	  WebElement conformBtn = driver.findElement(By.xpath("//button[@type='submit']"));
	  
	  Pin.sendKeys(pin);
	  conformBtn.click();
	  
  }
  
  @Test(groups = "Title", priority = 1)
  public void check_Title() throws InterruptedException    
  {
	Thread.sleep(2000);
	String expectedTitle = "Dashboard / Kite";
	String ActualTitle = driver.getTitle();
	Assert.assertEquals(ActualTitle, expectedTitle);
  }

  @DataProvider
  public Object[][] dp() 
  {
    return new Object[][] 
    	{
    	new Object[] { "cdb307", "SwapnilK@143", "942301" }
    	};
  }
  
}

