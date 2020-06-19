package br.com.guilherme.web;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.guilherme.config.config;
import br.com.guilherme.config.utils;

public class logic extends config {
	WebDriver driver;
	page page;

	String day;
	String month;
	
	config config = new config();

	public logic() {
		this.driver = getDriver();
		this.page = new page();
	}

	public void abrirURL(String text) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		config.driver = new ChromeDriver();
		config.driver.get(text);
		config.driver.manage().window().maximize();
	}

	public void clicarEmNaMidia() {
		utils.clicar(page.naMidia());
	}

	public void validaMidia() {
		utils.validar(page.midiaValidation());
	}
	
	public void fecharNavegador() {
		config.driver.quit();
	}

}