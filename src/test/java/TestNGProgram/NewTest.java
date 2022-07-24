package TestNGProgram;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
  @Test(priority = 1,groups = "sanity")
  public void f() 
  {
	  Reporter.log("This is my first log",true);
	  System.out.println("First Test NG Program");
  }
  
  @Test(priority = 2,groups = "sanity")
  public void s() 
  {
	  Reporter.log("This is my second log",true);
	  System.out.println("this is S method");
  }
  
  @Test(priority = 3,groups = "regression")
  public void failedTest()
  {
	  Assert.assertEquals(false, true);
  	}
  
  	@Test(groups = "regression")
  	public void a()
  	{
  		System.out.println("A Test NG Program");
  	}
}
