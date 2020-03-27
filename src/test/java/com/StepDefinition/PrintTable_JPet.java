package com.StepDefinition;

import com.Pages.PrintTable_Page;

import cucumber.api.java.en.*;

public class PrintTable_JPet {

	PrintTable_Page ObjPrntTbl = new PrintTable_Page();

	@Given("^Open the Browser and Go To JPet Homepage$")
	public void open_the_Browser_and_Go_To_JPet_Homepage() throws Throwable {
		ObjPrntTbl.url();
	}
	
	@And("^Click on Pet$")
	public void click_on_Pet() throws Throwable {
		ObjPrntTbl.pet();
	}

	@Then("^Print the Table Details$")
	public void print_the_Table_Details() throws Throwable {
		ObjPrntTbl.tablePrint();
	}

	@Then("^Close Browser$")
	public void close_Browser() throws Throwable {
		ObjPrntTbl.end();
}
}
