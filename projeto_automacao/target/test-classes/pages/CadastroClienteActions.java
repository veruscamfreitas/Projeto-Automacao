package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import util.SetUp;
import util.Util;
import util.Validacao;

public class CadastroClienteActions {

	Util util = new Util();
	Validacao v = new Validacao();
	boolean result = false;

	public CadastroClienteActions() {
		PageFactory.initElements(SetUp.driver, this);
	}
	
	public boolean inserirEmailCadastro(String email) throws InterruptedException {
		this.result = false;
		try {
			WebElement inputEmail = SetUp.driver.findElement(By.id("email_creat"));
			inputEmail.sendKeys(email);
			this.result = true;
			SetUp.setEmail(email);
			
		} catch (Exception pj) {
			System.out.println("Erro ao inserir email. \n\n" + pj.getMessage());
		}

		return this.result;
	}
	
	public boolean clicarCrateAccount() throws InterruptedException {
		this.result = false;
		try {
			WebElement btnCreateAccount = SetUp.driver.findElement(By.id("SubmitCreate"));
			util.WaitElementClickable(btnCreateAccount, 10);
			util.ClickJS(btnCreateAccount);
			result = true;
		} catch (Exception pj) {
			System.out.println("Erro ao clicar no botão Create an Account. \n\n" + pj.getMessage());
		}

		return result;
	}
	
	
}
