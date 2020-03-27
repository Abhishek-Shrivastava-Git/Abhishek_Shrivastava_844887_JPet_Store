package com.StepDefinition;

import com.Pages.SearchAndAddToCart_Page;

import cucumber.api.java.en.*;

public class SearchAndAddToCart_JPet {

	SearchAndAddToCart_Page ObjSrch = new SearchAndAddToCart_Page();

	@Given("^Open the Browser and Go To JPet homepage$")
	public void open_the_Browser_and_Go_To_JPet_homepage() throws Throwable {	   
		ObjSrch.url();
	}

	@When("^The Webpage Opens, Enter Search Content$")
	public void the_Webpage_Opens_Enter_Search_Content() throws Throwable {
		ObjSrch.search();
	}

	@Then("^Click Search button$")
	public void click_Search_button() throws Throwable {
		ObjSrch.searchButton();
	}

	@Then("^Click  Product ID$")
	public void click_Product_ID() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		ObjSrch.productID();
	}

	@Then("^Click Item ID$")
	public void click_Item_ID() throws Throwable {
		ObjSrch.itemID();
	}

	@Then("^Click AddToCart and take Screenshot$")
	public void click_AddToCart_and_take_Screenshot() throws Throwable {
		ObjSrch.addToCart();
		ObjSrch.cartsScreenshot();
	}
	
}
