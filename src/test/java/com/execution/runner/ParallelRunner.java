package com.execution.runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="C:\\Users\\Mumi17\\ProjectClass\\MayCucumber\\src\\test\\java\\com\\feature\\files\\ParallelSample.feature",
				 glue="com.stepdefinition.files")

public class ParallelRunner extends AbstractTestNGCucumberTests{
	
	@Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
