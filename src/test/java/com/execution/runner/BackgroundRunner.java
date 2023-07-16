package com.execution.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Mumi17\\ProjectClass\\MayCucumber\\src\\test\\java\\com\\feature\\files\\SampleBackground.feature",
				 glue="com.stepdefinition.files")
public class BackgroundRunner {

}
