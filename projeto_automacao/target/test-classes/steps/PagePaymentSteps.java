package steps;

import static org.junit.Assert.assertTrue;

//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
import pages.PagePaymentActions;

public class PagePaymentSteps extends PagePaymentActions {

	boolean result = false;


	
	@Then("^selecionar Pay by Check$")
	public void selecionarPayCheck() throws Throwable {
		result = selecionoPayCheck();
		assertTrue(result);
	}
	
	@Then("^clicar em I confirm my order$")
	public void clicarConfirm() throws Throwable {
		result = clicoConfirm();
		assertTrue(result);
	}
	

}
