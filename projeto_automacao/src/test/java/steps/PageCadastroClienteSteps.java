package steps;

import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.PageCadastroClienteActions;

public class PageCadastroClienteSteps extends PageCadastroClienteActions {

	boolean result = false;
	
	@Given("^que valido pagina de cadastro$")
	public void validoPaginaCadastro() throws Throwable {
		result = validaPaginaCadastro();
		assertTrue(result);
	}
	
	@When("^seleciono Mrs$")
	public void selecionoMrs() throws Throwable {
		result = selecionarMrs();
		assertTrue(result);
	}
	
	@When("^insiro o nome \\\"(.*)\\\"$")
	public void insiroNome(String nome) throws Throwable {
		result = inserirNome(nome);
		assertTrue(result);
	}
	
	@When("^insiro o sobrenome \\\"(.*)\\\"$")
	public void insiroSobrenome(String sobrenome) throws Throwable {
		result = inserirSobrenome(sobrenome);
		assertTrue(result);
	}
	
	@When("^insiro a senha \\\"(.*)\\\"$")
	public void insiroSenha(String senha) throws Throwable {
		result = inserirSobrenome(senha);
		assertTrue(result);
	}
	
	@When("^seleciono o dia de aniversario$")
	public void selecionoDia() throws Throwable {
		result = selecionarDia();
		assertTrue(result);
	}
	
	@When("^insiro o dia$")
	public void insiroDia() throws Throwable {
		result = inserirDia();
		assertTrue(result);
	}
	
	@When("^seleciono o mes do aniversario$")
	public void selecionoMes() throws Throwable {
		result = selecionarMes();
		assertTrue(result);
	}
	
	@When("^insiro o mes$")
	public void insiroMes() throws Throwable {
		result = inserirMes();
		assertTrue(result);
	}
	
	@When("^seleciono o ano de nascimento$")
	public void selecionoAno() throws Throwable {
		result = selecionarAno();
		assertTrue(result);
	}
	
	@When("^insiro o ano$")
	public void insiroAno() throws Throwable {
		result = inserirAno();
		assertTrue(result);
	}
	
	@When("^insiro o endereço \\\"(.*)\\\"$")
	public void insiroEndereco(String endereco) throws Throwable {
		result = inserirEndereco(endereco);
		assertTrue(result);
	}
	
	@When("^insiro a cidade \\\"(.*)\\\"$")
	public void insiroCidade(String cidade) throws Throwable {
		result = inserirCidade(cidade);
		assertTrue(result);
	}
	
	@When("^seleciono o estado$")
	public void selecionoEstado() throws Throwable {
		result = selecionarEstado();
		assertTrue(result);
	}
	
	@When("^clico no estado$")
	public void clicoEstado() throws Throwable {
		result = clicarEstado();
		assertTrue(result);
	}
	
	@When("^insiro o CEP \\\"(.*)\\\"$")
	public void insiroCEP(String cep) throws Throwable {
		result = inserirCEP(cep);
		assertTrue(result);
	}
	
	@When("^seleciono o pais$")
	public void selecionoPais() throws Throwable {
		result = selecionarPais();
		assertTrue(result);
	}
	
	@When("^clico no pais$")
	public void clicoPais() throws Throwable {
		result = clicarPais();
		assertTrue(result);
	}
	
	@When("^insiro o telefone celular \\\"(.*)\\\"$")
	public void insiroCelular(String celular) throws Throwable {
		result = inserirCelular(celular);
		assertTrue(result);
	}
	
	@When("^informo um endereco alternativo \\\"(.*)\\\"$")
	public void insiroEnderecoAlternativo(String enderecoAlt) throws Throwable {
		result = inserirEnderecoAlternativo(enderecoAlt);
		assertTrue(result);
	}
	
	@When("^clico em register$")
	public void clicoRegister() throws Throwable {
		result = clicarRegister();
		assertTrue(result);
	}


}
