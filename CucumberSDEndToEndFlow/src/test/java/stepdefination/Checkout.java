package stepdefination;

import java.awt.PopupMenu;

import org.junit.jupiter.api.Assertions;

import PageObject.CheckoutPF;
import commonUtils.UtilElement;
import configuration.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Checkout extends Base {
	
	
	
	public UtilElement utilelement= new UtilElement();
	
	
	private CheckoutPF CheckoutProcess = new CheckoutPF(driver);
	@When("user clicks on continue button")
	public void user_clicks_on_continue_button() {
		utilelement.jsclick(driver,CheckoutProcess.getClickContinue());
	}
	@And("user selects the radio button of credit & debit cards\\/ Net Banking\\/ EMI")
	public void user_selects_the_radio_button_of_credit_debit_cards_net_banking_emi() {
		
		utilelement.jsclick(driver,CheckoutProcess.getSelectCard());
	    	
	}
	@And("clicks on Place order button")
	public void clicks_on_place_order_button() {
		utilelement.jsclick(driver,CheckoutProcess.getClickPlaceOrder());
	    
	}
	@Then("user is navigated to Payment gateway page")
	public void user_is_navigated_to_payment_gateway_page() {
		
		driver.switchTo().frame(CheckoutProcess.getPaymentFrame());
		
		
		
		Assertions.assertTrue(CheckoutProcess.getVerifyShakedeal().isDisplayed(), "user is on wrong page");
		
	}

}
