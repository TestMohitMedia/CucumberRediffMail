package stepDefinations;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.assertj.core.api.Assertions;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Holiday {
	@Before("@BookHotel")
	public void testBefore()
	{
		System.out.println("==========Before Scenario======");
	}
	@Given("^I live in london$")
	public void I_live_in_london()   {
	    // Express the Regexp above with the code you wish you had
	     
	}

	@Given("^I want to go on holiday$")
	public void I_want_to_go_on_holiday()   {
	    // Express the Regexp above with the code you wish you had
	     
	}

	@Given("^We are (\\d+) adults$")
	public void We_are_adults(int adult,List<Map<String,String>> adultName)   {
		Map<String,String> adultInfo;
		for(int i=0;i<adultName.size();i++)
		{
			adultInfo=adultName.get(i);
			System.out.println("Map size :"+adultInfo.size());
			Iterator<Map.Entry<String,String>> itr= adultInfo.entrySet().iterator();
			while(itr.hasNext())
			{
				Map.Entry<String, String> entry=itr.next();
				System.out.println("Key: "+entry.getKey()+" : Value "+entry.getValue());
			}
		}
	    //System.out.println("No of adult:"+adult+"adult name is : "+adultName.toString());
	     
	}

	@Given("^I want to book ticket on (\\d+)th May (\\d+) to (\\d+)th May (\\d+).$")
	public void I_want_to_book_ticket_on_th_May_to_th_May_(int arg1, int arg2, int arg3, int arg4)   {
	    // Express the Regexp above with the code you wish you had
	     
	}

	@When("^I go to travel agent$")
	public void I_go_to_travel_agent()   {
	    // Express the Regexp above with the code you wish you had
	     
	}

	@Then("^He should to able to help me in the budget od (\\d+)USD.$")
	public void He_should_to_able_to_help_me_in_the_budget_od_USD(int arg1)   {
	    // Express the Regexp above with the code you wish you had
	    
	}

	@Then("^He should also provide me option of cancel$")
	public void He_should_also_provide_me_option_of_cancel()   {
	    // Express the Regexp above with the code you wish you had
	     
	}

	@Then("^He should not ask for advance more than (\\d+) USD.$")
	public void He_should_not_ask_for_advance_more_than_USD(int arg1)   {
	    // Express the Regexp above with the code you wish you had
	     
}
	@And("^I want to book flight to \"([^\"]*)\" on \"([^\"]*)\" on portal.$")
	public void I_want_to_book_flight_to_Hawai_on_th_feb(String destination,String fromdate) {
	    System.out.println(destination+" "+fromdate);
	    Assertions.assertThat("A").isEqualTo("B");
	    
	}
	@And("^Return flight on \"([^\"]*)\"$")
	public void Return_flight_on_th_Feb(String toDate) {
	    // Express the Regexp above with the code you wish you had
		System.out.println(toDate);
	}
	/*@Given("^I go to webside www.ebay.com$")
	public void I_go_to_webside_www_ebay_com()  {
	    System.out.println("I go to webside www.ebay.com$");
	    
	}*/
}
