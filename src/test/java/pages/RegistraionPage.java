package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseClass.TestBase;


public class RegistraionPage extends TestBase {

	HomePage homePage;

	@FindBy (id="id_username") WebElement userName_txt;
	@FindBy (id="id_password1") WebElement password_txt;
	@FindBy (id="id_password2") WebElement passwordConfm_txt;
	@FindBy (xpath="//input[@type='submit'] ") WebElement register_btn;
	@FindBy (xpath="//*[@class='alert alert-primary']") WebElement message;



	//constructor
	public RegistraionPage () {
		PageFactory.initElements(driver, this);
	}


	//methods
	public void validateRegistrationPage() {

		String title = driver.getTitle();
		Assert.assertEquals("Registration", title);
		System.out.println("User is on " +title+ " page " );
	}


	public void userNameTxt(String username) {

		userName_txt.sendKeys(username);

	}

	public void passwordTxt(String password) {

		password_txt.sendKeys(password);
	}

	public void passwordConfmTxt(String passwordConfm) {

		passwordConfm_txt.sendKeys(passwordConfm);

	}

	public void registrationBtn() {

		register_btn.click();
	}


	public String RegistrationValidationMsg() {

//		if(message.getText().contains("password_mismatch:The two password fields didn’t match.")) {
//
//			System.out.println(message.getText());
//		}
//		else if(message.getText().contains("New Account Created.")) {
//
//			System.out.println(message.getText());	
//			try {
//				homePage.validateHomePage();
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		else {
//			System.out.println(password_txt.getAttribute("validationMessage"));
//		}
//		String ExpectedErrorMessage = "New Account Created.";
		return message.getText();
		
	}

}