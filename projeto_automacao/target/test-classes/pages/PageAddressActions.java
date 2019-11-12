package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import util.SetUp;
import util.Util;
import util.Validacao;

public class PageAddressActions {

	Util util = new Util();
	Validacao v = new Validacao();
	boolean result = false;

	public PageAddressActions() {
		PageFactory.initElements(SetUp.driver, this);
	}
	
	
	public boolean clicarProceedCheckoutAddress() throws InterruptedException {
		this.result = false;
		try {
			WebElement btnCheckout = SetUp.driver.findElement(By.xpath("//*[@id=\'center_column\']/form/p/button"));
			util.WaitElementClickable(btnCheckout, 10);
			util.ClickJS(btnCheckout);
			result = true;
		} catch (Exception pj) {
			System.out.println("Erro ao clicar no botão Checkout. \n\n" + pj.getMessage());
		}

		return result;
	}

	
}
