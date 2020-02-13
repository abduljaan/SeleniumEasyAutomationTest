package com.pftc.seleniumEasy.StepDefinition;

import org.junit.Assert;

import com.pftc.seleniumEasy.PageObject.Base;
import com.pftc.seleniumEasy.PageObject.TestCheckBoxDemoPage;

import cucumber.api.java.en.Then;


public class TestChecBoxDemoStepDef extends Base {
	
	
	
	TestCheckBoxDemoPage testCheckBoxDemoPage;
	
	@Then("^user click on Checkbox demo feature$")
	public void user_click_on_Checkbox_demo_feature() throws Throwable {
		testCheckBoxDemoPage = new TestCheckBoxDemoPage();
		testCheckBoxDemoPage.checkboxdemo.click();
	    
	}

	@Then("^user click on click this check box option$")
	public void user_click_on_click_this_check_box_option() throws Throwable {
		testCheckBoxDemoPage.checkbox();
	   
	}

	@Then("^user verifies success checkbox message displayies$")
	public void user_verifies_success_checkbox_message_displayies() throws Throwable {
	String 	expected = "Success - Check box is checked";
	String  actualvalue = testCheckBoxDemoPage.success_txt_message.getText();
	Assert.assertEquals(expected, actualvalue);
		
		
	   
	}



@Then("^user click on check all tab$")
public void user_click_on_check_all_tab() throws Throwable {
	testCheckBoxDemoPage.checkall.click();
	Thread.sleep(2000);
}
	

@Then("^user verifyes check all message displayes$")
public void user_verifyes_check_all_message_displayes() throws Throwable {
 String expectedresult = "Uncheck All";
 String actual = testCheckBoxDemoPage.uncheckall.getAttribute("value");
 Assert.assertEquals(expectedresult, actual);
 
}
	
	

}
