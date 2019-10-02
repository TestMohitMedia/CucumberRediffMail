package Runner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="./src/main/java/Features/RediffMailLogin.feature" //path of feateture file
		,glue={"stepDefinations"}, //path of step defination file 
		format={"pretty","html:test-output"}, //to generate different type of report
        dryRun=false, 
		strict=false, //it will check if any step is not defined in step defination file.
		monochrome=true //display the console output in proper readable format
		//tags={"@CreatePortfolio"}
		)

// tags={"@Regression , @Smoke"}--execute all test cases as smoke or regression.
//tags={"@Regression" , "@Smoke"}--execute all test cases as smoke and regression.
//tags={"~@Regression" , "@Smoke"} ~: Using escape keyword, we can ignore test case.

//Hooks- Hooks are use in cucumber to define precondition & postcondition ex. @Before & @After.

//features="classpath:Features" //path of feature file
//features="./src/main/java/Features/buyproducts.feature" //path for specefic feateture file
/*dryRun: It is only checking not execution i.e. everything is fine interms of proper mapping b/w 
feature & stepdef files.If dryRun is true then execution will not happen. So we keep as false.*/

public class MyRunner {

	
}
