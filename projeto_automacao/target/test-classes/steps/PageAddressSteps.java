package steps;

import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.PageAddressActions;

public class PageAddressSteps extends PageAddressActions {

	boolean result = false;


	
	@When("^clico em Proceed to checkout em Address$")
	public void clicoProceedCheckoutAddress() throws Throwable {
		result = clicarProceedCheckoutAddress();
		assertTrue(result);
	}
	

}
