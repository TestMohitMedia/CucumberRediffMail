package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RediffLogin {
	//public WebDriver driver;
	//public WebDriverWait wait;
	
	
	/*@Given("^user is already on rediffmail login page$")
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

	@When("^title of login page is Rediffmail$")
	public void title_of_login_page_is_Rediffmail() throws Throwable {
	    System.out.println("RediffMail Home Page.");
	  
	}
	@Then("^user enters \"(.*)\" and \"(.*)\" on rediffmail$")
	//@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\" on rediffmail$")
	//@Then("^user enters username and password on rediffmail$")
	public void user_enters_username_and_password_on_rediffmail(String name,String passwd) throws Throwable {
		wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//u[contains(text(),'Money')]"))));
		driver.findElement(By.xpath("//u[contains(text(),'Money')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Sign In")).click();
		Thread.sleep(3000);
		//driver.findElement(By.id("useremail")).sendKeys("babamohit1988@gmail.com");
		driver.findElement(By.id("useremail")).sendKeys(name);
		driver.findElement(By.id("emailsubmit")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("userpass"))));   
	    //driver.findElement(By.id("userpass")).sendKeys("mohit@12345");
		driver.findElement(By.id("userpass")).sendKeys(passwd);
	}

	@Then("^user click on login button on rediffmail$")
	public void user_click_on_login_button_on_rediffmail() {
	    driver.findElement(By.id("loginsubmit")).click();
	
	}
	@Then("^user is on rediffmail home page$")
	public void user_is_on_rediffmail_home_page()  {
	   

	}*/
}