package OneStopStepDef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pftc.seleniumEasy.PageObject.Base;

import OneStopPages.SelectClassFbHomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SelectClassFB extends Base{
	
	SelectClassFbHomePage selectClassFbHomePage;
	
	@Given("^user navigates to facebook login page$")
	public void user_navigates_to_facebook_login_page() throws Throwable {
		//WebDriver driver = new  ChromeDriver();
		//System.setProperty("webdriver.chrome.driver", "/src/test/resources/drivers/chromedriver.exe");
		//String URL1 = prop.getProperty("testApp");
	    driver.get("https://www.facebook.com/");
	    
	}

	@Then("^user completes sign up page$")
	public void user_completes_sign_up_page() throws Throwable {
		selectClassFbHomePage = new SelectClassFbHomePage();
		selectClassFbHomePage.emailorpw("abc@test");
		selectClassFbHomePage.passwrd("121222");
		//selectClassFbHomePage.click_on_signin_button();
		Thread.sleep(3000);
		
		selectClassFbHomePage.FirstName("abdul");
		selectClassFbHomePage.lastname("khan"); 
		//selectClassFbHomePage.CellNumber("2112222");
		selectClassFbHomePage.CellNumber("&^&%00000000");
		selectClassFbHomePage.newPW("53533343");
		
	}

	@Then("^user clicks sign up tab$")
	public void user_clicks_sign_up_tab() throws Throwable {
		selectClassFbHomePage.clickonsignup();
		
	}

}
	
	
	
	
	
	
	


