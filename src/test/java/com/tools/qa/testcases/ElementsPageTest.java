package com.tools.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tools.qa.base.TestBase;
import com.tools.qa.pages.ElementsPage;
import com.tools.qa.pages.HomePage;

public class ElementsPageTest extends TestBase{

	ElementsPage elementsPage;
	HomePage homePage;
	   
	public ElementsPageTest(){
			super();
			
	}
	
	
	@BeforeMethod
	public void setUp() throws InterruptedException {		
		initialization();

		
	}
	
	@Test(priority=1)
	public void verifyContactsPageLabel(){
		elementsPage=new ElementsPage();
		homePage= new HomePage();
		elementsPage=homePage.clickOnContactsLink();
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
	
}
