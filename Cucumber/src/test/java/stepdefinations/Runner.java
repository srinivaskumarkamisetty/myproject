package stepdefinations;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"D:\\SeleniumPractice\\Cucumber\\src\\test\\resources\\features\\registerpage.feature",
				"D:\\SeleniumPractice\\Cucumber\\src\\test\\resources\\features\\NopCommercelogin.feature"},
		glue= {"stepdefinations"},
		
		monochrome=true,
				plugin = { "pretty", "html:target/cucumber-reports" }
		//,dryRun=true
		)
public class Runner {
 
}
