package TestNGProgram;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationTest {
  @Test
  public void f() {
	  System.out.println("First Method");
  }
  
  @Test
  public void s() {
	  System.out.println("Second Method");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method Execute Before each Test Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method Execute After each Test Method");

  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before Class Execute Before Last Method");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After Class Execute After each Test Method");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test Execute Before Test Method");

  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test Execute After Test Method");

  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before Suit Execute Before All Method");

  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After Suit Execute After All Method");

  }

}
