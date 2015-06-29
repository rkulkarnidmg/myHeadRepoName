package csirunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin={"pretty", "json:target"},
		features={"src/cucumber"}
		)
public class Runner {

}
