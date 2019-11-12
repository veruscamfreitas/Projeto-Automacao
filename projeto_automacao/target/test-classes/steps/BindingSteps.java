package steps;

import java.io.IOException;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import util.ScreenshotManager;
import util.SetUp;
import util.Util;

public class BindingSteps {

	Util util = new Util();
	static Scenario scenario;;

	@Before("@First")
	public static void Start() {
		SetUp.GetInstance();
		SetUp.SetUpDriver(1);
	}

	@Before("@FirstToPDF")
	public static void StartPdfFeature() {
		SetUp.GetInstance();
		SetUp.SetUpDriver(3);
	}

	@Before()
	public static void initScenario(Scenario scen) {
		scenario = scen;
	}

	@Given("^que acesso a página automationpractice$")
	public void acessoAPaginaDa(String x, String pagina) throws Throwable {

		String URL = "";

		

		if (pagina.toLowerCase().contains("automation")) {
			URL = "www.automationpractice.com";
		}

		try {

			SetUp.driver.get(URL);
			Thread.sleep(8000);

		} catch (Exception pj) {
			System.out.println("Erro ao abrir página solicitada.\n" + pj.getMessage());
		}
	}

	@After(order = 1)
	public static void afterScenario() throws IOException {
		ScreenshotManager.captureFullPageScreenshot(SetUp.driver, scenario);
	}

	@After(value = "@Last", order = 0)
	public static void End() throws IOException {		
		SetUp.GetInstance();
		SetUp.TearDown();
		SetUp.deleteAllPdfFiles();
	}
}
