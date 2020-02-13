package com.pftc.seleniumEasy.StepDefinition;

import cucumber.api.java.en.Given;
import utilities.ReadWriteTxtFile;

public class ReadDataFromTxtFileStepDef {
	
	ReadWriteTxtFile readWriteTxt=new ReadWriteTxtFile();
	
	@Given("^User Read the TXT File$")
	public void user_Read_the_TXT_File() throws Throwable {
	   
		readWriteTxt.readFromTxtFile("test2.txt");
		
		
	}
	
	
	
	@Given("^User Write to TXT File$")
	public void user_Write_to_TXT_File() throws Throwable {
		readWriteTxt.writeToTxtFile("test2.txt", "This is awesome");
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
