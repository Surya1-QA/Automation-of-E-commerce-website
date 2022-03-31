package PageObject;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import configuration.Base;

public class LoginAuto extends Base{
	
	@FindBy(id ="email" )
//	"//input[@id='email']"
	private WebElement EmailtextField;
	
	@FindBy(id ="password" )
//	"//input[@id='password']"
	private WebElement PasswordTextField;
	
	@FindBy(xpath = "//button[text()='LOG IN']")
	private WebElement LoginButton;
	
	@FindBy(xpath = "//span[@style='background: #f57041;color: #fff;padding: 4px 6px 4px 6px;border-radius: 50%;font-size: 10px;position: relative;left: -9px;top: -9px;font-weight: 900;']")
	private WebElement VerifyItemsInCart;
	
	@FindBy(xpath = "//a[@unbxdattr='RemoveFromCart']")
	private WebElement RemoveFromCart;
	
	@FindBy(xpath="//div[@id='p-confirm']//input[@value='OK']")
	private WebElement DeleteOk;
	
	@FindBy(xpath="//img[@alt='Shakedeal']")
	private WebElement HomePage;
	
	public LoginAuto(WebDriver driver) {
		Base.driver = driver;
		
		PageFactory.initElements(driver ,this);
	}

	
	
	public WebElement getEmailtextField() {
		return EmailtextField;
	}

	public WebElement getPasswordTextField() {
		return PasswordTextField;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}
	public WebElement getVerifyItemsInCart() {
		return VerifyItemsInCart;
	}

	public WebElement getRemoveFromCart() {
		return RemoveFromCart;
	}

	public WebElement getDeleteOk() {
		return DeleteOk;
	}

	public WebElement getHomePage() {
		return HomePage;
	}




	
	

}
