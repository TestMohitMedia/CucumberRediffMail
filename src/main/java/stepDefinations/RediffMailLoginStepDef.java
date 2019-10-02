package stepDefinations;


import java.util.List;
import java.util.Map;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.rediffmail.reports.ExtentManager;

import WebConnectorUtil.WebConnector;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;


public class RediffMailLoginStepDef {
	//ExtentReports report;
	WebConnector con;
    public RediffMailLoginStepDef(WebConnector con) {
		this.con = con;
	}
	@Given("^I open (.*)$")
	public void I_open_CH(String Browser) {
		con.infoLog("Opening Browser");
	   con.initBrowser(Browser);  
	}
	@Given("^I goto (.*)$")
	public void I_goto_loginURL(String url)  {
	   con.navigateURL(url);
	   con.infoLog("Url open successfully");
	}
    @Then("^Login should be (.*)$")
	public void Login_should_be_Success(String result)  {
	   con.validateLogin(result);
	   con.infoLog("Validate user credentials");
	}
    @Given("^I am on dashboard and check user profile$")
    public void I_am_on_dashboard_and_check_user_profile(DataTable dt){
    	List<Map<String, String>> list=dt.asMaps(String.class,String.class);
    	for(int i=0;i<list.size();i++){
    	System.out.println(list.get(i).get("Customer Name"));
    	System.out.println(list.get(i).get("Company"));
    	}
     }

    @Given("^I select Infosys from Company list$")
    public void I_select_Infosys_from_Company_list()  {
        
    }
}
