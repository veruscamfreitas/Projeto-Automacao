package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import util.SetUp;
import util.Util;
import util.Validacao;

public class PageCadastroClienteActions {

	Util util = new Util();
	Validacao v = new Validacao();
	boolean result = false;

	public PageCadastroClienteActions() {
		PageFactory.initElements(SetUp.driver, this);
	}
	
	public boolean validaPaginaCadastro() throws InterruptedException {
		this.result = false;
		WebElement pageCadastro;

		try {
			Thread.sleep(7000);
			pageCadastro = SetUp.driver.findElement(By.xpath("//*[@id=\'account-creation_form\']/div[1]/h3"));
			result = v.ValidaElemVisivel(pageCadastro);


		} catch (Exception pj) {
			System.out.println("Erro ao validar pagina de cadastro. \n" + pj.getMessage());
		}

		return result;
	}
	
	public boolean inserirNome(String nome) throws InterruptedException {
		this.result = false;
		try {
			WebElement inputnome = SetUp.driver.findElement(By.id("customer_firstname"));
			inputnome.sendKeys(nome);
			this.result = true;
			SetUp.setTipoNome(nome);
			
		} catch (Exception pj) {
			System.out.println("Erro ao inserir nome. \n\n" + pj.getMessage());
		}

		return this.result;
	}
	
	public boolean selecionarMrs() throws InterruptedException {
		this.result = false;
		try {
			WebElement radioMrs = SetUp.driver.findElement(By.id("id_gender2"));
			util.WaitElementClickable(radioMrs, 10);
			util.ClickJS(radioMrs);
			result = true;
		} catch (Exception pj) {
			System.out.println("Erro ao clicar em  Mrs. \n\n" + pj.getMessage());
		}

		return result;
	}
	
	public boolean inserirSobrenome(String sobrenome) throws InterruptedException {
		this.result = false;
		try {
			WebElement inputSobrenome = SetUp.driver.findElement(By.id("customer_lastname"));
			inputSobrenome.sendKeys(sobrenome);
			this.result = true;
			SetUp.setSobrenome(sobrenome);
			
		} catch (Exception pj) {
			System.out.println("Erro ao inserir sobrenome. \n\n" + pj.getMessage());
		}

		return this.result;
	}
	
	public boolean inserirSenha(String senha) throws InterruptedException {
		this.result = false;
		try {
			WebElement inputSobrenome = SetUp.driver.findElement(By.id("passwd"));
			inputSobrenome.sendKeys(senha);
			this.result = true;
			SetUp.getSenha();
			
		} catch (Exception pj) {
			System.out.println("Erro ao inserir senha. \n\n" + pj.getMessage());
		}

		return this.result;
	}
	
	public boolean selecionarDia() throws InterruptedException {
		this.result = false;
		try {
			WebElement btnDia = SetUp.driver.findElement(By.id("days"));
			util.WaitElementClickable(btnDia, 10);
			util.ClickJS(btnDia);
			result = true;
		} catch (Exception pj) {
			System.out.println("Erro ao clicar no dia. \n\n" + pj.getMessage());
		}

		return result;
	}
	
	public boolean inserirDia() throws InterruptedException {
		this.result = false;
		try {
			WebElement btnDia = SetUp.driver.findElement(By.xpath("//*[@id=\'days\']/option[6]"));
			util.WaitElementClickable(btnDia, 10);
			util.ClickJS(btnDia);
			result = true;
			
		} catch (Exception pj) {
			System.out.println("Erro ao inserir dia. \n\n" + pj.getMessage());
		}

		return result;
	}
	
	public boolean selecionarMes() throws InterruptedException {
		this.result = false;
		try {
			WebElement btnMes = SetUp.driver.findElement(By.id("uniform-months"));
			util.WaitElementClickable(btnMes, 10);
			util.ClickJS(btnMes);
			result = true;
		} catch (Exception pj) {
			System.out.println("Erro ao clicar no mes. \n\n" + pj.getMessage());
		}

		return result;
	}
	
	public boolean inserirMes() throws InterruptedException {
		this.result = false;
		try {
			WebElement mes = SetUp.driver.findElement(By.xpath("//*[@id=\'months\']/option[2]"));
			util.WaitElementClickable(mes, 10);
			util.ClickJS(mes);
			result = true;
			
		} catch (Exception pj) {
			System.out.println("Erro ao inserir dia. \n\n" + pj.getMessage());
		}

		return result;
	}
	
	public boolean selecionarAno() throws InterruptedException {
		this.result = false;
		try {
			WebElement btnAno = SetUp.driver.findElement(By.id("uniform-years"));
			util.WaitElementClickable(btnAno, 10);
			util.ClickJS(btnAno);
			result = true;
		} catch (Exception pj) {
			System.out.println("Erro ao clicar no ano. \n\n" + pj.getMessage());
		}

		return result;
	}
	
	public boolean inserirAno() throws InterruptedException {
		this.result = false;
		try {
			WebElement ano = SetUp.driver.findElement(By.xpath("//*[@id=\'years\']/option[20]"));
			util.WaitElementClickable(ano, 10);
			util.ClickJS(ano);
			result = true;
			
		} catch (Exception pj) {
			System.out.println("Erro ao inserir ano. \n\n" + pj.getMessage());
		}

		return result;
	}
	
	public boolean inserirEndereco(String endereco) throws InterruptedException {
		this.result = false;
		try {
			WebElement inputEndereco = SetUp.driver.findElement(By.id("address1"));
			inputEndereco.sendKeys(endereco);
			this.result = true;
			SetUp.setSobrenome(endereco);
			
		} catch (Exception pj) {
			System.out.println("Erro ao inserir endereço. \n\n" + pj.getMessage());
		}

		return this.result;
	}
	
	public boolean inserirCidade(String cidade) throws InterruptedException {
		this.result = false;
		try {
			WebElement inputCidade = SetUp.driver.findElement(By.id("city"));
			inputCidade.sendKeys(cidade);
			this.result = true;
			SetUp.setCidade(cidade);
			
		} catch (Exception pj) {
			System.out.println("Erro ao inserir cidade. \n\n" + pj.getMessage());
		}

		return this.result;
	}
	
	public boolean selecionarEstado() throws InterruptedException {
		this.result = false;
		try {
			WebElement btnEstado = SetUp.driver.findElement(By.id("id_country"));
			util.WaitElementClickable(btnEstado, 10);
			util.ClickJS(btnEstado);
			result = true;
		} catch (Exception pj) {
			System.out.println("Erro ao inserir estado. \n\n" + pj.getMessage());
		}

		return result;
	}
	
	public boolean clicarEstado() throws InterruptedException {
		this.result = false;
		try {
			WebElement btnEstado = SetUp.driver.findElement(By.xpath("//*[@id=\"id_country\"]/option[2]"));
			util.WaitElementClickable(btnEstado, 10);
			util.ClickJS(btnEstado);
			result = true;
			
		} catch (Exception pj) {
			System.out.println("Erro ao inserir dia. \n\n" + pj.getMessage());
		}

		return result;
	}
	
	public boolean inserirCEP(String cep) throws InterruptedException {
		this.result = false;
		try {
			WebElement inputCEP = SetUp.driver.findElement(By.id("postcode"));
			inputCEP.sendKeys(cep);
			this.result = true;
			SetUp.setCep(cep);
			
		} catch (Exception pj) {
			System.out.println("Erro ao inserir CEP. \n\n" + pj.getMessage());
		}

		return this.result;
	}
	
	public boolean selecionarPais() throws InterruptedException {
		this.result = false;
		try {
			WebElement btnPais = SetUp.driver.findElement(By.id("id_country"));
			util.WaitElementClickable(btnPais, 10);
			util.ClickJS(btnPais);
			result = true;
		} catch (Exception pj) {
			System.out.println("Erro ao clicar no País. \n\n" + pj.getMessage());
		}

		return result;
	}
	
	public boolean clicarPais() throws InterruptedException {
		this.result = false;
		try {
			WebElement btnPais = SetUp.driver.findElement(By.xpath("//*[@id=\'id_country\']/option[2]"));
			util.WaitElementClickable(btnPais, 10);
			util.ClickJS(btnPais);
			result = true;
			
		} catch (Exception pj) {
			System.out.println("Erro ao inserir País. \n\n" + pj.getMessage());
		}

		return result;
	}
	
	public boolean inserirCelular(String celular) throws InterruptedException {
		this.result = false;
		try {
			WebElement inputCelular = SetUp.driver.findElement(By.id("phone_mobile"));
			inputCelular.sendKeys(celular);
			this.result = true;
			SetUp.setCep(celular);
			
		} catch (Exception pj) {
			System.out.println("Erro ao inserir Celular. \n\n" + pj.getMessage());
		}

		return this.result;
	}
	
	public boolean inserirEnderecoAlternativo(String enderecoAlt) throws InterruptedException {
		this.result = false;
		try {
			WebElement inputEnderecoAlt = SetUp.driver.findElement(By.id("alias"));
			inputEnderecoAlt.sendKeys(enderecoAlt);
			this.result = true;
			SetUp.setEnderecoAlt(enderecoAlt);;
			
		} catch (Exception pj) {
			System.out.println("Erro ao inserir Celular. \n\n" + pj.getMessage());
		}

		return this.result;
	}
	
	public boolean clicarRegister() throws InterruptedException {
		this.result = false;
		try {
			WebElement btnRegister = SetUp.driver.findElement(By.id("submitAccount"));
			util.WaitElementClickable(btnRegister, 10);
			util.ClickJS(btnRegister);
			result = true;
			
		} catch (Exception pj) {
			System.out.println("Erro ao clicar em Register. \n\n" + pj.getMessage());
		}

		return result;
	}
	
}
