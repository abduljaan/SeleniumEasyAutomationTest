package com.pftc.seleniumEasy.StepDefinition;

import com.pftc.seleniumEasy.PageObject.Base;

import cucumber.api.java.en.Given;
import utilities.DataBaseUtil;

public class DatabseUtilStepDef extends Base{
	
	
	DataBaseUtil dataBaseUtil=new DataBaseUtil();
	
	
	
	@Given("^User Read Data form Table$")
	public void user_Read_Data_form_Table() throws Throwable {
		String query = prop.getProperty("myQuery1");
		String query1=prop.getProperty("myQuery2");
		
		
		
		dataBaseUtil.readFromDatabase(query);
		System.out.println("###########################################");
		dataBaseUtil.readFromDatabase(query1);
	}

}
