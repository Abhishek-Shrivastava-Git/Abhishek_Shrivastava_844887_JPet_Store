/*POM Page For Login WebPage*/

package com.Pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Utility.Excel_Read;




public class LoginUser_Page {

	public WebDriver dr;

	//Web_Elements_Of_Login_Page
	By SignIn = By.xpath("//*[@id=\"MenuContent\"]/a[2]");
	By UserName = By.name("username"); 
	By PassWord = By.name("password"); 
	By Login =By.xpath("//*[@id=\"Catalog\"]/form/input");
	By SignOut = By.xpath("//*[@id=\"MenuContent\"]/a[2]");

	



	//Launch_The_Chrome_Browser
	public void launchBrowser() 
	{
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\Driver\\chromedriver.exe");
		dr= new ChromeDriver();

		//Maximize_The_Browser_Window
		dr.manage().window().maximize();

		//Wait_For_60_Sec
		dr.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		//Go_To_JPet_Website
		dr.get("https://petstore.octoperf.com/actions/Catalog.action");

	}


	//Go_To_Login_Page
	public void homepage() throws InterruptedException 
	{
		dr.findElement(SignIn).click(); 
		Thread.sleep(5000);

	}

	//Read_UserName_From_Excel_File_And_Insert_In_Username_Box
	public void jpetUsername(int i) throws IOException
	{
		dr.findElement(UserName).clear();
		Excel_Read read=new Excel_Read();
		dr.findElement(UserName).sendKeys(read.Excel_Username(i));
	}

	//Read_Password_From_Excel_File_And_Insert_In_Pasword_Box
	public void jpetPassword(int i) throws IOException 
	{
		dr.findElement(PassWord).clear();
		Excel_Read read=new Excel_Read();
		dr.findElement(PassWord).sendKeys(read. Excel_Password(i));	
	}

	//Click_The_Submit_Button
	public void loginClick() throws InterruptedException 
	{
		dr.findElement(Login).click();	
		Thread.sleep(5000);
	}
	
	//Click_SignOut
	public void signOut() throws InterruptedException {
		dr.findElement(SignOut).click();
		dr.findElement(SignIn).click(); 
		Thread.sleep(5000);
	}

	//Close_The_Browser
	public void close()
	{
		dr.close();
	}

	
	

}
