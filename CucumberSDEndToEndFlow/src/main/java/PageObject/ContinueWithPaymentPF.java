package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import configuration.Base;

public class ContinueWithPaymentPF extends Base {
	
	@FindBy(xpath = "//div[@class='screen screen-comp svelte-3j22k8 bottomShadow']")
	private WebElement ScrollDown;
	
	@FindBy(xpath = "//div[text()='Netbanking']")
	private WebElement ClickNetBanking;
	
	@FindBy(xpath = "//label[@for='bank-radio-KKBK']")
	private WebElement ClickKotakBank;
	
	@FindBy(id= "footer")
	private WebElement ClickPay;
	
	@FindBy(xpath = "//button[@class='success']")
	private WebElement ClickSuccess;
	
	@FindBy(xpath = "//form[@onsubmit='return false']")
	private WebElement VerifyConformationPage;
	
	@FindBy(xpath = "//a[text()='Order details']")
	private WebElement ClickOrderDetails;
	
	public WebElement getClickOrderDetails() {
		return ClickOrderDetails;
	}

	public WebElement getClickSuccess() {
		return ClickSuccess;
	}

	public ContinueWithPaymentPF(WebDriver driver) {
		Base.driver = driver;
		
		PageFactory.initElements(driver ,this);
	}

	public WebElement getScrollDown() {
		return ScrollDown;
	}

	public WebElement getClickNetBanking() {
		return ClickNetBanking;
	}

	public WebElement getClickKotakBank() {
		return ClickKotakBank;
	}

	public WebElement getClickPay() {
		return ClickPay;
	}

	public WebElement getVerifyConformationPage() {
		return VerifyConformationPage;
	}
	
	
	
	

}
