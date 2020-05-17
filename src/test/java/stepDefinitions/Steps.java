package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.AddcustomerPage;
import pageObjects.LoginPage;

public class Steps extends BaseClass {

	@Given("^User Launch Chrome browser$")
	public void user_Launch_Firefox_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		lp = new LoginPage(driver);
	}

	@When("^User open url \"([^\"]*)\"$")
	public void user_open_url(String url) throws Throwable {
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(3000);

	}

	@And("^User enters Email as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void user_enters_Email_as_and_password_as(String Email, String Password) throws Throwable {
		lp.setUserName(Email);
		lp.setPassword(Password);
	}

	@And("^Clicks on Login$")
	public void clicks_on_Login() throws InterruptedException {
		lp.clickLogin();
		Thread.sleep(3000);

	}

	@Then("^Page Title should be \"([^\"]*)\"$")
	public void page_Title_should_be(String title) throws InterruptedException {
		if (driver.getPageSource().contains("Login was successful")) {
			driver.close();
			Assert.assertTrue(false);
		} else {
			Assert.assertEquals(title, driver.getTitle());
		}
		Thread.sleep(3000);

	}

	@When("^User click on Log out link$")
	public void user_click_on_Log_out_link() throws InterruptedException {
		lp.clickLogout();
		Thread.sleep(3000);
	}

	@And("^close browser$")
	public void close_browser() throws Throwable {
		driver.quit();

	}

	// Customers feature step
	// definitions........................................................

	@Then("^User can view Dashboard$")
	public void user_can_view_Dashboard() throws InterruptedException {

		addCust = new AddcustomerPage(driver);
		Assert.assertEquals("Dashboard / nopCommerce administration", addCust.getPageTitle());

	}

	@When("^user click on customers menu$")
	public void user_click_on_customers_menu() throws InterruptedException {
		Thread.sleep(3000);
		addCust.clickCustomersMenu();
	}

	@When("^click customers Menu Item$")
	public void click_customers_Menu_Item() throws InterruptedException {
		Thread.sleep(3000);
		addCust.clickOnCustomersMenuItem();
	}

	@When("^click on Add new button$")
	public void click_on_Add_new_button() throws InterruptedException {
		addCust.clickOnAddnew();
		Thread.sleep(3000);
	}

	@Then("^User can view Add new customer page$")
	public void user_can_view_Add_new_customer_page() {
		Assert.assertEquals("Add a new customer / nopCommerce administration", addCust.getPageTitle());
	}

	@When("^User enter customer info$")
	public void user_enter_customer_info() throws InterruptedException {
		String email = randomstring() + "@gmail.com";
		addCust.setEmail(email);
		addCust.setPasssword("test123");
		addCust.setCustomerRoles("Guest");
		Thread.sleep(2000);
		addCust.setManagerOfVendor("Vendor 2");
		addCust.setGender("Male");
		addCust.setFirstName("Ralph");
		addCust.setLastName("Gill");
		addCust.setDob("9/05/1975");
		addCust.setCompanyName("LearningAutomation");
		addCust.setAdminContent("This is my testing session");

	}

	@When("^click on Save button$")
	public void click_on_Save_button() throws InterruptedException {
		addCust.clickOnSave();
		Thread.sleep(2000);

	}

	@Then("^User can view confirmation message \"([^\"]*)\"$")
	public void user_can_view_confirmation_message(String msg) throws Throwable {
		Assert.assertTrue(driver.findElement(By.tagName("body")).getText()
				.contains("The customer cannot be in both 'Guests' and 'Registered' customer roles"));

	}

}
