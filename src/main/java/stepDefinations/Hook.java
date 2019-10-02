package stepDefinations;


import WebConnectorUtil.WebConnector;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;


	public class Hook 
	{
		WebConnector con;
		Scenario scenario;
		public Hook(WebConnector con){
			this.con=con;
		}
	 @Before 
	 public void setUp(Scenario scenario)
	 {
		 this.scenario=scenario;
		 System.out.println("Before Scenario");
		 con.initReport(scenario.getName());
	 }
	 @After
	 public void tearDown()
	 {
		 System.out.println("After Scenario.");
		 con.reportQuit();
	 }
	
}
