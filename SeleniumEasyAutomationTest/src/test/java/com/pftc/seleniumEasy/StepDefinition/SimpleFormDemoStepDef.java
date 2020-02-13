package com.pftc.seleniumEasy.StepDefinition;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;
import cucumber.api.Scenario;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.junit.Assert;

import com.pftc.seleniumEasy.PageObject.Base;
import com.pftc.seleniumEasy.PageObject.SimpleFormDemoPage;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.ExcelUtil;
import utilities.ReadWriteFromExcel;

public class SimpleFormDemoStepDef extends Base{
	
	@Before
	public void openBrowser() {
		Base.initializationBrowser();

	}
	
	@After
	
	 public void tearDown(Scenario scenario) throws InterruptedException{
        
        
        if (scenario.isFailed()) {
            try {
                scenario.write("Current Page URL is " + driver.getCurrentUrl());
               byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
               scenario.embed(screenshot, "image/png");
            }catch(WebDriverException somePlatformsDontSupportScreenshots) {
                System.err.println(somePlatformsDontSupportScreenshots.getMessage());
            }
                   
               }
                    
    Thread.sleep(5000);
    
   // driver.close();
    
    
   }
	
	
	SimpleFormDemoPage simpleFormDemo;
	ReadWriteFromExcel readWriteFromExcel;
	
	@Given("^User Navigate to SeleniumEasy Test Home Page$")
	public void user_Navigate_to_SeleniumEasy_Test_Home_Page() throws Throwable {
		String URL = prop.getProperty("firstApp");
		driver.get(URL);
		simpleFormDemo=new SimpleFormDemoPage();
		
	}

	@When("^User Click on Input Forms hyperlink tab$")
	public void user_Click_on_Input_Forms_hyperlink_tab() throws Throwable {
		simpleFormDemo.inputFormsButton();
	}

	@Then("^User Click on  Simple form Demo Hyperlink Test$")
	public void user_Click_on_Simple_form_Demo_Hyperlink_Test() throws Throwable {
		simpleFormDemo.simpleFormDemoButton();
	}

	@Then("^User Enter a message in the Enter message text box$")
	public void user_Enter_a_message_in_the_Enter_message_text_box() throws Throwable {
		simpleFormDemo.enterMessageTextBox();
	}

	@Then("^User Click on Show Message Button$")
	public void user_Click_on_Show_Message_Button() throws Throwable {
		simpleFormDemo.showMessageButton();
	}

	@Then("^User Validate the Message is been displayed in the Your Message section$")
	public void user_Validate_the_Message_is_been_displayed_in_the_Your_Message_section() throws Throwable {
		String a = simpleFormDemo.yourMessage().trim();
		//System.out.println(a);
		if (a.equalsIgnoreCase("Testing Simple Form Demo Single Input Field")) {
			System.out.println("Message Displayed correctly");
		}else {
			System.out.println("Message didn't display correctly");
		}
	}

	@Then("^User Enter a integer value in the Enter a text box$")
	public void user_Enter_a_integer_value_in_the_Enter_a_text_box() throws Throwable {
//		 readWriteFromExcel=new ReadWriteFromExcel();
//		String a= readWriteFromExcel.readExcel("TestData.xlsx",1, 6, 0);
//		System.out.println(a);
		
		simpleFormDemo.enterATextBox();
		
		
	}

	@Then("^User Enter (\\d+)nd integer value in the Enter b text box$")
	public void user_Enter_nd_integer_value_in_the_Enter_b_text_box(int arg1) throws Throwable {
		readWriteFromExcel=new ReadWriteFromExcel();
		String b= readWriteFromExcel.readExcel("TestData.xlsx",1, 6, 1);
		
		System.out.println(b);
		simpleFormDemo.enterB.sendKeys(b);
		Thread.sleep(5000);
	}

	@Then("^User Click on the Get Total button$")
	public void user_Click_on_the_Get_Total_button() throws Throwable {
		simpleFormDemo.getTotalButton();
		Thread.sleep(5000);
	}

	@Then("^User Validate the Total of a and b being displayed correctly$")
	public void user_Validate_the_Total_of_a_and_b_being_displayed_correctly() throws Throwable {
		
        String actualResult= readWriteFromExcel.readExcel("TestData.xlsx",1, 6, 2);      		
     	String expectedResult=simpleFormDemo.totalValue();
        Assert.assertEquals(expectedResult, actualResult);
	  
	}
	
	
	
	
	


	

	

	


	




	
	
	

	

	

}
