package stepdefination;

import configuration.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HookSteps extends Base{
	
	@Before
	public static void BrowserOpen() throws Exception {
		
		Base.getDriver();
		
	}
	
	
//	@After
//	public static void QuitBrowser() {
//		
//		driver.quit();
//		
//	}

	

}
