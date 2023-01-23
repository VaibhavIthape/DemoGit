package stepDefination;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Utils.TestBase;
import Utils.TextContextSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObject.LandingPage;

public class LandingPageStepDefination {

	TextContextSetup testCon;
	TestBase testbase;
	LandingPage landingpage;
	public LandingPageStepDefination(TextContextSetup testCon ) {
		this.testCon = testCon;
		landingpage = testCon.pageobManager.getLandingPage();
		
	}

	@Given("User is on GreenCart Landing page")
	public void user_is_on_green_cart_landing_page() {
		
		Assert.assertTrue(landingpage.getTitle().contains("GreenKart"));
	}

	@When("^User searched with Shorthome (.+) and extract actual name of product$")
	public void user_searched_with_shorthome_and_extract_actual_name_of_product(String ShortText)
			throws InterruptedException {

		LandingPage landingpage = testCon.pageobManager.getLandingPage();
		landingpage.SearchItem(ShortText);
		Thread.sleep(2000);
		testCon.LandingPageProductname = landingpage.getProductName().split("-")[0].trim();
		System.out.println(testCon.LandingPageProductname + " Is extract from Home Page");
	}
	
	@When("Added {string} items of the selected product to cart")
	public void Added_iteams_product(String quantity)
	{
		landingpage.IncrementQuantity(Integer.parseInt(quantity));
		landingpage.addTocart();
	}

}
