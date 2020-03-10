package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import PageObject.Information;
import PageObject.LandingPage;
import Resurces.base_Class;

@RunWith(Cucumber.class)
public class StepDefinition extends base_Class{

    @Given("^initilaize the browser with chrome$")
    public void initilaize_the_browser_with_chrome() throws Throwable {
      
    	Driver = intializeDrivers();
    	
    }
    
    @Given("^Navigate to \"([^\"]*)\" stie$")
    public void navigate_to_stie(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	Driver.get(arg1);
    }


    @When("^User name should enter \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_name_should_enter_something_and_something(String strArg1, String strArg2) throws Throwable {
    	
	LandingPage l = new LandingPage(Driver);
		
	   /// l.FirstNameFeild().sendKeys(UserName);
		Information info = new Information(Driver);
		info.FirstName().sendKeys(strArg1);
		info.LastName().sendKeys(strArg2);
		
       
    }

    @Then("^click on the firstname and lastname bar$")
    public void click_on_the_firstname_and_lastname_bar() throws Throwable {
      
    }

    @And("^Navigate to \"([^\"]*)\" stie$")
    public void navigate_to_something_stie(String strArg1) throws Throwable {
        
    }

}