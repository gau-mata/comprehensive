package com.urbanladder.runner;

import io.cucumber.testng.CucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;


//@RunWith(Cucumber.class)
@CucumberOptions(
		features="features",
		glue="com.urbanladder.stepDefinition")

public class runner extends AbstractTestNGCucumberTests {

}
