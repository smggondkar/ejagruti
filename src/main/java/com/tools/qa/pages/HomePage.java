package com.tools.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tools.qa.base.TestBase;


public class HomePage extends TestBase {
	
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/h5[1]")
	@CacheLookup
	WebElement Elementslink;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/h5[1]")
	WebElement Formslink;
	
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[3]/h5[1]")
	WebElement AlertsLink;
	
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/div[3]/h5[1]")
	WebElement WidgetsLink;

	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[5]/div[1]/div[3]/h5[1]")
	WebElement InteractionsLink;

	// Initializing the Page Objects:
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public ElementsPage clickOnContactsLink(){
		Elementslink.click();
		return new ElementsPage();
	}
	
	public FormsPage clickOnDealsLink(){
		Formslink.click();
		return new FormsPage();
	}
	
	public AlertsPage clickOnTasksLink(){
		AlertsLink.click();
		return new AlertsPage();
	}
	
	public WidgetsPage clickOnTasksLink1(){
		WidgetsLink.click();
		return new WidgetsPage();
	}
	
	public InteractionsPage clickOnTasksLink2(){
		InteractionsLink.click();
		return new InteractionsPage();
	}
		
	}
	
