package org.execution;

import org.base.BaseClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.pagemanager.PageManager;

public class TC04_SwagInformation extends BaseClass{
	public static BaseClass base=new BaseClass();
	public static PageManager pageManager=new PageManager();
	
	@BeforeClass
	public static void information() {
		try {
			if(pageManager.getSwaginformation().getFirstName().isDisplayed()) {
				System.out.println("Sucessfully_Entered");
				if(pageManager.getSwaginformation().getLastNmae().isEnabled()) {
					System.out.println("Sucessfully_Entered_value");
					if(pageManager.getSwaginformation().getPostelCode().isSelected()) {
						System.out.println("Pin_Code_isCorrect");
					}
					else {
						System.out.println("Invalid_Credential");
					}
				}
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
@Test
public void swaginfo() {
	try {
		WebElement firstName = pageManager.getSwaginformation().getFirstName();
		base.sendKeysByJava(firstName, base.readExcel(4, 1));
		WebElement lastNmae = pageManager.getSwaginformation().getLastNmae();
		base.sendKeysByJava(lastNmae, base.readExcel(5, 1));
		WebElement postelCode = pageManager.getSwaginformation().getPostelCode();
		base.sendKeysByJava(postelCode, base.readExcel(6, 1));
		WebElement continue1 = pageManager.getSwaginformation().getContinue();
		base.clickByJava(continue1);
		
		
	} catch (Exception e) {
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
}
}
