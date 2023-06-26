package stepDef;

import io.cucumber.testng.AbstractTestNGCucumberTests;

//import org.junit.runner.RunWith;

import io.cucumber.testng.CucumberOptions;
//@RunWith(Cucumber.class)
@CucumberOptions(
		features={"D:\\BDD\\Feature Files\\Login.feature"},
		glue={"stepDef"},
		plugin= {"pretty",
				"html:target/report/Cucumber.html",
				"json:target/report/Cucumber.json"				
		},
		dryRun=false
		)

public class TestRunner extends AbstractTestNGCucumberTests
{

}
