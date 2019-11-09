package com.framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public WebDriver driverName;
	
	public WebDriver initializeDriver() throws IOException
	{
		Properties prop= new Properties();
		FileInputStream file= new FileInputStream("C:\\Users\\srinadh\\git\\selenium\\src\\main\\java\\data.properties");
		prop.load(file);
		
		String driver= prop.getProperty("driver");
		if(driver.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
			 driverName = new ChromeDriver();
		}
		
		driverName.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driverName;
		
	}

}
