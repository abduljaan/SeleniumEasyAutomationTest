package com.pftc.seleniumEasy.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckBoxDemoPage extends Base{
	
	public CheckBoxDemoPage() {
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(linkText = "Checkbox Demo")
	public WebElement checkboxDemo;
	@FindBy(xpath="//*[@id=\"isAgeSelected\"]")
	public WebElement singleCheckBox;
	@FindBy(id="check1")
	public WebElement checkAll;
	@FindBy(id="check1")
	public WebElement unCheckAll;
	

	public void checkboxDemoLinkText() {
		checkboxDemo.click();
	}
	
	public void singleCheckBoxRadioButton() {
		singleCheckBox.click();
	}
	
	public void checkAllButton() {
		checkAll.click();
	}
	
	public String unCheckAllButton() {
		return unCheckAll.getText().trim();
	}
}
