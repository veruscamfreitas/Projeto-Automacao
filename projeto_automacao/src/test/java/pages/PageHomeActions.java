package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import util.SetUp;
import util.Util;
import util.Validacao;

public class PageHomeActions {

	Util util = new Util();
	Validacao v = new Validacao();
	boolean result = false;

	public PageHomeActions() {
		PageFactory.initElements(SetUp.driver, this);
	}
	
	public boolean clicarAddCartProduto() throws InterruptedException {
		this.result = false;
		try {
			WebElement btnAdd = SetUp.driver.findElement(By.xpath("//*[@id=\'homefeatured\']/li[1]/div/div[2]/div[2]/a[1]"));
			util.WaitElementClickable(btnAdd, 10);
			util.ClickJS(btnAdd);
			result = true;
		} catch (Exception pj) {
			System.out.println("Erro ao clicar no botão Add cart. \n\n" + pj.getMessage());
		}

		return result;
	}
	
	public boolean clicarProceedCheckout() throws InterruptedException {
		this.result = false;
		try {
			WebElement btnCheckout = SetUp.driver.findElement(By.xpath("//*[@id=\'layer_cart\']/div[1]/div[2]/div[4]/a"));
			util.WaitElementClickable(btnCheckout, 10);
			util.ClickJS(btnCheckout);
			result = true;
		} catch (Exception pj) {
			System.out.println("Erro ao clicar no botão Checkout. \n\n" + pj.getMessage());
		}

		return result;
	}
	
	public boolean clicarProceedCheckoutShoppingCart() throws InterruptedException {
		this.result = false;
		try {
			WebElement btnCheckout = SetUp.driver.findElement(By.xpath("//*[@id=\'center_column\']/p[2]/a[1]"));
			util.WaitElementClickable(btnCheckout, 10);
			util.ClickJS(btnCheckout);
			result = true;
		} catch (Exception pj) {
			System.out.println("Erro ao clicar no botão Checkout. \n\n" + pj.getMessage());
		}

		return result;
	}

	
}
