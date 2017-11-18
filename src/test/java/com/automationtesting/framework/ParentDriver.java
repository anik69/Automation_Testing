package com.automationtesting.framework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public abstract class ParentDriver {
	
	public static WebDriver driver;
	private static String OS = System.getProperty("os.name").toLowerCase();
	
	public static boolean isWindows() {
		return (OS.indexOf("win") >= 0);
	}
	
	public static boolean isUnix() {
		return (OS.indexOf("nix") >= 0 || OS.indexOf("nux") >= 0 || OS.indexOf("aix") > 0 );
	}
	
	public  WebDriver getDriver() {
				
		if (driver == null) {
			
			if (isWindows()) {
				System.setProperty("webdriver.chrome.driver", "ChromeDriver/chromedriver.exe");
				ChromeOptions cOptions = new ChromeOptions();
				cOptions.addArguments("--start-maximized");
				cOptions.addArguments("--disable-web-security");
				cOptions.addArguments("--disable-notifications");
				cOptions.addArguments("--no-proxy-server");
				
		    	Map<String, Object> prefs = new HashMap<String, Object>();
		    	prefs.put("credentials_enable_service", false);
		    	prefs.put("profile.password_manager_enabled", false);
		    	cOptions.setExperimentalOption("prefs", prefs);
				cOptions.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
				driver = new ChromeDriver(cOptions);
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			}
			else if (isUnix()) {
				System.setProperty("webdriver.chrome.driver", "ChromeDriver/chromedriver");
				ChromeOptions chromeOptions = new ChromeOptions();
				chromeOptions.addArguments("--kiosk");
				driver = new ChromeDriver(chromeOptions);
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			}
			else {
				System.out.println("Your OS not support !!!");
			}
			
		}
		return driver;
		
	}
}