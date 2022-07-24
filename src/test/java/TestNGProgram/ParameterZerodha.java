package TestNGProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterZerodha {
 @Test
 @Parameters({"username","password"}) 
  public void LoginZerodha(String Uname, String Pass)
  {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://kite.zerodha.com");
	  driver.findElement(By.id("userid")).sendKeys(Uname);
	  driver.findElement(By.id("password")).sendKeys(Pass);
  }
}
