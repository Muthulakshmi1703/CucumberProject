package com.stepdefinition.files;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass {

	@Before
	public void beforeScenario() {
		System.out.println("Run before the Scenario");
	}
	
	@After
	public void afterScenario() {
		System.out.println("Run after the Scenario");
	}
}
