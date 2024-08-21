package org.runner;

import org.execution.TC01_SwagLogin;
import org.execution.TC02_SwagProducts;
import org.execution.TC03_SwagCart;
import org.execution.TC04_SwagInformation;
import org.execution.TC05_SwagOverview;
import org.execution.TC06_SwagFinish;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	TC01_SwagLogin.class,TC02_SwagProducts.class,TC03_SwagCart.class,TC04_SwagInformation.class,TC05_SwagOverview.class,TC06_SwagFinish.class
	
})
public class TestRunner {

}
