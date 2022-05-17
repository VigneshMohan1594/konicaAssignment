package com.maven;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\maven\\feature", glue = "com.maven.stepdefinition", tags = "@Konica")

public class TestRunner {

}
