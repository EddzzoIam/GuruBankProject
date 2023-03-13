package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import common.DriverManager;

public class BasePage extends DriverManager {

	public String BASE_URL = "http://www.demo.guru99.com/V4/";
	public static final int WAIT_TIME = 30;

	// Valid account for login
	public static final String USER_NAME = "mngr480878";
	public static final String PASSWD = "atunAnA";
	// Expected output
	public static final String EXPECT_TITLE = "Welcome To Manager's Page of Guru99 Bank";
	public static final String EXPECT_ERROR = "User or Password is not valid";
	public static final String EXPECT_ERROR1 = "User already exist";
	public static final String EXPECT_TITLE1 = "Customer Registered Successfully!!!";
	
	private Select select;

	public void NavigateToHomePage() {

		driver.navigate().to(BASE_URL);
	}

// reusable methods for selects
	public void selectByText(WebElement element, String text) {

		select = new Select(element);
		select.selectByVisibleText(text);

	}

	public void selectByValue(WebElement element, String value) {

		select = new Select(element);
		select.selectByValue(value);

	}

	public void selectByIndex(WebElement element, int index) {

		select = new Select(element);
		select.selectByIndex(index);

	}

}
