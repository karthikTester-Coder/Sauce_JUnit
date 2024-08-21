package org.execution;

import org.base.BaseClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.pagemanager.PageManager;

public class TC05_SwagOverview extends BaseClass {
	public static BaseClass base=new BaseClass();
	public static PageManager pageManager=new PageManager();
	
	
	@BeforeClass
	public static void SwagOver() {
		try {
			if(pageManager.getSwagOverview().getFinish().isDisplayed()) {
				System.out.println("Click_Sucessfully");
			}
			else {
				System.out.println("Did_Not_ClickButton");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
@Test
public void Overview() {
	try {
		WebElement finish = pageManager.getSwagOverview().getFinish();
		base.clickByJava(finish);
		
	} catch (Exception e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
}
}
