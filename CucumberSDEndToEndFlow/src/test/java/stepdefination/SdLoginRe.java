package stepdefination;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;

import PageObject.LoginAuto;
import configuration.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SdLoginRe extends Base{
	private LoginAuto Login1=new LoginAuto(driver);

	@Given("user is on login page")
	public void user_is_on_login_page() {

		driver.get("https://sdqa.shakedeal.com/login");
		System.out.println("sd is open");

	}

	@When("user enters user name {string} and password {string}")
	public void user_enters_user_name_and_password(String Email, String Password) {
		Login1.getEmailtextField().sendKeys(Email);
		Login1.getPasswordTextField().sendKeys(Password);

	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		Login1.getLoginButton().click();

	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		String title = driver.getTitle();
		
		
		
		Assertions.assertEquals("ShakeDeal - Procurement Made Easy | Home of B2B Commerce", title, "wrong title for home page");
//		if(title.equals("ShakeDeal - Procurement Made Easy | Home of B2B Commerce"))
//			System.out.println("right title");
//		else 
//			System.out.println("wrong title");


	}
	
	@Then("user verifies if item is in cart")
	public void user_verifies_if_item_is_in_cart() {
		
//		WebElement verifycart = Login1.getVerifyItemsInCart();
//		Assertions.assertTrue(false);

		//boolean verifycart= driver.getVerifyItemsInCart() ;
		Login1.getVerifyItemsInCart().click();
		Login1.getRemoveFromCart().click();
		Login1.getDeleteOk().click();
		Login1.getHomePage().click();
		
//		if(verifycart) {
//		
//		}
		
		
		}

//	@Then("if items are in cart, clear the cart")
//	public void if_items_are_in_cart_clear_the_cart() {
//		
//		
//		
//	    
//	}
//
//	@Then("if no items are in cart continue")
//	public void if_no_items_are_in_cart_continue() {
//	   
//	}

}
