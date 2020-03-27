/*POM Page For User Registration WebPage*/

package com.Pages;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Registration_Page  {


	public WebDriver driver;

	//Web_Elements_Of_Registration_Page
	By SignIn =  By.xpath("//*[@id=\"MenuContent\"]/a[2]");
	By Register = By.linkText("Register Now!");
	By UserID = By.name("username");
	By New_Pswd = By.name("password");
	By Repeat_Pswd = By.xpath("//*[@id=\"Catalog\"]/form/table[1]/tbody/tr[3]/td[2]/input");
	By First_Name = By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[1]/td[2]/input");
	By Last_Name = By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[2]/td[2]/input");
	By Email = By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[3]/td[2]/input");
	By Phone_No = By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[4]/td[2]/input");
	By Address1 = By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[5]/td[2]/input");
	By Address2 = By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[6]/td[2]/input");
	By City = By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[7]/td[2]/input");
	By State = By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[8]/td[2]/input");
	By Zipcode = By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[9]/td[2]/input");
	By Country = By.xpath("//*[@id=\"Catalog\"]/form/table[2]/tbody/tr[10]/td[2]/input");
	By Enable_List = By.xpath("//*[@id=\"Catalog\"]/form/table[3]/tbody/tr[3]/td[2]/input");
	By Enable_Banner = By.xpath("//*[@id=\"Catalog\"]/form/table[3]/tbody/tr[4]/td[2]/input");
	By Save_Info = By.xpath("//*[@id=\"Catalog\"]/form/input");

	//Launch_The_Chrome_Browser
	public void launch() 
	{
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();

		//Maximize_The_Browser_Window
		driver.manage().window().maximize();

		//Wait_For_60_Sec
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);


	}

	//Move_To_Registeration_Page
	public void url()
	{
		//Go_To_JPet_Website
		driver.get("https://petstore.octoperf.com/actions/Account.action?newAccountForm=");
	}

	//Enter_The_Details
	public void enterDetails() throws InterruptedException
	{
		driver.findElement(UserID).sendKeys("Cagy111112222");
		Thread.sleep(1000);
		driver.findElement(New_Pswd).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(Repeat_Pswd).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(First_Name).sendKeys("Cagy11");
		Thread.sleep(1000);
		driver.findElement(Last_Name).sendKeys("Subhramanyam");
		Thread.sleep(1000);
		driver.findElement(Email).sendKeys("tina22@wxy2z.com");
		Thread.sleep(1000);
		driver.findElement(Phone_No).sendKeys("78009135");
		Thread.sleep(1000);
		driver.findElement(Address1).sendKeys("54K, Perungudi");
		Thread.sleep(1000);
		driver.findElement(Address2).sendKeys("Thuraupakkam");
		Thread.sleep(1000);
		driver.findElement(City).sendKeys("Chennai");
		Thread.sleep(1000);
		driver.findElement(State).sendKeys("Tamil Nadu");
		Thread.sleep(1000);
		driver.findElement(Zipcode).sendKeys("600096");
		Thread.sleep(1000);
		driver.findElement(Country).sendKeys("India");
		Thread.sleep(1000);
		driver.findElement(Enable_List).click();
		Thread.sleep(1000);
		driver.findElement(Enable_Banner).click();
		Thread.sleep(1000);
	}

	//Tick_on _Save_Info_And_Close_Browser
	public void closeRegistration() throws IOException, InterruptedException
	{
		driver.findElement(Save_Info).click();
		//Thread.sleep(5000);
	}

	//Take_ScreenShoot_Before_Reg
	public void screenshot()throws IOException
	{

		File file =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String path = "ScreenShot\\TC1\\BeforeSignUp.png";
		FileUtils.copyFile(file,new File(path));

	}


	//Take_ScreenShoot_After_Reg
	public void screenshot2()throws IOException
	{

		File file =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String path = "ScreenShot\\TC1\\AfterSignUp.png";
		FileUtils.copyFile(file,new File(path));

	}

	//Close_Browser
	public void end() {
		driver.close();
	}


	//For_TC_01_SignIn
	public void sigin() throws InterruptedException {
		WebElement ad = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/a[2]"));

		Actions a = new Actions(driver);

		Actions df = a.moveToElement(ad).click();
		a.build().perform();

		Thread.sleep(1000);
		driver.findElement(By.name("username")).clear();
		Thread.sleep(1000);
		driver.findElement(By.name("username")).sendKeys("Cagy111112222");
		Thread.sleep(1000);
		driver.findElement(By.name("password")).clear();
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/form/input")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"MenuContent\"]/a[3]")).click();
		Thread.sleep(1000);
	}

}
