package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/*
 *This Runner file will run all smoke test cases under the Services
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:feature/StoreFeature.feature", tags = "@smoke", plugin = { "pretty",
		"html:target/cucumber" })
public class StoreRunner {
}
