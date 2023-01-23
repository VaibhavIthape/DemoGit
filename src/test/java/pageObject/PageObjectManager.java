package pageObject;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

	public WebDriver driver;
	public LandingPage landingpage;
	public OffersPage offerPage;
	public Checkout checkoutPage;
	public PageObjectManager(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	
	public LandingPage getLandingPage()
	{
		landingpage=new LandingPage(driver);
		return landingpage;
	}
	
	
	public OffersPage getofferpage()
	{
		offerPage=new OffersPage(driver);
		return offerPage;
	}
	
	public Checkout getCheckoutPage()
	{
		checkoutPage=new Checkout(driver);
		return checkoutPage;
	}
	
}
