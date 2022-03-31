package stepdefination;

import org.junit.jupiter.api.Assertions;

import PageObject.SelectProductPF; 
import commonUtils.UtilElement;
import configuration.Base; 
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SelectAProduct extends Base{
	
	
	
	
	UtilElement Hover = new UtilElement();
	private SelectProductPF SelectProduct= new  SelectProductPF(driver);


	@When("user hovers on power tools link")
	public void user_hovers_on_power_tools_link() {

		Hover.mouseHover(driver, SelectProduct.getHoverPowerTools());


	}
	@And("hovers on drills link and click on that")
	public void hovers_on_drills_link_and_click_on_that() {

		Hover.mouseHover(driver, SelectProduct.getHoverDrills());
		SelectProduct.getHoverDrills().click();

	}
	@Then("user is navigated to drills page")
	public void user_is_navigated_to_drills_page() {
		String ListPageTitle = driver.getTitle();
		Assertions.assertEquals("Power Drills: Buy Drill Machines Online at Best Price in India | ShakeDeal", ListPageTitle, "User is on wrong page");

	}
	@When("user clicks on a product")
	public void user_clicks_on_a_product() {
		
		SelectProduct.getProductClick().click();
		
	}
	@Then("user is navigated to the products page")
	public void user_is_navigated_to_the_products_page() throws InterruptedException {
		
		driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
		
		
		
		String ProductPageTitle = driver.getTitle();		
		Assertions.assertEquals("Buy Black+Decker HD555 - 13 mm, 550 W Hammer Drill Machine with Variable Speed Online at Best Prices in India", ProductPageTitle, "user is on wrong page");
		
		
		//		if(ProductPageTitle=="Buy Black+Decker HD555 - 13 mm, 550 W Hammer Drill Machine with Variable Speed Online at Best Prices in India") {
//			System.out.println("correct page is open");
//		} else {
//			System.out.println("incorrect page");
//		}
	}

}


