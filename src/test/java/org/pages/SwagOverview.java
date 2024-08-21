package org.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SwagOverview extends BaseClass{
	public SwagOverview() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.XPATH,using="//a[@class='btn_action cart_button']")
	private WebElement Finish;
	public WebElement getFinish() {
		return Finish;
	}
	

}
