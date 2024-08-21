package org.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SwagFinish extends BaseClass {
	public SwagFinish() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.XPATH,using="//h2[@class='complete-header']")
private WebElement Final;
	public WebElement getFinal() {
		return Final;
	}
	
}
