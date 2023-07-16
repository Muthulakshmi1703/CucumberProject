package com.stepdefinition.files;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class BackgroundStepDefinition {

	@Given("Launch the browser with Flipkart URL")
	public void launch_the_browser_with_flipkart_url() {
	   System.out.println("Flipkart Site launched");
	}

	@When("Validate user able to login")
	public void validate_user_able_to_login() {
	   System.out.println("LoginPage tc");
	}

	@When("Validate the banner is displayed")
	public void validate_the_banner_is_displayed() {
	   System.out.println("HomePage tc");
	}

	@When("Search product")
	public void search_product() {
		System.out.println("PLPPAge tc");
	}

}
