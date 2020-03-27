package com.StepDefinition;

import com.Pages.SignoutUser_Page;

import cucumber.api.java.en.*;

public class SignoutUser_JPet {

	SignoutUser_Page ObjSout = new SignoutUser_Page();

	@Given("^Launch the Chrome Browser$")
	public void launch_the_Chrome_Browser() throws Throwable {
		ObjSout.url();
	}

	@When("^Open the JPet Web Application$")
	public void open_the_JPet_Web_Application() throws Throwable {
		ObjSout.loginPage();
	}

	@Then("^Click the Login button$")
	public void click_the_Login_button() throws Throwable {
		ObjSout.loginUser();
	}

	@Then("^Enter the Username, Password and Click Login button$")
	public void enter_the_Username_Password_and_Click_Login_button() throws Throwable {
		ObjSout.submitButton();
	}

	@Then("^If User is logged in then Click the Signout button$")
	public void if_User_is_logged_in_then_click_the_Signout_button() throws Throwable {	
		ObjSout.signOutUser();
	}

}
