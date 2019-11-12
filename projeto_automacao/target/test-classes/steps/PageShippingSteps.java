package steps;

import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.PageShippingActions;

public class PageShippingSteps extends PageShippingActions {

	boolean result = false;

	@When("^selecionar termos de uso$")
	public void selecionoTermosUso() throws Throwable {
		result = selecionarTermosUso();
		assertTrue(result);
	}
	
	
	@When("^clico em Proceed to checkout no Shippig$")
	public void clicoProceedCheckoutShippig() throws Throwable {
		result = clicarProceedCheckoutShippig();
		assertTrue(result);
	}
	

}
