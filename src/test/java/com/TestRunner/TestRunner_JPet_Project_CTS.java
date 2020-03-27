/*------------Test_Runner_File_Using_JUnit------------*/

package com.TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

		//Path_Of_Feature_File**********************************************************
		features  = {"src\\main\\resources\\Feature\\JPet_Project_CTS.feature"},

		plugin = {"pretty", "html:Reports/cucumber-html-report","json:Reports/cucumber-json-report/jsonreport","com.cucumber.listener.ExtentCucumberFormatter:Reports/cucumber-Extentreport-report//report.html"},

		//Test_Cases_To_Be_Executed****************************************************
		tags = {"@TC_01_Registeration,@TC_02_Login_The_User,@TC_03_Search_Product_Add_To_Cart,@TC_04_Print_Table,@TC_05_Signout_User_From_JPet_Web_Application"},

		

		//Package_Name_Containing_Step_Definition_Files*************************************
		glue = {"com.StepDefinition"},
		//dryRun = true,
		monochrome=true

		)

//
public class TestRunner_JPet_Project_CTS {

}