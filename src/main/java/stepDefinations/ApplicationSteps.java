package stepDefinations;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import WebConnectorUtil.WebConnector;

public class ApplicationSteps {
	
	WebConnector con;
    public ApplicationSteps(WebConnector con) {
		this.con = con;
	}
    
    @And("^I Login inside application$")
	/*public void I_Login_inside_application(List<Map<String,String>> data) throws InterruptedException {
	   con.login(data.get(0).get("UserName"),data.get(0).get("Password"));
	 }*/
    public void I_Login_inside_application(DataTable data) throws InterruptedException {
    	List<String> userList=data.asList(String.class);
 	   //con.login(data.get(0).get("UserName"),data.get(0).get("Password"));
 	   con.login(userList.get(0),userList.get(1));
 	 }
    /*public void TestQA(DataTable data) throws InterruptedException {
    	List<String> userList=data.asList(String.class);
 	   //con.login(data.get(0).get("UserName"),data.get(0).get("Password"));
 	   con.login(userList.get(0),userList.get(1));
 	 }*/
}
