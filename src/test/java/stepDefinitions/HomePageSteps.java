package stepDefinitions;

import org.openqa.selenium.WebDriver;
import PageObjects.HomePage;
import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps extends DriverFactory   {
	public HomePage homepage;
	 WebDriver driver;
	
	
	//WebDriver driver =new WebDriver (DriverFactory.getDriver());
	
	
	
	@Given("User launch chrome browser and open portal url\"https:\\/\\/dsportalapp.herokuapp.com\"")
	public void user_launch_chrome_browser_and_open_portal_url_https_dsportalapp_herokuapp_com() throws InterruptedException {
		/*System.setProperty("webdriver.driver.chromeDriver", "/Users/pranithabethi/Desktop/chromedriver/chromedriver");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver.manage().window().maximize();
		driver.get("https://dsportalapp.herokuapp.com");
		*/
		
		
		
		
		
		DriverFactory.getDriver().get("https://dsportalapp.herokuapp.com");
	    Thread.sleep(2000);
	}

	@When("User click on Get Started button user navigate to homepage")
	public void user_click_on_get_started_button_user_navigate_to_homepage() {
		
		//driver = DriverFactory.getDriver();
		
	HomePage homepage = new HomePage(driver);
	   homepage.getstartedbtn();
	}

	@When("User click on data structure dropdown and select from the list")
	public void user_click_on_data_structure_dropdown_and_select_from_the_list() {
	   homepage.dropDown();
	   homepage.arrays();
	}

	@Then("It shows error message You are not logged in")
	public void it_shows_error_message_you_are_not_logged_in() {
	   homepage.alert();
	}

	@Given("User is on home page")
	public void user_is_on_home_page() {
		
		
	}
	
	   

	@When("User click on one of the module")
	public void user_click_on_one_of_the_module() {
	   
	}


}
