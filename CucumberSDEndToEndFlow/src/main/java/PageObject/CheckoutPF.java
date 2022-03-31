package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import configuration.Base;

public class CheckoutPF extends Base{

	@FindBy(xpath = "//button[@id='step_three_button']")
	private WebElement ClickContinue;
	
	@FindBy(id = "payment_13")
	private	WebElement SelectCard;
	
	@FindBy(id = "place_order_tab1")
	private WebElement ClickPlaceOrder;
	
	@FindBy(xpath = "(//iframe[@class='razorpay-checkout-frame'])[2]")
	private WebElement PaymentFrame;
	
	@FindBy(xpath = "(//div[text()='Shakedeal'])")
	private WebElement verifyShakedeal;
	
	public CheckoutPF(WebDriver driver) {
		Base.driver = driver;
		
		PageFactory.initElements(driver ,this);
	}

	public WebElement getClickContinue() {
		return ClickContinue;
	}

	public WebElement getSelectCard() {
		return SelectCard;
	}

	public WebElement getClickPlaceOrder() {
		return ClickPlaceOrder;
	}

	public WebElement getPaymentFrame() {
		return PaymentFrame;
	}

	public WebElement getVerifyShakedeal() {
		return verifyShakedeal;
	}
	
	

	
	
	
	
	
}
