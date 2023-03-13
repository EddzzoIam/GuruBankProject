package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.AccountPage;
import pageObject.BasePage;
import pageObject.HomePage;
import pageObject.RegisterNewCustomer;

public class NewCustomer extends BasePage {

	WebDriver driver;
	HomePage homepage;
	AccountPage accountpage;
	RegisterNewCustomer registernewcustomer;

	@Given("I successfully sign in")

	public void i_successfully_sign_in() throws InterruptedException {

		homepage = new HomePage(BasePage.driver);
		NavigateToHomePage();
		Thread.sleep(5000);
		homepage.CookieButtonPolicy();
		// CharSequence userId = "mngr480878";
		homepage.userId().sendKeys(BasePage.USER_NAME);
		// CharSequence password = "atunAnA";
		homepage.UserPassword().sendKeys(BasePage.PASSWD);
		homepage.loginButton().click();
	}

	@When("I click new")
	public void i_click_new() {
		registernewcustomer = new RegisterNewCustomer(BasePage.driver);
		registernewcustomer.newCustomer().click();

	}

	@And("I enter {string} into customer text field")
	public void i_enter_into_customer_text_field(String name) {
		registernewcustomer.customerName().sendKeys(name);
		;

	}

	@And("I choose female as gender")
	public void i_choose_female_as_gender() throws InterruptedException {
		registernewcustomer.gender().click();
		Thread.sleep(2000);

	}

	@Given("I enter date of birth")
	public void i_enter_date_of_birth() {
		registernewcustomer.DateOfBirth().sendKeys("15041996");

	}

	@And("I enter {string} into address field")
	public void i_enter_into_address_field(String address)  {

		registernewcustomer.enterAddress().sendKeys(address);

	}

	@And("I enter {string} into city text field")
	public void i_enter_into_city_text_field(String city) {
		registernewcustomer.NameOfCity().sendKeys(city);

	}

	@And("I enter {string} into state text field")
	public void i_enter_state_into_state_text_field(String state) {
		registernewcustomer.nameOfState().sendKeys(state);

	}

	@And("I enter {string} into pin text field")
	public void i_enter_into_pin_text_field(String pin) {
		registernewcustomer.enterPin().sendKeys(pin);
	}

	@And("I enter {string} into mobile number text field")
	public void i_enter_into_mobile_number_text_field(String telephone) {
		registernewcustomer.enterPhone().sendKeys(telephone);
	}

	@And("I enter {string} into email address text field")
	public void i_enter_into_email_address_text_field(String email) {
		registernewcustomer.emailAddress().sendKeys(email);

	}

	@Given("I type {string} into passcode text field")
	public void i_type_into_passcode_text_field(String passd) {
		registernewcustomer.passwordTextfield().sendKeys(passd);

	}

	@And("I click submit button")
	public void i_click_submit_button() {

		
			registernewcustomer.submitButton().click();
			
		

	}

	@Then("I am succefully registered")
	public void i_am_succefully_registered() {
		
		String NewCustomerAddSuccessfully = null;

		try {
			

			NewCustomerAddSuccessfully = registernewcustomer.customerRegistered().getText();
			Assert.assertEquals(NewCustomerAddSuccessfully, BasePage.EXPECT_TITLE1);

		} catch (Exception Ex) {

			Assert.assertNotEquals(NewCustomerAddSuccessfully, BasePage.EXPECT_ERROR1);

		}

	}

}
