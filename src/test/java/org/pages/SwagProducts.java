package org.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SwagProducts extends BaseClass {
	public SwagProducts() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(how=How.XPATH,using="(//button[text()='ADD TO CART'])[1]")
	public WebElement LabsBackpack;
	public WebElement getLabsBackpack() {
		return LabsBackpack;
	}


	@FindBy(how=How.XPATH,using="(//button[text()='ADD TO CART'])[2]")
	
	public WebElement BikeLight;

	public WebElement getBikeLight() {
		return BikeLight;
	}
	@FindBy(how=How.XPATH,using="//a[@class='shopping_cart_link fa-layers fa-fw']")
	public WebElement addcart;
	public WebElement getAddcart() {
		return addcart;
	} 
	
	
	
}
	

