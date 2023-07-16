package com.stepdefinition.files;

import java.util.List;
import java.util.Map;

import com.base.utils.BaseClass;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTableSD extends BaseClass{

	@Given("Open browser and launch adactin URL")
	public void open_browser_and_launch_adactin_url() {
		System.out.println("browser opened with adactin url");
	}

	@When("User enters the username as List")
	public void user_enters_the_username_as_list(DataTable dataTable) {
	 List<String> data = dataTable.asList();
	 System.out.println(data.get(0));
	}

	@When("User enters the password as List")
	public void user_enters_the_password_as_list(DataTable dataTable) {
		List<String> data = dataTable.asList();
		System.out.println(data.get(0));
	}

	@When("Click on login button")
	public void click_on_login_button() {
	    System.out.println("Login button clicked");
	}

	@Then("Validate user logged successfully.")
	public void validate_user_logged_successfully() {
	    System.out.println("User logged in successfully");
	}
	
	//asLists
	@When("User enters the username as Lists")
	public void user_enters_the_username_as_lists(io.cucumber.datatable.DataTable dataTable) {
	    List<List<String>> data = dataTable.asLists();
	    System.out.println(data.get(1).get(1));
	}

	@When("User enters the password as Lists")
	public void user_enters_the_password_as_lists(io.cucumber.datatable.DataTable dataTable) {
	  List<List<String>> data = dataTable.asLists();
	  System.out.println(data.get(0).get(0));
	}
	
	//asMap
	@When("User enters the username as Map")
	public void user_enters_the_username_as_map(io.cucumber.datatable.DataTable dataTable) {
		Map<String, String> data = dataTable.asMap();
		System.out.println(data.get("Username"));
	}

	@When("User enters the password as Map")
	public void user_enters_the_password_as_map(io.cucumber.datatable.DataTable dataTable) {
	   Map<String, String> data = dataTable.asMap();
	   System.out.println(data.get("Password"));
	}
	
	//asMaps -> it included List & map
	@When("User enters the username password and email as Maps")
	public void user_enters_the_username_password_and_email_as_maps(io.cucumber.datatable.DataTable dataTable) {
	  List<Map<String, String>> data = dataTable.asMaps();
	  System.out.println(data.get(1).get("Username"));
	  System.out.println(data.get(2).get("Password"));
	  System.out.println(data.get(0).get("Email"));
	}


}
