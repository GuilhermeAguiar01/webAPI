package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/java/br/com/guilherme", //
glue = { "br.com.guilherme", "br.com.guilherme.config"},//
plugin = {"pretty"}, //
snippets = SnippetType.CAMELCASE, //
tags = "@web, @APIRest")

public class runner {}

