/*POM Page For SignOut WebPage*/

package com.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SignoutUser_Page {

	WebDriver driver;

	//Web_Elements_Of_SignOut_Page
	By SignIn = By.xpath("//*[@id=\"MenuContent\"]/a[2]");
	By UserName = By.name("username");
	By PassWord = By.name("password");
	By Submit = By.xpath("//*[@id=\"Catalog\"]/form/input");
	By SignOut = By.xpath("//*[@id=\"MenuContent\"]/a[2]");


	//Launch_The_Chrome_Browser
	public void url() {
		System.setProperty("webdriver.chrome.driver","src\\test\\resources\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();

		//Maximize_The_Browser_Window
		driver.manage().window().maximize();

		//Wait_For_60_Sec
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

	//Go_To_JPet_Website
	public void loginPage()
	{
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");
	}

	//SignIn_JPet_WebApplication
	public void loginUser() {

		WebElement link =driver.findElement(SignIn); 

		Actions action = new Actions(driver);
		action.moveToElement(link);
		action.click().perform();

		driver.findElement(UserName).sendKeys("Tom");
		driver.findElement(PassWord).clear(); 
		driver.findElement(PassWord).sendKeys("Qwerty"); 
	}

	//Click_Submit_Button
	public void submitButton() 
	{
		driver.findElement(Submit).click(); 
	}

	//Click_SignOut_Button
	public void signOutUser()
	{
		driver.findElement(SignOut).click();
		driver.close();
	}

	public void enterdetails(String unam,String pswrd) {

		driver.findElement(UserName).sendKeys(unam);
		driver.findElement(PassWord).clear(); 
		driver.findElement(PassWord).sendKeys(pswrd);
		driver.findElement(Submit).click(); 
	}

	public void checklogin() {

		if(driver.getPageSource().contains("Sign out")) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}



	}

}
