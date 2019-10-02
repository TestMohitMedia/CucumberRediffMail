package stepDefinations;

import WebConnectorUtil.WebConnector;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class buyProductStepDef {

	WebConnector con;

	public buyProductStepDef(WebConnector con1) {
		this.con = con1;
	}

	@Given("^I go to (.*)$")
	public void I_go_to_webside_www_ebay_com(String url) {
		con.initBrowser("CH");
		con.navigateURL(url);

	}
	@And("^I enter (.*) into (.*) field$")	
	public void I_enter_mohitqa_gmail_com_into_userEmail_field(String data,String locatorKey){
		
	  con.sendKey(data, locatorKey);
	}

	@When("^I add a shirt into cart$")
	public void I_add_a_shirt_into_cart() {
		System.out.println("I add a shirt into cart");

	}

	@Then("^Cart item count should increase$")
	public void Cart_item_count_should_increase() {
		System.out.println("Cart item count should increase");

	}
}
