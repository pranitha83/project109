package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import factory.DriverFactory;

public class HomePage extends DriverFactory   {
 WebDriver driver;



	
	@FindBy(xpath = "//button[text()='Get Started']")
@CacheLookup
	WebElement getstarted;

	@FindBy(xpath="//a[text()='Data Structures']")
	@CacheLookup
	WebElement dropdown;

	@FindBy (xpath="//a[text()='Arrays']")
	@CacheLookup
	WebElement arrays;

	@FindBy (xpath="//a[text()='Linked List']")
	@CacheLookup
	WebElement linkedlist;

	@FindBy (xpath="//a[text()='Stack']")
	@CacheLookup
	WebElement stack;

	@FindBy (xpath="//a[text()='Queue']")
	@CacheLookup
	WebElement queue;

	@FindBy (xpath="//a[text()='Tree']")
	@CacheLookup
	WebElement tree;

	@FindBy (xpath="//a[text()='Graph']")
	@CacheLookup
	WebElement graph;

	@FindBy (className="alert alert-primary")
	@CacheLookup
	WebElement alert;

	//constructor of the homepage

	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		//PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);

	}
	public void getstartedbtn() {
		driver.switchTo().activeElement();
		getstarted.click();
		

	}
	public void dropDown() {
		dropdown.click();
	}
	public void arrays() {
		arrays.click();
	}
	public void alert() {
		alert.getText();
	}
}
