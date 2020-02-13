package com.pftc.seleniumEasy.PageObject;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ExcelUtil;
import utilities.ReadWriteFromExcel;

public class SimpleFormDemoPage extends Base {
	
	ReadWriteFromExcel readWriteFromExcel=new ReadWriteFromExcel();

	public SimpleFormDemoPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Input Forms")
	public WebElement inputForms;
	@FindBy(linkText = "Simple Form Demo")
	public WebElement simpleFormDemo;
	@FindBy(xpath = "//*[@id=\"user-message\"]")
	public WebElement enterMessageBox;
	@FindBy(xpath = "//*[@id=\"get-input\"]/button")
	public WebElement showMessage;
	@FindBy(xpath = "//*[@id=\"display\"]")
	public WebElement displayMessage;
	@FindBy(xpath = "//*[@id=\"sum1\"]")
	public WebElement enterA;
	@FindBy(xpath = "//*[@id=\"sum2\"]")
	public WebElement enterB;
	@FindBy(xpath = "//*[@id=\"gettotal\"]/button")
	public WebElement getTotal;
	@FindBy(id = "displayvalue")
	public WebElement total;
	
	public void inputFormsButton() {
		inputForms.click();
	}

	public void simpleFormDemoButton() {
		simpleFormDemo.click();
	}

	public void enterMessageTextBox() {
		enterMessageBox.sendKeys("Testing Simple Form Demo Single Input Field");

	}

	public void showMessageButton() {
		showMessage.click();
	}

	public String yourMessage() {
		return displayMessage.getText();
	}
	public void enterATextBox() throws IOException, InterruptedException {
		
		   readWriteFromExcel=new ReadWriteFromExcel();
			String a= readWriteFromExcel.readExcel("TestData.xlsx",1, 6, 0);
			System.out.println(a);	
		    enterA.sendKeys(a);
		    Thread.sleep(5000);
		
	}

	public void enterBTextBox() throws Exception {
	
		String b=ExcelUtil.getExcelCellData(0, 6, 1);
		enterB.sendKeys(b);
	}

	public void getTotalButton() {
		getTotal.click();
	}

	public String totalValue() {
		return total.getText();
	}

}
