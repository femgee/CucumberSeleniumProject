package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.LoginPage;

public class Steps {
	
	public WebDriver driver;
	public LoginPage lp;
	
	
	@Given("^User Launch Chrome browser$")
	public void user_Launch_Firefox_browser() throws Throwable {
	    System.setProperty("webdriver.chrome.driver", "C:\\exercise\\CucumberProject\\nopCommerce001_Cucumber\\Drivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    lp = new LoginPage(driver);
	}
	

	@When("^User open url \"([^\"]*)\"$")
	public void user_open_url(String url) throws Throwable {
		driver.get(url);
	    
	}

	@And("^User enters Email as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void user_enters_Email_as_and_password_as(String Email, String Password) throws Throwable {
	    lp.setUserName(Email);
	    lp.setPassword(Password);
	}

	@And("^Clicks on Login$")
	public void clicks_on_Login() throws Throwable {
	    lp.clickLogin();
	}

	@Then("^Page Title should be \"([^\"]*)\"$")
	public void page_Title_should_be(String title) throws Throwable {
		if(driver.getPageSource().contains("Login was unsuccessful")) {
	    	   driver.close();
	    	   Assert.assertTrue(false);
	       }else {
	    	   Assert.assertEquals(title, driver.getTitle());
	       }
	    
	}


	@When("^User click on Log out link$")
	public void user_click_on_Log_out_link() throws Throwable {
	    lp.clickLogout();
	    Thread.sleep(3000);
	}

	@And("^close browser$")
	public void close_browser() throws Throwable {
		driver.quit();
	   
	}


}
