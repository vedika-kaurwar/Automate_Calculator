package com.spurQlabs.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.spurQlabs.lib.Global;

public class General extends Global {

	//RE-USABLE FUNCTION
    WebDriver driver;

    @BeforeClass
    public void openApplication()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VEDIKA\\Desktop\\92versionchrome\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.navigate().to(url);
		System.out.println("APPLICATION OPEN");//console
		Reporter.log("APPLICATION OPEN");//html report
		
	}
    
    @AfterClass
	public void closeApplication() throws Exception
	{

		driver.close();
		System.out.println("APPLICATION CLOSE");
		Reporter.log("APPLICATION CLOSE");

	}
    
	public void mul() throws Exception 
	{
		driver.findElement(By.xpath(btn_4)).click();
		driver.findElement(By.xpath(btn_2)).click();
		driver.findElement(By.xpath(btn_3)).click();
		driver.findElement(By.xpath(btn_multi)).click();
		driver.findElement(By.xpath(btn_5)).click();
		driver.findElement(By.xpath(btn_2)).click();
		driver.findElement(By.xpath(btn_5)).click();
		Thread.sleep(3000);
		System.out.println("MULTIPLICATION COMPLETED");
		Reporter.log("MULTIPLICATION COMPLETED");
		


	}
	
		public void div() throws Exception 
		{
			driver.findElement(By.xpath(btn_4)).click();
			driver.findElement(By.xpath(btn_0)).click();
			driver.findElement(By.xpath(btn_0)).click();
			driver.findElement(By.xpath(btn_0)).click();
			driver.findElement(By.xpath(btn_divide)).click();
			driver.findElement(By.xpath(btn_2)).click();
			driver.findElement(By.xpath(btn_0)).click();
			driver.findElement(By.xpath(btn_0)).click();
			Thread.sleep(3000);
			System.out.println("DIVISION COMPLETED");
			Reporter.log("DIVISION COMPLETED");
			


		}
		
				public void added() throws Exception 
				{
					driver.findElement(By.xpath(btn_subtraction)).click();
					driver.findElement(By.xpath(btn_2)).click();
					driver.findElement(By.xpath(btn_3)).click();
					driver.findElement(By.xpath(btn_4)).click();
					driver.findElement(By.xpath(btn_2)).click();
					driver.findElement(By.xpath(btn_3)).click();
					driver.findElement(By.xpath(btn_4)).click();
					driver.findElement(By.xpath(btn_add)).click();
					driver.findElement(By.xpath(btn_3)).click();
					driver.findElement(By.xpath(btn_4)).click();
					driver.findElement(By.xpath(btn_5)).click();
					driver.findElement(By.xpath(btn_3)).click();
					driver.findElement(By.xpath(btn_4)).click();
					driver.findElement(By.xpath(btn_5)).click();
					Thread.sleep(3000);
					System.out.println("ADDITION COMPLETED");
					Reporter.log("ADDITION COMPLETED");
					


				}
				
				public void subtract() throws Exception 
				{
					driver.findElement(By.xpath(btn_2)).click();
					driver.findElement(By.xpath(btn_3)).click();
					driver.findElement(By.xpath(btn_4)).click();
					driver.findElement(By.xpath(btn_8)).click();
					driver.findElement(By.xpath(btn_2)).click();
					driver.findElement(By.xpath(btn_3)).click();
					driver.findElement(By.xpath(btn_subtraction)).click();
					driver.findElement(By.xpath(btn_bracketopen)).click();
					driver.findElement(By.xpath(btn_subtraction)).click();
					driver.findElement(By.xpath(btn_2)).click();
					driver.findElement(By.xpath(btn_3)).click();
					driver.findElement(By.xpath(btn_0)).click();
					driver.findElement(By.xpath(btn_9)).click();
					driver.findElement(By.xpath(btn_4)).click();
					driver.findElement(By.xpath(btn_8)).click();
					driver.findElement(By.xpath(btn_2)).click();
					driver.findElement(By.xpath(btn_3)).click();
					driver.findElement(By.xpath(btn_bracketclose)).click();
					Thread.sleep(3000);
					System.out.println("SUBTRACTION COMPLETED");
					Reporter.log("SUBTRACTION COMPLETED");
					


				}


	
}
