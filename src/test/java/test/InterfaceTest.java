package test;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InterfaceTest {

	static WebDriver driver;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/johnata/Documents/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void aberturaNavegadorTest() {
		driver.get("https://www.webmotors.com.br");
	}

	@Test
	public void buscaEstoqueTest() {
		driver.get("https://www.webmotors.com.br/carros/estoque?tipoveiculo=carros&estadocidade=estoque");
	}
	
	@Test
	public void buscaEstoqueLojaTest() {
		driver.get("https://www.webmotors.com.br/carros/estoque/?IdRevendedor=3834764&TipoVeiculo=carros&anunciante=concession%C3%A1ria%7Cloja");
	}


}
