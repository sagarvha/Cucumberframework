package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\admin\\workspace\\cucumberframework\\src\\main\\java\\feature\\Dealsmap.feature",
		//glue={"C:\\Users\\admin\\workspace\\cucumberframework\\src\\main\\java\\stepdefination\\dealsstepdefination.java"},
		glue={"stepdefination"},
		format={"pretty","html:test.output","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},
		dryRun=false,
		monochrome=true,
		strict=true
		)
 
public class TestRunner { 
	

}
