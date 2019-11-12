package steps;

import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CadastroClienteActions;

public class CadastroClienteSteps extends CadastroClienteActions {

	boolean result = false;

	@Given("^que insiro o email para cadastro \\\"(.*)\\\"$")
	public void insiroEmailCadastro(String email) throws Throwable {
		result = inserirEmailCadastro(email);
		assertTrue(result);
	}
	
	@Then("^clico em Create an account$")
	public void clicoCrateAccount() throws Throwable {
		result = clicarCrateAccount();
		assertTrue(result);
	}

}
