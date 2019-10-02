package stepDefinations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTableStepDefination {
	
	public WebDriver driver;
	public WebDriverWait wait;
	
    @Given("^user on login screen$")
	public void user_is_already_on_rediffmail_login_page() throws Throwable 
	{
		ChromeOptions option=new ChromeOptions();
	  	option.addArguments("--disable-notifications");
	  	option.addArguments("disable-infobars");
	  	option.addArguments("--start-maximized");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY,"./Driver/chromedriver.exe");
	    driver=new ChromeDriver(option);
	    driver.navigate().to("https://www.rediff.com/");
	}

    @When("^page titile should rediffmail$")
	public void title_of_login_page_is_Rediffmail() throws Throwable {
	    System.out.println("RediffMail Home Page.");
	  
	}
	@Then("^enter credentials$")
	public void user_enters_username_and_password_on_rediffmail(DataTable dt) throws InterruptedException {
		wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//u[contains(text(),'Money')]"))));
		driver.findElement(By.xpath("//u[contains(text(),'Money')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Sign In")).click();
		Thread.sleep(3000);
		List<List<String>> ls=dt.raw();
		//driver.findElement(By.id("useremail")).sendKeys("babamohit1988@gmail.com");
		driver.findElement(By.id("useremail")).sendKeys(ls.get(0).get(0));
		driver.findElement(By.id("emailsubmit")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("userpass"))));   
	    //driver.findElement(By.id("userpass")).sendKeys("mohit@12345");
		driver.findElement(By.id("userpass")).sendKeys(ls.get(0).get(1));
	}
	
}
