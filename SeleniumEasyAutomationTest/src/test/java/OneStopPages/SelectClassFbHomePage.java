package OneStopPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pftc.seleniumEasy.PageObject.Base;

public class SelectClassFbHomePage extends Base {
	
		
	public SelectClassFbHomePage() {
		PageFactory.initElements(driver, this);
			
	}
	@ FindBy (id="email") public WebElement Email;
	public void emailorpw(String email)  {
		Email.sendKeys(email);}
	
	@FindBy  (id= "pass") public WebElement Password;
	public void passwrd(String password) {
		Password.sendKeys(password);
	}
	
	@FindBy(xpath="//*[@id=\"loginbutton\"]")	public WebElement signup;
	public void click_on_signin_button() {signup.click();}
		
	
	@FindBy (id="u_0_m")  public WebElement FirstName;
	public void FirstName(String firstname) {FirstName.sendKeys(firstname);}
		
	
	@FindBy (id="u_0_o")  public   WebElement LastName;
	public void lastname(String lastname) {LastName.sendKeys(lastname);}
	
	@FindBy (id= "u_0_r") public WebElement PhNumber;
	public void CellNumber(String string) {PhNumber.sendKeys(string);}
	
	
	@FindBy (id = "u_0_w")  public WebElement NewPW;
	public void newPW (String string) {NewPW.sendKeys(string);}
	
	
	@FindBy (id= "u_0_w") public WebElement SignUp;
	public void clickonsignup () {SignUp.click();}
	
	
}