package stepDefination;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Utils.TextContextSetup;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class Hooks {

	TextContextSetup testCon;

	public Hooks(TextContextSetup testCon) {
		this.testCon = testCon;
	}

	@After
	public void AfterScenario() throws IOException {
		testCon.testbase.WebDriverManager1().quit();
	}
	
	@AfterStep
	public void AddScreenshot(Scenario scn) throws IOException
	{
		WebDriver driver=testCon.testbase.WebDriverManager1();
		if(scn.isFailed())
		{
			File sourcePath=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			byte[] fileContent=FileUtils.readFileToByteArray(sourcePath);
			scn.attach(fileContent, "image/png", "image");
			
		}
	}
}
