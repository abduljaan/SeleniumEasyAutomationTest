package com.pftc.seleniumEasy.PageObject;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JquerySelectDropDownPage extends Base {
	
	public JquerySelectDropDownPage(){
		
		PageFactory.initElements(driver, this);
	}
	/*abslute x path
	 //input[@name="optradio"and @value ="Male"]
	 */
	
	@FindBy (xpath="//input[@name='optradio'and @value ='Male']") public  WebElement gender;
	public void selectgender() {
		gender.click();
		
	
	
		/*
		 * @FindBy
		 * (xpath="//*[@id=\'easycont\']/div/div[2]/div[1]/div[2]/label[1]/input")
		 * public WebElement gender; public void selectgender() { gender.click();
		 */
		
		}
	
	@FindBy (id="buttoncheck") public WebElement button_check;
	public void clicktab() {
		button_check.click();
		
	}
	
	@FindBy (xpath="//*[@id=\'easycont\']/div/div[2]/div[1]/div[2]/p[3]") public WebElement displaytext;
	
	
	

}
