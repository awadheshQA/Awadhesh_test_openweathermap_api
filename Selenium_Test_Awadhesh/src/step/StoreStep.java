package step;

import action.StoreAction;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StoreStep {

	StoreAction store = new StoreAction();

	@Before
	public static void startTestScenario(Scenario scenario) throws Exception {
		StoreAction.launchBrowser();
	}

	@Given("^Initial setup$")
	public void initial_setup() {
		// Initial set up is called here using @Before
		System.out.println("*** INITIAL SETUP ***");

	}

	@Given("user navigates to the store")
	public void user_navigates_to_the_store() {
		StoreAction.navigateToURL("http://store.demoqa.com");
	}

	@Given("user navigates to sample page")
	public void user_navigates_to_sample_page() {
		store.clickOnSamplePg();
	}

	@When("user comments with wrong email")
	public void user_comments_with_wrong_email() {
		store.enterCommentsEmail(true);
	}

	@When("user validates for error message")
	public void user_validates_for_error_message() {
		store.validateErrorMsg();
	}

	@When("user navigates back")
	public void user_navigates_back() {
		store.navigateBack();
	}

	@Then("user comments with correct email")
	public void user_comments_with_correct_email() {
		store.enterCommentsEmail(false);
	}

	@Then("check comment is recieved")
	public void check_comments_is_recieved() {
		store.validateComments();
	}

	@Then("close the browser")
	public void close_the_browser() {
		StoreAction.closeBrowser();
	}

}
