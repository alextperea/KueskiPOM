package DataProvider;

import org.testng.annotations.DataProvider;

public class provider {

	
	@DataProvider(name = "Facebook Credentials")
	public Object[][] validCredentials(){
		return new Object[][] {
			{"Facebook", "alex_atp93@hotmail.com", "ATP150493i"}
		};
		
	}
	
}
