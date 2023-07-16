package com.stepdefinition.files;

import org.openqa.selenium.WebElement;

import com.base.utils.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdactinLogin extends BaseClass{

	@Given("Launch the browser with Adactin URL")
	public void launch_the_browser_with_adactin_url() {
	  browserOpen("chrome");
	  loadUrl("https://adactinhotelapp.com/");
	}

	@When("Enter Username")
	public void enter_username() {
	   WebElement user = findElementById("username");
	   user.sendKeys("Muthu173");
	}

	@When("Enter Password")
	public void enter_password() {
	 WebElement pwd = findElementById("password");
	 pwd.sendKeys("Test@123");
	}

	@When("Click on Login button")
	public void click_on_login_button() {
		WebElement login = findElementById("login");
		login.click();
	}

	@Then("Validate User logged in or not")
	public void validate_user_logged_in_or_not() {
		impWait(5);
	    WebElement error = findElementByXpath("//div[@class='auth_error']/b");
	    if(error.isDisplayed()) {
	    	System.out.println("Test passed, User not able to login while using the Invalid Credentials");
	    }else {
	    	System.out.println("Test Failed");
	    }
	}

	@Given("Launch the browser")
	public void launch_the_browser() {
	 browserOpen("chrome");	
	}
	@Given("Pass the Adactin URL")
	public void pass_the_adactin_url() {
		  loadUrl("https://adactinhotelapp.com/");
	}
	
	@When("Enter Username as {string}")
	public void enter_username_as(String string) {
		   WebElement user = findElementById("username");
		   dataSend(user, string);
	}
	@When("Enter Password as {string}")
	public void enter_password_as(String string) {
		 WebElement pwd = findElementById("password");
		 dataSend(pwd, string); 
	}

	@When("Enter Username data as {string}")
	public void enter_username_data_as(String string) {
		WebElement user = findElementById("username");
		   dataSend(user, string);
		}
	@When("Enter Password data as {string}")
	public void enter_password_data_as(String string) {
		 WebElement pwd = findElementById("password");
		 dataSend(pwd, string); 
	}
}
