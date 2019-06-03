package DataProvider;

import org.testng.annotations.DataProvider;

public class provider {

	
	@DataProvider(name = "Facebook HappyPath")
	public Object[][] validCredentials(){
		return new Object[][] {
			{"Facebook", "alex_atp93@hotmail.com", "ATP150493i"}
		};
		
	}
	
	
	@DataProvider(name = "Facebook InvalidData")
	public Object[][] invalidCredentials(){
		return new Object[][] {
			{"Facebook", "alex_atp93@hotmail.com", "ATP150493"},
			{"Facebook","","ATP1234ed"}
		};
		
	}
	
}
