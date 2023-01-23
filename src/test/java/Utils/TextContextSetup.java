package Utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObject.PageObjectManager;

public class TextContextSetup {

	public WebDriver driver;
	public String LandingPageProductname;
	public String offerpageProduct;
	public PageObjectManager pageobManager;
	public TestBase testbase;
	public GenericUtils genUtils;
	
	public TextContextSetup() throws IOException
	{
		testbase=new TestBase();
		pageobManager=new PageObjectManager(testbase.WebDriverManager1());
		genUtils=new GenericUtils(testbase.WebDriverManager1());
		
	}
}
