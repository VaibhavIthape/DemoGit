package Utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObject.LandingPage;

public class GenericUtils {
	
	public WebDriver driver;
	public GenericUtils(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	@Test(groups= {"ABS"})  
public void switchtoofferspage() {
		
		
		
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> i1 = s1.iterator();
		String ParentWindow = i1.next();
		String chilewindow = i1.next();
		driver.switchTo().window(chilewindow);

	}

}
