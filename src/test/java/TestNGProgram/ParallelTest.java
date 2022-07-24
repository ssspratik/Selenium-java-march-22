package TestNGProgram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

public class ParallelTest {
	public WebDriver driver;
	
	@Test(invocationCount = 2, threadPoolSize = 2, timeOut = 5000, description = "this is edge Browser")
	  public void EdgeTest() {
		  System.setProperty("webdriver.edge.driver", "C:\\Users\\hp\\eclipse-workspace\\Selenium_2022\\Binary\\msedgedriver.exe");
		  driver = new EdgeDriver();
		  //driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		  driver.get("https://www.facebook.com");
		  System.out.println("Current Thread ID: "+ Thread.currentThread().getId());
		  String expectedTitle = "Facebook – log in or sign up";
		  String ActualTitle = driver.getTitle();
		  Assert.assertEquals(ActualTitle, expectedTitle);
		  WebElement uname = driver.findElement(By.xpath("//input[@id='email']"));
		  WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		  WebElement loginBtn = driver.findElement(By.xpath("//button[@name='login']"));
		  uname.sendKeys("sangalepratik@yahoo.in");
		  password.sendKeys("patu@234");
		  loginBtn.click();		  
	  }
	
  @Test(timeOut = 5000, expectedExceptions = ThreadTimeoutException.class)
  public void ChromeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\Selenium_2022\\Binary\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.facebook.com");
	  System.out.println("Current Thread ID: "+ Thread.currentThread().getId());
	  String expectedTitle = "Facebook – log in or sign up";
	  String ActualTitle = driver.getTitle();
	  Assert.assertEquals(ActualTitle, expectedTitle);
	  WebElement uname = driver.findElement(By.xpath("//input[@id='email']"));
	  WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
	  WebElement loginBtn = driver.findElement(By.xpath("//button[@name='login']"));
	  uname.sendKeys("sangalepratik@yahoo.in");
	  password.sendKeys("patu@234");
	  loginBtn.click();
  }
  
  @Test
  public void FirefoxTest() {
	  System.setProperty("webdriver.firefox.driver", "C:\\Users\\hp\\eclipse-workspace\\Selenium_2022\\Binary\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  driver.get("https://www.facebook.com");
	  System.out.println("Current Thread ID: "+ Thread.currentThread().getId());
	  String expectedTitle = "Facebook – log in or sign up";
	  String ActualTitle = driver.getTitle();
	  Assert.assertEquals(ActualTitle, expectedTitle);
	  WebElement uname = driver.findElement(By.xpath("//input[@id='email']"));
	  WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
	  WebElement loginBtn = driver.findElement(By.xpath("//button[@name='login']"));
	  uname.sendKeys("sangalepratik@yahoo.in");
	  password.sendKeys("patu@234");
	  loginBtn.click();
  }
  
}
