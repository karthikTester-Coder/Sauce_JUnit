package org.pagemanager;

import org.pages.SwagCart;
import org.pages.SwagFinish;
import org.pages.SwagInformation;
import org.pages.SwagLogin;
import org.pages.SwagOverview;
import org.pages.SwagProducts;


public class PageManager {
	private SwagLogin swaglogin;
	private SwagProducts swagproducts;
	private SwagCart Swagcart;
	private SwagInformation swaginformation;
	private SwagOverview swagOverview;
	private SwagFinish swagFinish;

	public SwagLogin getSwaglogin() {
		return(swaglogin==null)?swaglogin = new SwagLogin(): swaglogin;
	}

	public SwagProducts getSwagproducts() {
		return (swagproducts==null)?swagproducts=new SwagProducts():swagproducts;
	}

	public SwagCart getSwagcart() {
		return (Swagcart==null)?Swagcart=new SwagCart():Swagcart;
	}

	public SwagInformation getSwaginformation() {
		return (swaginformation==null)? swaginformation =new SwagInformation():swaginformation;
	}

	public SwagOverview getSwagOverview() {
		return(swagOverview==null)?swagOverview=new SwagOverview(): swagOverview;
	}

	public SwagFinish getSwagFinish() {
		return (swagFinish==null)? swagFinish=new SwagFinish():  swagFinish;
	}
	
	

}
