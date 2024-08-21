package org.execution;

import org.base.BaseClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.pagemanager.PageManager;

public class TC02_SwagProducts extends BaseClass{
	public static BaseClass base=new BaseClass();
	public static PageManager pageManager=new PageManager();
	@BeforeClass
	public static void swag() {
		try {
			if(pageManager.getSwagproducts().getLabsBackpack().isDisplayed()) {
				System.out.println("user_Identify_correctly");
				if(pageManager.getSwagproducts().getBikeLight().isEnabled()){
					System.out.println("User_identify_sucessfully");
				}
				else {
					System.out.println("User_Invalid_Identify");
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
@Test
public void products() {
	try {
		WebElement labsBackpack = pageManager.getSwagproducts().getLabsBackpack();
		base.clickByJava(labsBackpack);
		WebElement bikeLight = pageManager.getSwagproducts().getBikeLight();
		base.clickByJava(bikeLight);
		WebElement addcart = pageManager.getSwagproducts().getAddcart();
		base.clickByJava(addcart);
		
	} catch (Exception e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
	
}
}
