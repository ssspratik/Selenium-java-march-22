package TestNGProgram;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

public class CrossBrowseTest {
	public WebDriver driver;
	@Test
	  public void login() 
	  {
		WebElement uname = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		WebElement loginBtn = driver.findElement(By.xpath("//button[@name='login']"));
		uname.sendKeys("sangalepratik@yahoo.in");
		password.sendKeys("patu@234");
		loginBtn.click();
	  }
	
	 @Test
	  public void check_Title()     
	  {
		String expectedTitle = "Facebook – log in or sign up";
		String ActualTitle = driver.getTitle();
		Assert.assertEquals(ActualTitle, expectedTitle);
	  }
	
	 @Test
	  public void teardown() 
	  {
	      driver.close();	
 }
  
  @Parameters("browser")
  @BeforeClass
  public void beforeClass(String browser) {
	  if(browser.equalsIgnoreCase("chrome")) {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Selenium_2022\\Binary\\chromedriver.exe");
		  driver = new ChromeDriver();
	  }
	  else if(browser.equalsIgnoreCase("edge")) {
		  System.setProperty("webdriver.edge.driver", "C:\\Users\\hp\\eclipse-workspace\\Selenium_2022\\Binary\\msedgedriver.exe");
		  driver = new EdgeDriver();
	  }
	  driver.get("https://www.facebook.com");
	  System.out.println("Current Thread ID: "+ Thread.currentThread().getId());
  }
}
