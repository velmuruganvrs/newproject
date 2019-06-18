package stepdefinition;

import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class DataProviderdatatable {

	@Given("^Open The Browser$")
	public void Open_The_Browser() {

		System.out.println("Open_The_Browser");
	}
	//
	// @Then("^Enter username and pssword$")
	// public void entercredencial(DataTable crdentical) {
	//
	// List<List<String>> data = crdentical.raw();
	// System.out.println("enter userName " + data.get(0).get(0));
	// System.out.println("enter password " + data.get(0).get(1));
	// }

	@Then("^Enter username and pssword$")
	public void entercredencial(DataTable crdentical) {

		// List<Map<String,String>> data = crdentical.asMap(String.class,
		// String.class);

		//List<Map<String, String>> data = crdentical.asMaps(String.class, String.class);
		
		for (Map<String, String> data : crdentical.asMaps(String.class, String.class)) {
		
			System.out.println("enter userName " + data.get("userName"));
		System.out.println("enter password " + data.get("Password"));
	}
	}
		
	@Then("^Logout page$")
	public void teardown() {
		System.out.println("Browser Closed");
	}

}
