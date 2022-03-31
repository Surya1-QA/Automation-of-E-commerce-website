package TestRunner;

import org.junit.runner.RunWith;   

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		features = "C:/work/work_space/CucumberSDEndToEndFlow/src/test/resources/Feature",
		glue = "stepdefination",
		tags = "@Endtest",
		//dryRun = true,
		stepNotifications = true,
		monochrome= true,
		
		plugin= { "pretty" , "html:target/cucumber.html", "junit:target/cukes.xml", "json:target/cucu.json","timeline:test-output-thread/",
				"timeline:target/timeline-report" }, 
		
		publish = true
		
//		reports,
	
		)

public class MyTestRunner {

}
