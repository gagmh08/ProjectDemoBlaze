package com.noorteck.qa.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
					features = "src/test/resources/noorteck",
					glue = "com.noorteck.qa.steps",
					plugin = { "pretty",
							"html:target/cucumber-report.html",
							"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
					},
					monochrome = true
							
					
		
					)





public class Runner {

}
