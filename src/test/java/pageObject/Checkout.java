package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Checkout {
	
	public WebDriver driver;

	public Checkout(WebDriver driver) {
		this.driver = driver;
	}

	By cartbag = By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/a[4]/img");
	By checkOutButton =By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	By Promobutton = By.cssSelector(".promoBtn");
	By place = By.xpath("//button[contains(text(),'Place Order')]");
	
	

	public void CheckoutItems() {
		driver.findElement(cartbag).click();
		driver.findElement(checkOutButton).click();
	}

	public Boolean VerifyPromoBtn() {
		return driver.findElement(Promobutton).isDisplayed();
	}
	
	public Boolean VerifyPlaceorder() {
		return driver.findElement(place).isDisplayed();
	}
	
	
	
}
