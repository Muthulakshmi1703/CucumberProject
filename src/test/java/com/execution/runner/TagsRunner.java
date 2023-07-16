package com.execution.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Mumi17\\ProjectClass\\MayCucumber\\src\\test\\java\\com\\feature\\files\\SampleTags.feature",
				 glue="com.stepdefinition.files",
				 //tags=("@sanity")//trigger single tag
				 //tags=("@sanity and @regression") // to execute the scenario whihc has these
				 //two tags(AND based)
				 //tags=("@sanity or @smoke") // based on OR
				 tags=("not @skip") //to ignore the sceanrio execution
				 )
public class TagsRunner {

}
