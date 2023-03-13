package pageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterNewCustomer {

	WebDriver driver;
	JavascriptExecutor js;
	public RegisterNewCustomer(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[normalize-space()='New Customer']")
	private WebElement newCustomer;
	@FindBy(xpath = "//input[@name='name']")
	private WebElement customerName;
	@FindBy(xpath = "//input[@value='f']")
	private WebElement gender;
	@FindBy(xpath = "//input[@id='dob']")
	private WebElement DateOfBirth;
	@FindBy(xpath = "//textarea[@name='addr']")
	private WebElement enterAddress;
	@FindBy(xpath = "//input[@name='city']")
	private WebElement NameOfCity;
	@FindBy(xpath = "//input[@name='state']")
	private WebElement nameOfState;
	@FindBy(xpath = "//input[@name='pinno']")
	private WebElement enterPin;
	@FindBy(xpath = "//input[@name='telephoneno']")
	private WebElement enterPhone;
	@FindBy(xpath = "//input[@name='emailid']")
	private WebElement emailAddress;
	@FindBy(xpath = "//input[@name='password']")
	private WebElement passwordTextfield;
	@FindBy(xpath = "//input[@name='sub']")
	private WebElement submitButton;
	@FindBy (xpath ="//p[@class='heading3']")
	WebElement customerRegistered;

	public WebElement newCustomer() {

		return newCustomer;
	}

	public WebElement customerName() {

		return customerName;
	}

	public WebElement gender() {

		return gender;
	}

	public WebElement DateOfBirth() {
		return DateOfBirth;
	
		
	}

	public WebElement enterAddress() {

		return enterAddress;
	}

	public WebElement NameOfCity() {

		return NameOfCity;
	}

	public WebElement nameOfState() {
		return nameOfState;
	}

	public WebElement enterPin() {
		return enterPin;
	}

	public WebElement enterPhone() {
		return enterPhone;
	}

	public WebElement emailAddress() {
		return emailAddress;
	}

	public WebElement passwordTextfield() {
		return passwordTextfield;
	}

	public WebElement submitButton() {
		return submitButton;
	}
	public WebElement customerRegistered() {
		return customerRegistered;
	}
}
