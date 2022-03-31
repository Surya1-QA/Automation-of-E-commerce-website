package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import configuration.Base;

public class SelectProductPF extends Base {
	
	@FindBy(xpath="//span[text()='Power Tools']")
	private WebElement HoverPowerTools;
	
	@FindBy(xpath = "//span[text()='Drills ']")
	private WebElement HoverDrills;
	
	@FindBy(xpath = "//img[@id='det_img_346156']")
	private WebElement ProductClick;
	
	@FindBy(xpath= "//h1[text()='Black+Decker HD555 - 13 mm, 550 W Hammer Drill Machine with Variable Speed']")
	private WebElement ProductName;
	

	
	public WebElement getProductName() {
		return ProductName;
	}

	public void setProductName(WebElement productName) {
		ProductName = productName;
	}

	public SelectProductPF(WebDriver driver) {
		Base.driver = driver;
		
		PageFactory.initElements(driver ,this);
	}

	public WebElement getHoverPowerTools() {
		return HoverPowerTools;
	}

	public WebElement getHoverDrills() {
		return HoverDrills;
	}

	public WebElement getProductClick() {
		return ProductClick;
	}

	
	

}
