package org.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SwagCart extends BaseClass{
	public SwagCart() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(how=How.XPATH,using="//div[@class='subheader']")
	private WebElement CartPage;
	public WebElement getCartPage() {
		return CartPage;
	}
	@FindBy(how=How.XPATH,using="//a[text()='CHECKOUT']")
	private WebElement CheckOut;
	public WebElement getCheckOut() {
		return CheckOut;
	}
	
	}
	

