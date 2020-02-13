package com.pftc.seleniumEasy.PageObject;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestCheckBoxDemoPage extends Base {
	
	public TestCheckBoxDemoPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"navbar-brand-centered\"]/ul[1]/li[1]/ul/li[2]/a") public WebElement checkboxdemo;
	
	@FindBy (id ="isAgeSelected") public WebElement checkbox;
    public void checkbox() {checkbox.click();}

    @FindBy (id="txtAge") public WebElement success_txt_message;  // inspecting Success - Check box is checked
    
    @FindBy (xpath ="//input[@ id = \"check1\" and @ value=\"Check All\"]") public WebElement checkall;
    
    @FindBy (xpath ="//input[@value =\"Uncheck All\" and @id =\"check1\"]") // inpecting uncheck all message
    public WebElement uncheckall;
    
}