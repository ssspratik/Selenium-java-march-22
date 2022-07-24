package TestNGProgram;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parademomultiply {
	@Test
	  @Parameters({"val1","val2"})
	  public void diff(int v1, int v2)
	  {
		  int finalmulti = v1 * v2;
		  System.out.println(finalmulti);
	  }
}
