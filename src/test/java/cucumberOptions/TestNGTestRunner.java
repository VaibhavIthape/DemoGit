package cucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.java.it.Data;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumProject1\\src\\test\\java\\features"
,glue="stepDefination"
,monochrome=true,
plugin= {"html:target/cucumber.html", "json:target/cucumber.json",
"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
dryRun=false)
public class TestNGTestRunner extends AbstractTestNGCucumberTests{

	@Override
	@DataProvider()
	public Object[][] scenarios()
	{
		return super.scenarios();
	}
		
}
