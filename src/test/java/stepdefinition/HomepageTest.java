package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class HomepageTest {

	// @Before
	//
	// public void startTest() {
	// System.out.println("Test Start");
	// }
	//
	// @After
	//
	// public void endTest() {
	// System.out.println("End Start");
	// }

	@Given("^Open Browser and Enter URL$")

	public void Open_Browser_and_Enter_URL() {
		System.out.println("Open_Browser_and_Enter_URL");
	}


	@Then("^Enter Home Page$")

	public void Enter_Home_Page() {
		System.out.println("Enter_Home_Page");
	}

	@Then("^Enter Login Page$")
	public void Enter_Login_Page()

	{
		System.out.println("Enter_Login_Page");
	}

	@Then("^Enter Companies Page$")
	public void Enter_Companies_Page() {
		System.out.println("Enter_Companies_Page");
	}

	@Then("^Enter Delias Page$")
	public void Enter_Delias_Page() {
		System.out.println("Enter_Delias_Page");
	}

	@Then("^Enter Logout Page$")
	public void Enter_Logout_Page() {
		System.out.println("EnterLogout_Page");
	}

}
