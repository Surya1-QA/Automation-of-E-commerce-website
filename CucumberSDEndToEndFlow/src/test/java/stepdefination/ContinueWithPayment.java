package stepdefination;

import java.util.Set;

import PageObject.ContinueWithPaymentPF;
import commonUtils.UtilElement;
import configuration.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContinueWithPayment extends Base {

	private ContinueWithPaymentPF ContinuePayment = new ContinueWithPaymentPF(driver);
	private UtilElement ue = new UtilElement();

	@When("user scrolls down and clicks on netbanking option")
	public void user_scrolls_down_and_clicks_on_netbanking_option() {

		ContinuePayment.getClickNetBanking().click();

	}

	@And("selects the bank option")
	public void selects_the_bank_option() {

		ContinuePayment.getClickKotakBank().click();

	}

	@And("clicks on Pay button")
	public void clicks_on_pay_button() {

		ContinuePayment.getClickPay().click();

	}

	@Then("user is navigated to confirmation page")
	public void user_is_navigated_to_confirmation_page() {

		driver.switchTo().parentFrame();

		ue.switchToTab(driver);

//		Set<String> myWindowHandle = driver.getWindowHandles();
//		driver.switchTo().newWindow(myWindowHandle);
//		//form[@onsubmit='return false']

	}

	@When("user clicks on Success button")
	public void user_clicks_on_success_button() {

		ContinuePayment.getClickSuccess().click();

		ContinuePayment.getClickOrderDetails().click();

		// driver.switchTo().parentFrame();
	}

	@Then("order is placed")
	public void order_is_placed() {

	}

}
