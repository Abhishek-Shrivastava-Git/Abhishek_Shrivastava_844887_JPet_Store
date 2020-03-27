package com.StepDefinition;


import com.Pages.LoginUser_Page;
import cucumber.api.java.en.*;

public class LoginUser_JPet {

		
	LoginUser_Page ObjLogin = new  LoginUser_Page();


	@Given("^The User Launches Browser$")
	public void the_User_Launches_Browser() {
		ObjLogin.launchBrowser();
	}

	@When("^Opens the Login Page$")
	public void opens_the_Login_Page() throws Throwable {

		ObjLogin.homepage();

	}

	@Then("^Enters Username and Password$")
	public void enters_Username_and_Password() throws Throwable {

		for(int i=0;i<=1;i++)
		{
			ObjLogin.jpetUsername(i);
			ObjLogin.jpetPassword(i);
			ObjLogin.loginClick();
			Thread.sleep(4000);
			ObjLogin.signOut();
		}

	}

	@Then("^Click on Login button$")
	public void click_on_Login_Button() throws Throwable {
		ObjLogin.close();
	}



}

