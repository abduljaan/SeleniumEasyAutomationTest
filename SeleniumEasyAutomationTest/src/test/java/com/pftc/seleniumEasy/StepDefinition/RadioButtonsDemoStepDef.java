package com.pftc.seleniumEasy.StepDefinition;



import java.awt.Robot;
import java.awt.event.KeyEvent;

import com.mysql.cj.x.protobuf.MysqlxExpect.Open.Condition.Key;
import com.pftc.seleniumEasy.PageObject.Base;
import com.pftc.seleniumEasy.PageObject.JquerySelectDropDownPage;

import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class RadioButtonsDemoStepDef extends Base {
	Robot rbt;
	JquerySelectDropDownPage jquerySelectDropDownPage;
	
	@Then("^user use donwn arrow to select radio button demo$")
	public void user_use_donwn_arrow_to_select_radio_button_demo() throws Throwable {
	   rbt = new Robot();
       rbt.keyPress(KeyEvent.VK_DOWN);
       rbt.keyRelease(KeyEvent.VK_DOWN);
       Thread.sleep(3000);
       
       
       rbt.keyPress(KeyEvent.VK_DOWN);
       rbt.keyRelease(KeyEvent.VK_DOWN);
       Thread.sleep(3000);
       
       rbt.keyPress(KeyEvent.VK_DOWN);
       rbt.keyRelease(KeyEvent.VK_DOWN);
       Thread.sleep(3000);
       
       rbt.keyPress(KeyEvent.VK_ENTER);
       rbt.keyRelease(KeyEvent.VK_ENTER);
       Thread.sleep(3000);
      
     
}
	@Then("^user clicks on male radio option$")
	public void user_clicks_on_male_radio_option() throws Throwable {
		jquerySelectDropDownPage = new JquerySelectDropDownPage();
		jquerySelectDropDownPage.selectgender();
		Thread.sleep(2000);
	}
	
	@Then("^user verifies text message$")
	public void user_verifies_text_message() throws Throwable {
	String 	expectedresults = "Radio button is Not checked";
	String actualresults = jquerySelectDropDownPage.displaytext.getText();
	org.junit.Assert.assertEquals(expectedresults, actualresults);
	}


	@Then("^user dropdown arrow to click on get check value$")
	public void user_dropdown_arrow_to_click_on_get_check_value() throws Throwable {
		rbt.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		
		jquerySelectDropDownPage.clicktab();
		
		  rbt.keyPress(KeyEvent.VK_CONTROL);
	       rbt.keyPress(KeyEvent.VK_P);
	       Thread.sleep(2000);
	       
	       //rbt.keyRelease(KeyEvent.VK_CONTROL);
	      // rbt.keyRelease(KeyEvent.VK_P);
	       rbt.keyPress(KeyEvent.VK_PRINTSCREEN);
	       rbt.keyRelease(KeyEvent.VK_PRINTSCREEN);
	       rbt.keyPress(KeyEvent.VK_ENTER);
	       Thread.sleep(2000);
           rbt.keyPress(KeyEvent.VK_DOWN);
           rbt.keyRelease(KeyEvent.VK_DOWN);
	       Thread.sleep(2000);
	       //jquerySelectDropDownPage.printpage();
	      
	}

	
	
	
	
	
	
	
	
	
	
	
}