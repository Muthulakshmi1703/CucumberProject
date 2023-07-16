package com.execution.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Mumi17\\ProjectClass\\MayCucumber\\src\\test\\java\\com\\feature\\files\\AdactinLoginPage.feature",
				 glue="com.stepdefinition.files",
				 //dryRun=true, //not execute the code, just return the missed snippets
				 //strict=true //execute the code and return the missed snippets
				 //monochrome=true, //ignore the human un-readable data
				 //previously we used, "format" now the name was changed to "plugin"
				 plugin= {"html:reports/login.html", "json:reports/loginjsonreport.json"}
				)
public class SampleRunner {

}
