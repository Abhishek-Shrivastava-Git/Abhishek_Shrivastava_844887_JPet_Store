/*POM Page For Add To Cart WebPage*/

package com.Pages;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchAndAddToCart_Page {

	WebDriver driver;

	//Web_Elements_Of_Add_To_Cart_Page
	By SearchBox  =  By.xpath("//*[@id=\"SearchContent\"]/form/input[1]");
	By Searchbutton  =  By.xpath("//*[@id=\"SearchContent\"]/form/input[2]");
	By ProductID  =  By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[2]/b/a/font");
	By ItemID  =  By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[3]/td[1]/a");
	By AddToCart  =  By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[7]/td/a");

	//Launch_The_Chrome_Browser
	public void url() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","src\\test\\resources\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();

		//Maximize_The_Browser_Window
		driver.manage().window().maximize();

		//Wait_For_60_Sec
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		//Go_To_JPet_Website
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");
		Thread.sleep(2000);
	}

	//Insert_Text_In_Search_Box
	public void search() throws InterruptedException
	{
		driver.findElement(SearchBox).sendKeys("fish");
		Thread.sleep(2000);
	}

	//Click_Search_Button
	public void searchButton() throws InterruptedException
	{
		driver.findElement(Searchbutton).click();
		Thread.sleep(2000);
	}

	//Click_On_Product_ID
	public void productID() throws InterruptedException
	{
		driver.findElement(ProductID).click();
		Thread.sleep(2000);
	}

	//Click_On_Item_ID
	public void itemID() throws InterruptedException
	{
		driver.findElement(ItemID).click();
		Thread.sleep(2000);
	}

	//Click_On_Add_To_Cart_And_Close_Browser
	public void addToCart() throws InterruptedException
	{
		driver.findElement(AddToCart).click();
		Thread.sleep(2000);
	//	driver.close();
	}
	
	//Add to Cart_Screenshot 
	public void cartsScreenshot()throws IOException
	{

		File file =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String path = "ScreenShot\\TC3\\Cart.png";
		FileUtils.copyFile(file,new File(path));
		driver.close();
	}

	
	

}
