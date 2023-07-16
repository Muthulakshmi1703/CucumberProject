package com.stepdefinition.files;

import com.base.utils.BaseClass;

import io.cucumber.java.en.Given;

public class ParallelStepDefinition extends BaseClass{

	@Given("Open Browser")
	public void open_browser() {
	   browserOpen("chrome");
	}

	@Given("Open edge Browser")
	public void open_edge_browser() {
		browserOpen("edge");
	}
	
	@Given("Launch the Amazon URL")
	public void launch_the_amazon_url() {
	    loadUrl("https://www.amazon.in/");
	}

	@Given("Launch the Flipkart URL")
	public void launch_the_flipkart_url() {
	    loadUrl("https://www.flipkart.com/");
	}
}
