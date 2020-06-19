package br.com.guilherme.APIRest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class step {
	
	@Given("base URI {string}")
		public void URI(String arg1) {
//			logic.URI(arg1);
			logic.baseURI = arg1;
		}

	@And("param {string} = {string}")
	public void param(String arg1, String arg2) {
//		logic.param(arg1, arg2);
		logic.ParamArg1 = arg1;
		logic.ParamArg2= arg2;
	}

	@Then("verifico o status code {string}")
			public void statusCode (String arg1) {
			   logic.statusCode(arg1);
	}	
	
}
