package org.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SwagInformation extends BaseClass {
	public SwagInformation() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.XPATH,using="//input[@id='first-name']")
	private WebElement FirstName;
	public WebElement getFirstName() {
		return FirstName;
	}
	@FindBy(how=How.XPATH,using="//input[@id='last-name']")
	private WebElement LastNmae;
	public WebElement getLastNmae() {
		return LastNmae;
	}
	@FindBy(how=How.XPATH,using="//input[@id='postal-code']")
	private WebElement PostelCode;
	public WebElement getPostelCode() {
		return PostelCode;
	}
	@FindBy(how=How.XPATH,using="//input[@class='btn_primary cart_button']")
	private WebElement Continue;
	public WebElement getContinue() {
		return Continue;
	}
	
}
