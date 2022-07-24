package TestNGProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class childclass extends parentclass {
	 @Test(dependsOnMethods = "launch_chrome")
	  public void check_login() 
	  {
		WebElement uname = driver.findElement(By.xpath("//input[@id='email']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		WebElement loginBtn = driver.findElement(By.xpath("//button[@name='login']"));
		uname.sendKeys("sangalepratik@yahoo.in");
		password.sendKeys("patu@234");
		loginBtn.click();
  }
}
