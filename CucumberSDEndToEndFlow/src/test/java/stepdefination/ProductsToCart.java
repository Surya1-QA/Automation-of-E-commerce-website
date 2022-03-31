package stepdefination;
 
import io.cucumber.java.en.Then; 
import io.cucumber.java.en.When;

import java.util.Iterator;

import org.junit.jupiter.api.Assertions;

import PageObject.ProductsToCartPF;
import configuration.Base;

public class ProductsToCart extends Base{
	
	private ProductsToCartPF AddToCart =new ProductsToCartPF(driver);
	
	@When("user increases the quantity of the product")
	public void user_increases_the_quantity_of_the_product() {
		
	
		for (int i = 0; i < 2 ; i++) {
			
			AddToCart.getQtyIncrease().click();
			
		}
		
		System.out.println("the quantity of the product is increased to 3");
//	 AddToCart.getQtyIncrease().click();
//	 AddToCart.getQtyIncrease().click();
		
		
	
		
	   
	}
	@When("clicks on Add to Cart button")
	public void clicks_on_add_to_cart_button() {
		
		AddToCart.getClickAddToCart().click();
	    
	}
	@Then("user is navigated to art page")
	public void user_is_navigated_to_art_page() {
		
		String title= driver.getTitle();
		Assertions.assertEquals("Cart contents", title, "user is on wrong page");
	    
	}
	@When("user clicks on Place Order button")
	public void user_clicks_on_place_order_button() {
		
		AddToCart.getClickPlaceOrder().click();
	    
	}
	@Then("user is navigated to Checkout page")
	public void user_is_navigated_to_checkout_page() {
		
//		"Checkout :: Checkout", title, "user is on wrong page"
		String title= driver.getTitle();
		Assertions.assertEquals("Checkout :: Checkout", title, "user is on wrong page");
		
		
	    

}
}
