package rough;

import java.io.IOException;

import org.testng.annotations.Test;

import com.microsoft.playwright.Browser;

import base.BaseTest;

public class LoginTest extends BaseTest{
	
	
	@Test
	public void doLogin() throws IOException {
		
		Browser browser = getBrowser("chrome");
		navigate(browser,"https://google.com");
		type("searchBox","Hello Playwright");
		
	}
	
	
	
	/*@Test
	public void doGmailLogin() {
		
		Browser browser = getBrowser("firefox");
		navigate(browser,"http://gmail.com");
		type("username","trainer@way2automation.com");
		
	}*/

}
