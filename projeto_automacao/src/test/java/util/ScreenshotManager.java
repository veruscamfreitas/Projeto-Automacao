package util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.assertthat.selenium_shutterbug.core.Shutterbug;
import com.assertthat.selenium_shutterbug.utils.web.ScrollStrategy;

import cucumber.api.Scenario;

public class ScreenshotManager {

	public static void captureScreenShot(WebDriver driver) throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		try {
			FileUtils.copyFile(src, new File("src/test/resources/screenshots/" + System.currentTimeMillis() + ".png"));
		} catch (Exception e) {
			System.out.println("Erro ao tirar screenshot. \n" + e.getMessage());
		}
	}

	public static void captureFullPageScreenshot(WebDriver driver, Scenario scenario) {

		String screenshot_name = scenario.getId().toUpperCase().replace(";", "_");
		String status = scenario.isFailed() ? "FALHOU" : "PASSOU";
		try {
			Shutterbug.shootPage(SetUp.driver, ScrollStrategy.WHOLE_PAGE, true).withName(screenshot_name + "_" + status)
					.save("src/test/resources/screenshots/");
		} catch (Exception zd) {
			System.out.println("Erro ao tentar tirar screenshot. " + zd.getMessage());
		}
	}

	public static void captureFullPageScreenshot(WebDriver driver, String filename) {

		try {
			Shutterbug.shootPage(driver, ScrollStrategy.WHOLE_PAGE, true).withName(filename)
					.save("src/test/resources/screenshots/");
		} catch (Exception e) {
			System.out.println("Erro ao tirar print. \n" + e.getMessage());
		}

	}

}
