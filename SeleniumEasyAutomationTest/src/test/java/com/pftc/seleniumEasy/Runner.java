package com.pftc.seleniumEasy;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
	//features="src/test/resources/features",
	features="src/test/resources/OneStopFeatures",
	
	plugin= {"pretty", "html:target/cucumber","json:target/json/result.json"},
	//tags= {"@WIP"}
			tags= {"@smoke"}
	//tags= {}
	)
public class Runner {

}
