package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import util.SetUp;
import util.Util;
import util.Validacao;

public class PageShippingActions {

	Util util = new Util();
	Validacao v = new Validacao();
	boolean result = false;

	public PageShippingActions() {
		PageFactory.initElements(SetUp.driver, this);
	}
	
	public boolean selecionarTermosUso() throws InterruptedException {
		this.result = false;
		try {
			WebElement radioTermos = SetUp.driver.findElement(By.id("cvg"));
			util.WaitElementClickable(radioTermos, 10);
			util.ClickJS(radioTermos);
			result = true;
		} catch (Exception pj) {
			System.out.println("Erro ao clicar em termos de uso. \n\n" + pj.getMessage());
		}

		return result;
	}
	
	public boolean clicarProceedCheckoutShippig() throws InterruptedException {
		this.result = false;
		try {
			WebElement btnCheckout = SetUp.driver.findElement(By.xpath("//*[@id=\'form\']/p/button"));
			util.WaitElementClickable(btnCheckout, 10);
			util.ClickJS(btnCheckout);
			result = true;
		} catch (Exception pj) {
			System.out.println("Erro ao clicar no botão Checkout. \n\n" + pj.getMessage());
		}

		return result;
	}

	
}
