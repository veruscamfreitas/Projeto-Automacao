package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import util.SetUp;
import util.Util;
import util.Validacao;

public class PagePaymentActions {

	Util util = new Util();
	Validacao v = new Validacao();
	boolean result = false;

	public PagePaymentActions() {
		PageFactory.initElements(SetUp.driver, this);
	}
	
	
	public boolean selecionoPayCheck() throws InterruptedException {
		this.result = false;
		try {
			WebElement btnPayCheck = SetUp.driver.findElement(By.xpath("//*[@id=\'HOOK_PAYMENT\']/div[2]/div/p"));
			util.WaitElementClickable(btnPayCheck, 10);
			util.ClickJS(btnPayCheck);
			result = true;
		} catch (Exception pj) {
			System.out.println("Erro ao clicar no botão Pay by Check. \n\n" + pj.getMessage());
		}

		return result;
	}
	
	public boolean clicoConfirm() throws InterruptedException {
		this.result = false;
		try {
			WebElement btnConfirm = SetUp.driver.findElement(By.xpath("//*[@id=\'cart_navigation\']/button"));
			util.WaitElementClickable(btnConfirm, 10);
			util.ClickJS(btnConfirm);
			result = true;
		} catch (Exception pj) {
			System.out.println("Erro ao clicar no botão i Confirm my order. \n\n" + pj.getMessage());
		}

		return result;
	}

	
}
