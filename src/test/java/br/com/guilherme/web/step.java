package br.com.guilherme.web;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class step {
	logic logic = new logic();

	@Given("Acessar a URL")
	public void acessarURL() {
		logic.abrirURL("https://www.inmetrics.com.br/");
	}


	@And("Clicar no botão \"Na Midia\"")
	public void clicarEmSignIn() {
		logic.clicarEmNaMidia();
	}

	@Then("valido midia")
	public void validaMidia() {
		logic.validaMidia();
	}
	
	@And("fecho o navegador")
	public void fecharNavegador() {
		logic.fecharNavegador();
	}

}
