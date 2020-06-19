package br.com.guilherme.web;

import org.openqa.selenium.By;

public class page {
	
	//Menu
	public By naMidia() { return By.cssSelector("a[href='https://www.inmetrics.com.br/home/na-midia/']"); }
	
	
	public By midiaValidation() { return By.xpath("//article[@class='col-xs-12 col-md-4 col-lg-4 posts-blog']"); }

}
