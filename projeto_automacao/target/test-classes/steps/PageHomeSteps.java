package steps;

import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.PageHomeActions;

public class PageHomeSteps extends PageHomeActions {

	boolean result = false;

	@When("^clico em Add to cart no produto escolhido$")
	public void clicoAddCartProduto() throws Throwable {
		result = clicarAddCartProduto();
		assertTrue(result);
	}
	
	@When("^clico em Proceed to checkout$")
	public void clicoProceedCheckout() throws Throwable {
		result = clicarProceedCheckout();
		assertTrue(result);
	}
	
	@When("^clico em Proceed to checkout em shopping-cart summary$")
	public void clicoProceedCheckoutShoppingCart() throws Throwable {
		result = clicarProceedCheckoutShoppingCart();
		assertTrue(result);
	}
	
	
	@When("^clico em sign in$")
	public void clicoSignIn() throws Throwable {
		result = clicarSignIn();
		assertTrue(result);
	}
}
