package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import configuration.Base;

public class ProductsToCartPF extends Base{

	@FindBy(xpath = "//div[@class='es-qty']//a[@class='cm-increase ty-value-changer__increase']")
	private WebElement QtyIncrease;

	@FindBy(xpath = "//button[@id='button_cart_346156']")
	private WebElement ClickAddToCart;

	@FindBy(xpath = "//div[@class='ty-float-right ty-cart-content__right-buttons cust-right']//a[@class='ty-btn ty-btn__primary awardbut ']")
	private WebElement ClickPlaceOrder;

	public ProductsToCartPF(WebDriver driver) {
		Base.driver = driver;
		PageFactory.initElements(driver, this);
		}

	public WebElement getQtyIncrease() {
		return QtyIncrease;
	}

	public WebElement getClickAddToCart() {
		return ClickAddToCart;
	}

	public WebElement getClickPlaceOrder() {
		return ClickPlaceOrder;
	}

}
