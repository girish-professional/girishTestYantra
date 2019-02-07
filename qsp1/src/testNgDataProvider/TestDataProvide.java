package testNgDataProvider;

import org.testng.annotations.Test;

public class TestDataProvide {
	
	@Test(dataProvider="createUser",dataProviderClass=ReadExcelDP.class)
	
	
	public void run(String username, String password)
	{
		System.out.println(username);
		System.out.println(password);
	}

}
