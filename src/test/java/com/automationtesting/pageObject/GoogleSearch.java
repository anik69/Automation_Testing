package com.automationtesting.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.automationtesting.framework.ParentDriver;

public class GoogleSearch extends ParentDriver {
	
	WebDriver driver = getDriver();
 
    public GoogleSearch(WebDriver driver) {
        this.driver = driver;
    }
    
    public void enterSearchItem(String Search) {
    	driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Search);
    }
 
    public void clickSearchButton() {
    	driver.findElement(By.xpath("//input[@jsaction='sf.chk']")).click();
    }
    
}
