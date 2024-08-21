package org.execution;

import org.base.BaseClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.pagemanager.PageManager;

public class TC06_SwagFinish extends BaseClass {
	public static BaseClass base=new BaseClass();
	public static PageManager pageManager=new PageManager();
	
	@BeforeClass
	public static void finish() {
		try {
			if(pageManager.getSwagFinish().getFinal().isDisplayed()) {
				System.out.println("THANK YOU FOR YOUR ORDER");
			}
			else {
				System.out.println("Please Visit Again");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
@Test
public void finishpage() {
	try {
		WebElement final1 = pageManager.getSwagFinish().getFinal();
		base.clickByJava(final1);
		
	} catch (Exception e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
}
}
