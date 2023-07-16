package com.stepdefinition.files;

import org.junit.Assert;

import io.cucumber.java.en.Given;

public class RerunStepDefinition {

	@Given("Sample method one")
	public void sample_method_one() {
	   System.out.println("Method One");
	}

	@Given("Sample method two")
	public void sample_method_two() {
		System.out.println("Method Two");
		Assert.assertTrue(false);
	}
}
