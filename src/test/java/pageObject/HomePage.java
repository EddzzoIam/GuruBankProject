package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//button[@id='save']")
	private WebElement CookieButton;
	@FindBy(xpath = "//input[@name='uid']")
	private WebElement userId;
	@FindBy(xpath = "//input[@name='password']")
	WebElement UserPassword;
	@FindBy(xpath = "//input[@name='btnLogin']")
	WebElement loginButton;

	public void CookieButtonPolicy() {

		WebElement fr = driver.findElement(By.id("gdpr-consent-notice"));
		driver.switchTo().frame(fr);
		CookieButton.click();

		driver.switchTo().defaultContent();

	}

	public WebElement userId() {

		return userId;
	}

	public WebElement UserPassword() {

		return UserPassword;
	}

	public WebElement loginButton() {

		return loginButton;
	}

}
