package org.execution;

import org.base.BaseClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.pagemanager.PageManager;

public class TC03_SwagCart extends BaseClass{
	public static BaseClass base=new BaseClass();
	public static PageManager pageManager=new PageManager();
	
	@BeforeClass
	public static void swagCart() {
		try {
			if(pageManager.getSwagcart().getCheckOut().isDisplayed()) {
				System.out.println("User_EnteredSucessfully_productPage");
				if(pageManager.getSwagcart().getCartPage().isEnabled()) {
					System.out.println("User_Checkout_Sucessfully");
				}
				else {
					System.out.println("UnSucessfully_CheckOut");
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
@Test
public void Cart() {
	try {
		WebElement checkOut = pageManager.getSwagcart().getCheckOut();
		base.clickByJava(checkOut);
		
			
	} catch (Exception e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
}
}
