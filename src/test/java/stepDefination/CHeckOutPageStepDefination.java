package stepDefination;

import org.testng.Assert;

import Utils.TextContextSetup;
import io.cucumber.java.en.Then;
import pageObject.Checkout;

public class CHeckOutPageStepDefination {

	TextContextSetup testCon;
	public Checkout CheckoutPage;

	public CHeckOutPageStepDefination(TextContextSetup testCon) {
		this.testCon = testCon;
		this.CheckoutPage = testCon.pageobManager.getCheckoutPage();
	}

	@Then("verify user has ability to enter promo code and place the order")
	public void verify_user_has_ability_to_enter_promo_code_and_place_the_order() {

		Assert.assertTrue(CheckoutPage.VerifyPromoBtn());
		Assert.assertTrue(CheckoutPage.VerifyPlaceorder());
	}

	@Then("^User Proceed to checkout and validate the (.+) items in checkout page$")
	public void Then_User_Proceed_to_checkout_and_validate_theitems_in_checkout_page(String name) throws Exception
			  {
		CheckoutPage.CheckoutItems();
		Thread.sleep(2000);
	}
}
