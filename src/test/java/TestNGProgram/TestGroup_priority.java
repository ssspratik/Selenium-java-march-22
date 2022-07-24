package TestNGProgram;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class TestGroup_priority {
	 WebDriver driver;
	
  @Test(priority = 1,groups = {"sanity","regression"})
  public void launch_chrome()
  {
	driver = new ChromeDriver();
	driver.navigate().to("https://www.facebook.com/");
	System.out.println(driver.getTitle());
  }
  @Test(priority = 2,groups = {"regression"})
  public void check_login() 
  {
	WebElement uname = driver.findElement(By.xpath("//input[@id='email']"));
	WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
	WebElement loginBtn = driver.findElement(By.xpath("//button[@name='login']"));
	uname.sendKeys("sangalepratik@yahoo.in");
	password.sendKeys("patu@234");
	loginBtn.click();
  }
  @Test(priority = 3,groups = {"regression"})
  public void check_Title() throws InterruptedException     {
	Thread.sleep(2000);
	String expectedTitle = "Log in to Facebook";
	String ActualTitle = driver.getTitle();
	Assert.assertEquals(ActualTitle, expectedTitle);
  }
  @Test(priority = 4,groups = {"sanity"})
  public void check_forgotpassword() 
  {
	  WebElement forgotPass = driver.findElement(By.linkText("Forgotten password?"));
	  forgotPass.click();
  }
  @Test(priority = 5,groups = {"sanity","regression"})
  public void tear_down() 
  {
      driver.close();	
  }
}
