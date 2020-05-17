package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddcustomerPage {

	public WebDriver ldriver;

	public AddcustomerPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
		ldriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	By lnkCustomers_menu = By.xpath("//a[@href='#']//span[contains(text(),'Customers')]");
	By lnkCustomers_menuitem = By.xpath("//span[@class='menu-item-title'][contains(text(),'Customers')]");

	By btnAddnew = By.xpath("//a[@class='btn bg-blue']");

	By txtEmail = By.xpath("//input[@id='Email']");
	By txtPassword = By.xpath("//input[@id='Password']");

	By txtcustomerRoles = By.xpath("//div[@class='k-multiselect-wrap k-floatwrap']");
	By lstitemAdministrator = By.xpath("//li[contains(text().'Administrators')]");
	By lstitemRegistered = By.xpath("//li[contains(text().'Registered')]");
	By lstitemGuests = By.xpath("//li[contains(text(),'Guests')]");
	By lstitemVendors = By.xpath("//li[contains(text(),'Vendors')]");

	By drpmgrOfVendor = By.xpath("//*[@id='VendorId']");
	By rdMaleGender = By.id("Gender_Male");

	By rdFemaleGender = By.id("Gender_Female");

	By txtFirstName = By.xpath("//input[@id='FirstName']");
	By txtLastName = By.xpath("//input[@id='LastName']");
	By txtdob = By.xpath("//input[@id='DateOfBirth']");
	By txtCompanyName = By.xpath("//input[@id='Company']");
	By txtAdminContent = By.xpath("//textarea[@id='AdminComment']");
	By btnSave = By.xpath("//button[@name='save']");

	// Actions method

	public String getPageTitle() {
		return ldriver.getTitle();
	}

	public void clickCustomersMenu() {
		ldriver.findElement(lnkCustomers_menu).click();
	}

	public void clickOnCustomersMenuItem() {
		ldriver.findElement(lnkCustomers_menuitem).click();
	}

	public void clickOnAddnew() {
		ldriver.findElement(btnAddnew).click();
	}

	public void setEmail(String email) {
		ldriver.findElement(txtEmail).sendKeys(email);
	}

	public void setPasssword(String password) {
		ldriver.findElement(txtPassword).sendKeys(password);
	}

	public void setCustomerRoles(String role) throws InterruptedException {
		if (!role.equals("Vendors")) {
			ldriver.findElement(By.xpath("//*[@id=\"SelectedCustomerRoleIds_taglist\"]/li/span"));
		}

		ldriver.findElement(txtcustomerRoles).click();

		WebElement listitem;
		Thread.sleep(3000);

		if (role.equals("Administrator")) {
			listitem = ldriver.findElement(lstitemAdministrator);

		}

		else if (role.equals("Guest")) {
			listitem = ldriver.findElement(lstitemGuests);
		}

		else if (role.equals("Registered")) {
			listitem = ldriver.findElement(lstitemRegistered);
		}

		else if (role.equals("Vendors")) {
			listitem = ldriver.findElement(lstitemVendors);
		}

		else {
			listitem = ldriver.findElement(lstitemGuests);
		}

		// listitem.click();
		// Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) ldriver;
		js.executeScript("arguments[0].click();", listitem);
	}

	public void setManagerOfVendor(String value) {

		Select drp = new Select(ldriver.findElement(drpmgrOfVendor));
		drp.selectByVisibleText(value);
	}

	public void setGender(String gender) {

		if (gender.equals("Male"))

		{
			ldriver.findElement(rdMaleGender).click();
		}

		else if (gender.equals("Female")) {
			ldriver.findElement(rdFemaleGender).click();
		}
	}

	public void setFirstName(String fname) {
		ldriver.findElement(txtFirstName).sendKeys(fname);
	}

	public void setLastName(String lname) {
		ldriver.findElement(txtLastName).sendKeys(lname);
	}

	public void setDob(String dob) {
		ldriver.findElement(txtdob).sendKeys(dob);
	}

	public void setCompanyName(String comname) {
		ldriver.findElement(txtCompanyName).sendKeys(comname);
	}

	public void setAdminContent(String content) {
		ldriver.findElement(txtAdminContent).sendKeys(content);
	}

	public void clickOnSave() {
		ldriver.findElement(btnSave).click();
	}

}
