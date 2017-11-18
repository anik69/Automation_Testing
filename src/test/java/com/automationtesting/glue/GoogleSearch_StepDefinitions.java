package com.automationtesting.glue;

import com.automationtesting.framework.ParentScenario;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class GoogleSearch_StepDefinitions extends ParentScenario {

	@Before
    public void beforeScenario() throws Throwable {
        startBrowser();
    }
	
	@Given("^User is on Google page$")
	public void user_is_on_Google_page() throws Throwable {
		navigateTo();
	}

	@When("^User enters \"([^\"]*)\" into Search field$")
	public void user_enters_into_Search_field(String Search) throws Throwable {
		Thread.sleep(2000);
		googleSearch.enterSearchItem(Search);
	}

	@And("^User Click Search button$")
	public void user_Click_Search_button() throws Throwable {
		Thread.sleep(5000);
		googleSearch.clickSearchButton();
	}

}
