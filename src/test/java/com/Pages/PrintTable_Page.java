/*POM Page For Table WebPage*/

package com.Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTable_Page {

	WebDriver driver;

	//Web_Elements_Of_Table_Page
	By  Pet = By.xpath("//*[@id=\"QuickLinks\"]/a[1]/img");

	//Launch_The_Chrome_Browser
	public void url() {
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		//Maximize_The_Browser_Window
		driver.manage().window().maximize();

		//Wait_For_60_Sec
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		//Go_To_JPet_Website
		driver.get("https://petstore.octoperf.com/actions/Catalog.action");
		
	}

	//Click on Pet
	public void pet() {
		

		driver.findElement(Pet).click();
		
	}
	
	
	
	//Printing_Table
	public void tablePrint()
	{
		//driver.findElement(Pet).click();
		String str;
		for(int r=2;r<=5;r++)
		{
			for(int c=1;c<=2;c++)
			{
				str="//*[@id=\"Catalog\"]/table/tbody/tr["+r+"]/td["+c+"]"; 
				String s=driver.findElement(By.xpath(str)).getText();
				System.out.print(s+"  ");
			}
			System.out.println(" ");	
		}

	}


	//Close_Browser
	public void end() 
	{
		driver.close();
	}


}
