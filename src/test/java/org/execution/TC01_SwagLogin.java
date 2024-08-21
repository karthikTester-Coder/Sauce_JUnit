package org.execution;

import org.base.BaseClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.pagemanager.PageManager;

public class TC01_SwagLogin extends BaseClass{
	public static BaseClass base=new BaseClass();
	public static PageManager pageManager=new PageManager();
	
	
	
	@BeforeClass
	public static void swag() {
		try {
			BaseClass base=new BaseClass();
			base.getDriver(base.readExcel(0, 1));
			base.sleep(1000);
			base.launchUrl(base.readExcel(1,1));
			base.winMax();
			
			System.out.println("Browser_Launched");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	@Test
public void Login() {
	try {
		WebElement username = pageManager.getSwaglogin().getUsername();
		base.sendKeysByJava(username, base.readExcel(2, 1));
		WebElement password = pageManager.getSwaglogin().getPassword();
		base.sendKeysByJava(password, base.readExcel(3, 1));
		WebElement login = pageManager.getSwaglogin().getLogin();
		base.clickByJava(login);
		
	} catch (Exception e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
}
}
