package com.automationtesting.framework;

import org.openqa.selenium.WebDriver;

import com.automationtesting.pageObject.GoogleSearch;

public class ParentScenario extends ParentDriver {

	WebDriver driver = getDriver();
	
	public GoogleSearch googleSearch;
    
    public void startBrowser() {
    	googleSearch = new GoogleSearch(driver);
    }
 
    public void navigateTo() {
        driver.navigate().to("https://www.google.com/");
    }

}
