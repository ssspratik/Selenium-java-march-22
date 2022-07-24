package TestNGProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class groupdpenxml {
	WebDriver driver;
	
	  @Test (groups = "launchChrome")
	  public void launch_chrome()
	  {
		driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		System.out.println(driver.getTitle());
	  }
	  
	  @Test(groups = "Login")
	  public void check_login() 
	  {
		WebElement uname = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		WebElement loginBtn = driver.findElement(By.xpath("//button[@name='login']"));
		uname.sendKeys("sangalepratik@yahoo.in");
		password.sendKeys("patu@234");
		loginBtn.click();
	  }
	  
	  @Test(groups = "Title")
	  public void check_Title() throws InterruptedException     
	  {
		Thread.sleep(2000);
		String expectedTitle = "Log in to Facebook";
		String ActualTitle = driver.getTitle();
		Assert.assertEquals(ActualTitle, expectedTitle);
	  }
	  
	  @Test(groups = "Forgot")
	  public void check_forgotpassword() 
	  {
		  WebElement forgotPass = driver.findElement(By.linkText("Forgotten password?"));
		  forgotPass.click();
	  }
	  @Test(groups = "Signout")
	  public void tear_down() 
	  {
	      driver.close();	
  }
}
