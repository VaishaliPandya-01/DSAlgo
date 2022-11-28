package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;
import org.junit.Assert;

import baseClass.TestBase;

public class LoginPage extends TestBase {



	@FindBy (id="id_username") WebElement userName_txt;
	@FindBy (id="id_password") WebElement password_txt;
	@FindBy (xpath="//input[@type='submit'] ")WebElement login_btn;
	@FindBy (xpath = "//*[@class='alert alert-primary']") WebElement Message;


	public LoginPage() {

		PageFactory.initElements(driver, this);
	}



	public void validateLoginPage() {

		String title = driver.getTitle();
		Assert.assertEquals("Login", title);
		System.out.println("User is on " + title + "page");
				
	}


	public void userNameTxt(String username) {

		userName_txt.sendKeys(username);
	}


	public void passwordTxt(String Password) {

		password_txt.sendKeys(Password);
	}


	public void loginBtn() {

		login_btn.click();
	}

	public void LoginValidationMsg() {

		String ExpectedErrorMessage = "You are logged in";
		String actualErrorMessage = Message.getText();

		SoftAssert SA = new SoftAssert();
		SA.assertEquals(actualErrorMessage,ExpectedErrorMessage);
		System.out.println(actualErrorMessage);
		SA.assertAll();

	}



	//		String ExpectedErrorMessage = "You are logged in";
	//		String actualErrorMessage = Message.getText();
	//		try {
	//		Assert.assertEquals(ExpectedErrorMessage,actualErrorMessage);
	//		System.out.println(actualErrorMessage);
	//	}
	//	catch(Exception e) {
	//		e.printStackTrace();	
	//	}
	//	}

	//		if(Message.getText().contains("Invalid Username and Password")) {
	//
	//			System.out.println(Message.getText());
	//		}
	//
	//		else if (Message.getText().contains("You are logged in")) {
	//
	//			System.out.println(Message.getText());
	//		}
	//		else {
	//			System.out.println(password_txt.getAttribute("validationMessage"));
	//		}
	//	}

	public HomePage doLogin(String uname , String pwd) {
		userName_txt.sendKeys(uname);
		password_txt.sendKeys(pwd);
		login_btn.click();
		return new HomePage();
	}



}





