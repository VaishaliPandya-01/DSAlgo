package stepDefinations;

import baseClass.TestBase;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;

public class LoginSD extends TestBase{
	
	HomePage homePage = new HomePage();
	LoginPage login = new LoginPage();
	
	@Then("The user should see 6 panels with different structures")
	public void the_user_should_see_panels_with_different_structures() {		
		try {
			homePage.validateHomePage();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("user clicks DataStructures dropdown")
	public void user_clicks_DataStructures_dropdown() throws InterruptedException{
		homePage.DataStrDropdownClick();
	}
	
	@Then("user should see 6 different data structures in dropdown")
	public void user_should_see_different_data_structures_in_that_dropdown()throws InterruptedException {
		homePage.DataStrDropdownClick();
	}
	
	@And("user select one data structure from dropdown")
	public void user_select_one_data_structure_from_dropdown() throws InterruptedException {
		homePage.DataStrDropdownClick();
		homePage.clickDropDownValue();
	}
	
    @Then("error message should be displayed")
    public void error_message_should_be_displayed () {
    	homePage.NotLoggedInMsg();
    	driver.close();
    }
	
	@When("user clicks on sign In link")
	public void user_clicks_on_sign_in_link() {
		homePage.signInBtn();
	}

	
	@Then("user should be landed on login page")
	public void user_should_be_landed_on_login_page() {
		login.validateLoginPage();
	}

	@And("^user enters (.*) and (.*)$")
	public void user_enters_username_and_Password(String username,String Password) {
		login.userNameTxt(username);
		login.passwordTxt(Password);
	}

	@And("click on login")
	public void click_on_login() {
		login.loginBtn();
	}

	
	@Then("if login is sucessful user should be redirected to homepage or error message should display")
	public void if_login_is_sucessful_user_should_be_redirected_to_homepage_or_error_message_should_display() {
//		try {
//			homePage.validateHomePage();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		login.LoginValidationMsg();
		driver.close();
	}
}
