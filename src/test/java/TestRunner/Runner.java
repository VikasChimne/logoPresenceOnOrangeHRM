package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\user\\eclipse-workspace\\LogoPresenceOnOranageHRM\\Feature File",
		glue = "Stepdefinition",
		plugin = {"pretty", // to generate reports
			      
				"html:target/html/htmlreport.html",
			      "json:target/json/file.json",
		},
		dryRun = false, // to tell whether to test run(true) or actual run(false)

		monochrome = true)
		

public class Runner {

}
