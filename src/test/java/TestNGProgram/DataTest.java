package TestNGProgram;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataTest 
{
	@DataProvider
	public Object[][] dp() 
	{
		return new Object[][] 
		{
			new Object[] { "PS0530", "1234pss" },
			new Object[] { "PS0250", "7654378" },
			new Object[] { "PS0880", "6754ytr" },
			new Object[] { "PS0266", "4444rgd" },
			new Object[] { "PS0405", "3422bvb" },
			new Object[] { "PS0255", "2134ssm" },
			new Object[] { "PS0244", "6070ews" },
			new Object[] { "PS0770", "2134ssm" },
			new Object[] { "PS0980", "6677aab" },
			new Object[] { "PS0234", "2167uyn" },
			new Object[] { "PS0301", "5789jkl" },
			new Object[] { "PS0299", "2111mno" },
		};
	}
}
