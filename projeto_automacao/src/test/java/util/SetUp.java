package util;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;


public class SetUp {
	public static WebDriver driver;
	private static SetUp setup;
	private static String email_create;
	private static String nome;
	private static String sobrenome;
	private static int tamanhoListaCartasGc;
	private static String senha;
	private static String endereco;
	private static String cidade;
	private static String cep;
	private static String celular;
	private static String enderecoAlt;

	public static void SetUpDriver(int browser) {
		try {
//			ChromeDriver chromeDriver;
//			WebDriverManager.chromedriver().setup();
//
//			FirefoxDriver firefoxDriver;
//			WebDriverManager.firefoxdriver().setup();

			switch (browser) {
			case 1:
				System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				break;
			case 2:
				System.setProperty("webdriver.gecko.driver", "src/test/resources/driver/geckodriver.exe");
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
				break;
			case 3:
				System.setProperty("webdriver.gecko.driver", "src/test/resources/driver/geckodriver.exe");
				FirefoxOptions fOption = new FirefoxOptions();
				fOption.setProfile(setFirefoxProfile());
				driver = new FirefoxDriver(fOption);
				driver.manage().window().maximize();
			default:
				break;
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}

	public static SetUp GetInstance() {
		return setup == null ? new SetUp() : setup;
	}

	public static void TearDown() {
		try {
			if (driver != null) {
				driver.quit();
			}
		} catch (Exception e) {
		}
	}

	public static String getPathPdfFolder() {
		return "src/test/resources/pdf/";
	}

	public static String getEmail() {
		return email_create;
	}

	public static void setEmail(String email) {
		email_create = email;
	}

	public static String getNome() {
		return nome;
	}

	public static void setTipoNome(String tipoNome) {
		tipoNome = nome;
	}

	public static String getSobrenome() {
		return sobrenome;
	}

	public static void setSobrenome(String tipoSobrenome) {
		tipoSobrenome = sobrenome;
	}

	public static void setTamanhoListaCartasGc(int tam) {
		tamanhoListaCartasGc = tam;
	}

	public static int getTamanhoListaCartasGc() {
		return tamanhoListaCartasGc;
	}

	public static void setSenha(String tipoSenha) {
		tipoSenha = senha;
	}

	public static String getSenha() {
		return senha;
	}
	
	public static void setEndereco(String tipoEndereco) {
		tipoEndereco = endereco;
	}
	
	public static String getEndereco() {
		return endereco;
	}
	
	public static void setCidade(String tipoCidade) {
		tipoCidade = cidade;
	}

	public static String getCidade() {
		return cidade;
	}
	
	public static void setCep(String tipoCep) {
		tipoCep = cep;
	}

	public static String getCep() {
		return cep;
	}
	
	public static void setCelular(String tipoCelular) {
		tipoCelular = celular;
	}

	public static String getCelular() {
		return celular;
	}
	
	public static void setEnderecoAlt(String tipoEnderecoAlt) {
		tipoEnderecoAlt = enderecoAlt;
	}

	public static String getEnderecoAlt() {
		return enderecoAlt;
	}

	public static FirefoxProfile setFirefoxProfile() {

		FirefoxProfile fProfile = new FirefoxProfile();

		String path = getDiretorioPdf();

		fProfile.setPreference("browser.download.folderList", 2);
		fProfile.setPreference("browser.download.dir", path);
		fProfile.setPreference("browser.download.manager.useDownloadDir", true);
		fProfile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/pdf");
		fProfile.setPreference("pdfjs.disabled", true);

		return fProfile;
	}

	public static String getDiretorioPdf() {
		File f = new File("src/test/resources/pdf/");

		return f.getAbsolutePath() + "\\";
	}

	public static int deleteAllPdfFiles() {
		File file = new File(getDiretorioPdf());
		File[] files = file.listFiles();
		int count = 0;

		for (File f : files) {
			if (!f.getName().toLowerCase().contains("leasing - manual")) {
				f.delete();
				count++;
			}
		}
		return count;
	}

}