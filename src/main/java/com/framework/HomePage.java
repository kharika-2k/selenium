package com.framework;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class HomePage extends Base {
	
	@Test
	public void LoadHomePage() throws IOException{
		
		WebDriver driver = initializeDriver();
		driver.get("http://facebook.com");
		
	}

}
