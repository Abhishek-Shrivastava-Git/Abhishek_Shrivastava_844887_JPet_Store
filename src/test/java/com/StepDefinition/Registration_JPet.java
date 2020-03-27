package com.StepDefinition;


import org.openqa.selenium.WebDriver;


import com.Pages.Registration_Page;

import cucumber.api.java.en.*;

public class Registration_JPet {
	
	public WebDriver driver;
	
	Registration_Page ObjReg = new  Registration_Page();
	

	@Given("^The User Launches the Browser$")
	public void the_User_Launches_the_Browser() throws Throwable {
		ObjReg.launch();
	}

	@And("^The User is on Registeration Page$")
	public void the_User_is_on_Registeration_Page() throws Throwable {
		ObjReg.url();
	}

	@Then("^Enter the Details and take Screenshot$")
	public void enter_the_Details_and_take_Screenshot() throws Throwable {
		ObjReg.enterDetails();
		ObjReg.screenshot();
	}

	@Then("^Complete the Registration$")
	public void complete_the_Registration() throws Throwable {
		ObjReg.closeRegistration();
		Thread.sleep(5000);		
	}
	
	@Then("^Signin and Go to Account Pages and take Screenshot$")
	public void signin_and_Go_to_Account_Pages_and_take_Screenshot() throws Throwable {
	
		ObjReg.sigin();
		ObjReg.screenshot2();
		ObjReg.end();
	}


}


