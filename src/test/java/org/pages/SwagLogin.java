package org.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SwagLogin extends BaseClass{
	public SwagLogin() {
		PageFactory.initElements(driver, this);
	}
	@FindBys({@FindBy(id="user-name"),@FindBy(how=How.XPATH,using="//input[@id='user-name']")})
	public WebElement username;
	
	public WebElement getUsername() {
		return username;
	}
	public void setUsername(WebElement username) {
		this.username = username;
	}
	@FindBys({@FindBy(id="password"),@FindBy(how=How.XPATH,using="//input[@id='password']")})
	public WebElement password;
	public WebElement getPassword() {
		return password;
	}
	@FindBys({@FindBy(id="login-button"),@FindBy(how=How.XPATH,using="//input[@id='login-button']")})
	public WebElement login;
	public WebElement getLogin() {
		return login;
	}
	
	
	
	

}
