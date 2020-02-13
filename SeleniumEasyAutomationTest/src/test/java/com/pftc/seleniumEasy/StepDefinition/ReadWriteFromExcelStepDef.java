package com.pftc.seleniumEasy.StepDefinition;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;

import com.pftc.seleniumEasy.PageObject.Base;

import cucumber.api.java.en.Given;
import utilities.ExcelUtil;
import utilities.ReadWriteFromExcel;

public class ReadWriteFromExcelStepDef extends Base{

	
	ReadWriteFromExcel readWriteFromExcel=new ReadWriteFromExcel();
	
	
	
	@Given("^User Read data form Excel File$")
	public void user_Read_data_form_Excel_File() throws Exception{	
		
		ReadWriteFromExcel readWriteFromExcel=new ReadWriteFromExcel();
		String b= readWriteFromExcel.readExcel("TestData.xlsx",1, 6, 1);
		String total= readWriteFromExcel.readExcel("TestData.xlsx",1, 6, 2);
		
		System.out.println(b);
		System.out.println(total);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
