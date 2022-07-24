package TestNGProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parentclass {
	WebDriver driver;
	
	  @Test
	  public void launch_chrome()
	  {
		driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		System.out.println(driver.getTitle());
  }
}
