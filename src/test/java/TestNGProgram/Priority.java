package TestNGProgram;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Priority {
  @Test(priority = 1)
  public void f() 
   {
	 System.out.println("This is TestNG Program");
   }
	  
  @Test(priority = 2)
 public void s() 
   {
	 System.out.println("This is S Method");
   }
  
  @Test(priority = 3)
  public void failedTest() 
   {
	  Assert.assertEquals(false, true);
   }
	  
  @Test
 public void a() 
   {
	 System.out.println("This is Not Junit");
   }
	  
}
	  
