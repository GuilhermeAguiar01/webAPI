package br.com.guilherme.APIRest;

import static com.jayway.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static com.jayway.restassured.module.jsv.JsonSchemaValidator.*;
import org.junit.Test;

import com.jayway.restassured.http.ContentType;

import net.bytebuddy.asm.Advice.This;

public class logic {
	
	static String baseURI;
	static String ParamArg1;
	static String ParamArg2;
	static int StatusCode;

	//Verifica o Status Code
	public static void statusCode(String arg1) {
		int statusCode = Integer.parseInt(arg1);
		logic.StatusCode = statusCode;
		
		given()
		.relaxedHTTPSValidation()
		.param(ParamArg1, ParamArg2)
		.when()
		.get(baseURI)
		.then()
		.statusCode(StatusCode);
		

	}

}
