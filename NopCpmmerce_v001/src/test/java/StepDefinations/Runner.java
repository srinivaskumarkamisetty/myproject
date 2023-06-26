package StepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {
		"D:\\SeleniumPractice\\NopCpmmerce_v001\\src\\test\\resources\\features" },
		glue = {
				"StepDefinations" },
		monochrome=true,
				plugin = { "pretty", "html:target/cucumber-reports" }
		//,dryRun=true

)

public class Runner {

}
 