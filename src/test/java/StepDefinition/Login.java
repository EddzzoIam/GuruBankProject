package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObject.AccountPage;
import pageObject.BasePage;
import pageObject.HomePage;
import pageObject.RegisterNewCustomer;

public class Login extends BasePage {
	WebDriver driver;
	HomePage homepage;
	AccountPage accountpage = new AccountPage(BasePage.driver);
	RegisterNewCustomer registernewcustomer;

	@Given("I navigate to GTPL home")
	public void i_navigate_to_gtpl_home() throws InterruptedException {
		NavigateToHomePage();
		Thread.sleep(5000);
		homepage = new HomePage(BasePage.driver);
		homepage.CookieButtonPolicy();

	}

	@When("I enter {string} into email field")
	public void i_enter_into_email_field(String userid) {
		homepage.userId().sendKeys(userid);

	}

	@And("I enter {string} into password field")
	public void i_enter_into_password_field(String password) {
		homepage.UserPassword().sendKeys(password);

	}

	@And("I click login button")
	public void i_click_login_button() {
		homepage.loginButton().click();

	}

	@And("I am successfully logged in")
	public void i_am_successfully_logged_in() {

		String managerIsLogIn = null;

		try {
			// Assert.assertEquals(accountpage.managerId().getText(),
			// BasePage.EXPECT_TITLE);

			managerIsLogIn = accountpage.managerId().getText();
			Assert.assertEquals(managerIsLogIn, BasePage.EXPECT_TITLE);

		} catch (Exception Ex) {

			Assert.assertNotEquals(managerIsLogIn, BasePage.EXPECT_ERROR);

		}

	}
}
