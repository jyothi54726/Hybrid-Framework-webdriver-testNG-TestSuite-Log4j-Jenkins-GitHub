package com.hrms.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.General;

public class TC102 {

	@Test
	public void tc102() throws Exception{
		DOMConfigurator.configure("log4j.xml");
		General obj=new General();
		obj.openApplication();
		obj.login();
		obj.addEmp();
		obj.delEmp();
		obj.logout();
		obj.closeApplication();
	}
}
