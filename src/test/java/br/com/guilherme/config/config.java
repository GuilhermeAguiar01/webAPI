package br.com.guilherme.config;

import org.openqa.selenium.WebDriver;

import br.com.guilherme.web.logic;
import br.com.guilherme.web.page;

public class config {

	public static WebDriver driver;

	static page page = new page();

	logic logic;

	public static WebDriver getDriver() {
		return driver;
	}
}
