package feature;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {

	
	@Given("^I login Customer Service Agent$")
	public void i_login_Customer_Service_Agent() throws Throwable {
	   System.out.println("I login Customer Service Agent"); 
	}

	@When("^I click on New button$")
	public void i_click_on_New_button() throws Throwable {
			System.out.println("I click on New button");
	}

	@Then("^I am able to create an article$")
	public void i_am_able_to_create_an_article() throws Throwable {
				System.out.println("I am able to create an article");
	}

	
}
