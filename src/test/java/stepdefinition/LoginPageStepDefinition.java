package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginPageStepDefinition {

	public static WebDriver driver;
	@Given("^Open Browser$")
	public void open_Browser() {

		System.setProperty("webdriver.chrome.driver", "D:\\rivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@Then("^Enter URL$")
	public void enter_URL() {

		driver.get("https://www.crmpro.com/index.html");
	}

	@Then("^Enetr UserName and Password$")
	public void enetr_UserName_and_Password() {

		driver.findElement(By.name("username")).clear();
		driver.findElement(By.name("username")).sendKeys("velmurugan");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("978967298");
		driver.findElement(By.xpath(".//*[@id='loginForm']/div/div/input")).click();

	}

	@Then("^Check Page Title$")
	public void check_Page_Title() {

		String title = driver.getTitle();

		System.out.println(title);

		// Assert.assertEquals(title, "CRM software for customer relationship
		// management, sales, and support.");
	}

	@Then("^LogOut page And Close The Browser$")
	public void logout_page_And_Close_The_Browser() {

		// driver.findElement(By.xpath("html/body/table[1]/tbody/tr[2]/td[1]/div/table/tbody/tr/td[4]/a")).click();

		driver.close();
	}

}
