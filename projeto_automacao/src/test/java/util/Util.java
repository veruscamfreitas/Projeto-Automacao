package util;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Util {

	public static boolean enableAllPrint = false;

	public boolean waitElementVisible(By locator, int timeout) throws InterruptedException {
		int count = 0;
		boolean isVisible = false;
		WebElement element = null;

		try {			
			do {
				element = SetUp.driver.findElement(locator);
								
				if (element.isDisplayed()) return true;
				else count++;
				
			} while(!isVisible || count < timeout);	

		} catch (Exception e) {
			System.out.println("Erro waitElementVisible. \n" + e.getMessage());
		}

		return isVisible;

	}

	public boolean WaitElementPresent(WebElement element, int timeout) throws InterruptedException {
		int count = 0;

		do {
			try {
				return element.isDisplayed() && element.isEnabled();
			} catch (Exception e) {
				Thread.sleep(500);
				count++;
			}

		} while (count < timeout * 2);

		return false;
	}

	public boolean WaitElementNotPresent(WebElement element, int timeout) {
		int count = 0;

		do {
			try {
				if (element.isDisplayed()) {
					Thread.sleep(500);
					count++;
				} else
					return true;
			} catch (Exception e) {
				return true;
			}

		} while (count < timeout * 2);

		return false;
	}

	public void WaitElementNotPresent(WebDriver driver, String _locator, int timeout) {
		try {
			By locator = By.xpath(_locator);
			Thread.sleep(600);
			WebDriverWait wait = new WebDriverWait(driver, (timeout));
			wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
		} catch (Exception e) {
		}
	}

	public void WaitElementPresentClickable(WebDriver driver, String _locator, int timeout) {
		try {

			By locator = By.xpath(_locator);
			Thread.sleep(600);
			WebDriverWait wait = new WebDriverWait(driver, (timeout));
			wait.until(ExpectedConditions.elementToBeClickable(locator));
		} catch (Exception e) {
		}
	}

	public void WaitElementPresentList(WebDriver driver, By locator, int timeout) {
		try {
			Thread.sleep(600);
			WebDriverWait wait = new WebDriverWait(driver, (timeout));
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
		} catch (Exception e) {
		}
	}

	public void WaitElementClickable(WebDriver driver, String _locator, int timeout) {
		try {
			Thread.sleep(600);
			By locator = By.xpath(_locator);
			WebDriverWait wait = new WebDriverWait(driver, (timeout));
			wait.until(ExpectedConditions.elementToBeClickable(locator));
		} catch (Exception e) {
		}
	}

	public void WaitElementClickable(WebElement element, int timeout) {
		try {
			Thread.sleep(600);
			WebDriverWait wait = new WebDriverWait(SetUp.driver, (timeout));
			wait.until(ExpectedConditions.elementToBeClickable(element));
		} catch (Exception e) {
		}
	}

	public void RefreshPage(WebDriver driver) {
		try {
			driver.navigate().refresh();
		} catch (Exception e) {

		}
	}

	public void OpenPage(WebDriver driver, String url) {
		try {
			driver.get(url);

		} catch (Exception e) {

		}
	}

	public void ScrollPage(int space) {
		try {
			Thread.sleep(500);
			JavascriptExecutor js = (JavascriptExecutor) SetUp.driver;
			js.executeScript("window.scrollBy(0, '" + space + "');");
			Thread.sleep(500);
		} catch (Exception e) {
		}
	}

	public void ScrollElementoPage(WebDriver driver, WebElement element, int space) {
		try {

			new Point(0, 0);

			if (element != null) {
				element.getLocation();
				JavascriptExecutor js = (JavascriptExecutor) SetUp.driver;

				js.executeScript("arguments[0].scrollIntoView(true);", element);

			}
		} catch (Exception e) {
		}
	}

	public void ScrollHomePage(WebDriver driver) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) SetUp.driver;
			js.executeScript("arguments[0].scrollBy(0, 0);");
		} catch (Exception e) {
		}
	}

	/*
	 * public void Screenshot() throws Exception { if (new Scenario().isFailed()) {
	 * try { byte[] screenshot =
	 * ((TakesScreenshot)SetUp.driver).getScreenshotAs(OutputType.BYTES); String
	 * testName = scenario.getName(); scenario.embed(screenshot, "image/png");
	 * scenario.write(testName); } catch (WebDriverException wde) {
	 * System.err.println(wde.getMessage()); } catch (ClassCastException cce) {
	 * cce.printStackTrace(); } } }
	 * 
	 */

	public void HigthLine(WebElement locator) {
		try {
			this.ScrollElementoPage(SetUp.driver, locator, 10);
			JavascriptExecutor javaScriptExecutor = (JavascriptExecutor) SetUp.driver;
			javaScriptExecutor.executeScript("arguments[0].setAttribute('style', arguments[1]);", locator,
					"outline: 4px solid #00FF00;");

		} catch (Exception ex) {
		}

	}

	public void ClickJS(WebElement element) {
		try {
			this.HigthLine(element);
			JavascriptExecutor executor = (JavascriptExecutor) SetUp.driver;
			executor.executeScript("arguments[0].click();", element);
			Thread.sleep(5000);
		} catch (Exception e) {
		}

	}

	public String ReturnTextJS(WebElement element) {
		try {
			Object text;
			this.HigthLine(element);
			JavascriptExecutor executor = (JavascriptExecutor) SetUp.driver;
			text = executor.executeScript("return arguments[0].text;", element);
			return text.toString();
		} catch (Exception ex) {

		}
		return null;

	}

	public void SendKeyJS(WebElement element, String arg) {
		try {
			this.HigthLine(element);
			JavascriptExecutor executor = (JavascriptExecutor) SetUp.driver;
			executor.executeScript("arguments[0].value = '" + arg + "';", element);

		} catch (Exception ex) {
		}

	}

	public void MouseOver(WebDriver driver, WebElement element) {
		try {
			Actions action = new Actions(driver);
			action.moveToElement(element).perform();
		} catch (Exception ex) {
		}

	}

	public WebElement getVisibility(By locator, int timeout) {
		WebElement element = null;
		WebDriverWait wait = new WebDriverWait(SetUp.driver, timeout);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		return element;
	}

	public void clickElementWhenClickable(By locator, int timeout) {
		WebElement element = null;
		WebDriverWait wait = new WebDriverWait(SetUp.driver, timeout);
		element = wait.until(ExpectedConditions.elementToBeClickable(locator));
		element.click();
	}

	public void AcceptAlewrtpage() {

		try {

			SetUp.driver.switchTo().alert().accept();

		} catch (Exception ex) {

		}
	}

	public void SendKeysInput(WebElement element, String arg) {
		try {
			if ((element.getAttribute("value") == null || element.getAttribute("value") == "") && element.isDisplayed()
					&& element.isEnabled()) {
				this.HigthLine(element);
				element.sendKeys(arg);
			}
		} catch (Exception ex) {
		}

	}

	public void SetSelectByIndex(WebElement element, int index) {
		try {
			Select selectElement = new Select(element);
			if (element.isDisplayed() && element.isEnabled()) {

				this.HigthLine(element);
				selectElement.selectByIndex(index);
			}

		} catch (Exception e) {
		}

	}

	public void SetSelectByString(WebElement element, String arg) {
		try {
			Select selectElement = new Select(element);
			if (element.isDisplayed() && element.isEnabled()) {
				if ((element.getAttribute("value") == "-1" || element.getText().contains("---")
						|| selectElement.getFirstSelectedOption().getText().contains("Selecione"))) {
					this.HigthLine(element);
					selectElement.selectByVisibleText(arg);
				}
			}

		} catch (Exception ex) {
		}

	}

	public void FocusLastPage(WebDriver driver) {
		try {
			String janelaAnterior = driver.getWindowHandle();

			for (String janelaAtual : driver.getWindowHandles()) {
				driver.switchTo().window(janelaAtual);
			}

			driver.close();

			driver.switchTo().window(janelaAnterior);
		} catch (Exception ex) {

		}
	}

//        public void FocusLastPage2(WebDriver driver)
//        {
//            try
//            {
//            	 driver.switchTo().window(driver.getWindowHandle().lastIndexOf("0"));
//            	
//            }
//            catch (Exception ex)
//            {
//
//            }
//        }

	public void FocusDefaultPage(WebDriver driver) {
		try {
			driver.switchTo().defaultContent();
		} catch (Exception ex) {

		}
	}

	public void HighlightElemPassou(WebElement elemento) {
		try {
			if (elemento != null) {
				JavascriptExecutor javaScriptExecutor = (JavascriptExecutor) SetUp.driver;
				javaScriptExecutor.executeScript("arguments[0].setAttribute('style', arguments[1]);", elemento,
						"outline: 4px solid #00FF00;");
			}
		} catch (Exception e) {
		}

	}

	public void HighlightElemFalhou(WebElement elemento) {
		try {
			if (elemento != null) {
				JavascriptExecutor javaScriptExecutor = (JavascriptExecutor) SetUp.driver;
				javaScriptExecutor.executeScript("arguments[0].setAttribute('style', arguments[1]);", elemento,
						"outline: 4px solid #FF0000;");
			}
		} catch (Exception e) {
		}
	}

}