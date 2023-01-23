package stepDefination;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.page.Page;
import org.testng.Assert;

import Utils.TextContextSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.LandingPage;
import pageObject.OffersPage;
import pageObject.PageObjectManager;

public class OfferPageStepDefination {

	TextContextSetup testCon;
	PageObjectManager POM;

	public OfferPageStepDefination(TextContextSetup testCon) {
		this.testCon = testCon;
	}

	@Then("^User Searched for (.+) shortname in offers page to check if product exist with same name")
	public void user_searched_for_same_shortname_in_offers_page_to_check_if_product_exist(String shortName)
			throws InterruptedException {
		
		switchedTooffersPage();
		OffersPage offerpage = testCon.pageobManager.getofferpage();
		offerpage.SearchItem(shortName);

		Thread.sleep(2000);
		testCon.offerpageProduct = offerpage.getProductName();

	}
	
	public void switchedTooffersPage()
	{
		LandingPage landingpage=testCon.pageobManager.getLandingPage();
		landingpage.selectTopDealsPage();
		testCon.genUtils.switchtoofferspage();
	}

	

	@Then("validate product name in offers page matches with Landing page")
	public void validate_product_name_in_offers_page() {
		Assert.assertEquals(testCon.offerpageProduct, testCon.LandingPageProductname);

	}
}
