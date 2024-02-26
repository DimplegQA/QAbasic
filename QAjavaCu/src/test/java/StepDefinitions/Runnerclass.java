package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",glue= {"StepDefinitions"}, 
tags="@SmokeTest and @Regression",
monochrome=true,
//plugin={"pretty","html:target/HtmlReports"},

plugin={"pretty","json:target/JSONReports/report.json",
		"junit:target/Junitreports/junitr.xml"}
)
public class Runnerclass {

}
