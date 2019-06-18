package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\Selenium Wrokphase\\PROJECT\\BDDFrameTest\\src\\test\\resources\\Feature_File\\dataprovider.feature", glue = {
		"stepdefinition" }, dryRun = false, format = { "pretty",
				"html:Reports", "json:Json_Reports/Cucumber.json",
				"junit:Junit_Reort/Cucmber.xml" }, monochrome = true, strict = true, tags = { "@DataTableMap" })
public class RunnerClass {

}
