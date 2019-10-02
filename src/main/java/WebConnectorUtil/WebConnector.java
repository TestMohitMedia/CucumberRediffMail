package WebConnectorUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import junit.framework.Assert;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.rediffmail.reports.ExtentManager;


public class WebConnector {
	public WebDriver driver;
	public Properties prop;
    ExtentReports report;
	ExtentTest scenario;
	//Use for share webdriver
	public WebConnector() {
		if (prop == null) {
			try {
				prop = new Properties();

				FileInputStream fs = new FileInputStream(
						System.getProperty("user.dir")
								+ "\\Configuration\\Project.properties");
				try {
					prop.load(fs);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
    public void initReport(String scenarioName){
    report=ExtentManager.getInstance(prop.getProperty("reportPath"));
    scenario=report.createTest(scenarioName);
    scenario.log(Status.INFO," Starting "+ scenarioName);
    }
    
    public void infoLog(String msg)
    {
    	scenario.log(Status.INFO,msg);
    }
    public void failureLog(String errorMsg)
    {
    	scenario.log(Status.FAIL,errorMsg);
    	takeScreenShot();
    }
    public void reportQuit()
    {
    	if(report!=null)
    	report.flush();
    }
    public void takeScreenShot()
    {
    	Date d=new Date();
    	String screenshotFile=d.toString().replace(":","_").replace(" ","_")+".png";
    	//takescreenhsot
    	File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	try{
    	//get dynamic folder name
    		FileUtils.copyFile(srcFile, new File(ExtentManager.screenshotFolderPath+screenshotFile));
    		scenario.log(Status.FAIL,"ScreenShot-> "+scenario.addScreenCaptureFromPath(ExtentManager.screenshotFolderPath+screenshotFile));
    	}catch(Exception ex)
    	{
    		
    	}
    }
	public void initBrowser(String BrowserName) {
		if(prop.getProperty("gridRun").equals("Y")) {
			// invoke browser through grid
			DesiredCapabilities cap=null;
			if(BrowserName.equals("FF")) {
				cap = DesiredCapabilities.firefox();
				cap.setJavascriptEnabled(true);
				cap.setPlatform(Platform.WINDOWS);
			}else if(BrowserName.equals("Chrome")) {
				cap = DesiredCapabilities.chrome();
				cap.setJavascriptEnabled(true);
				cap.setPlatform(Platform.WINDOWS);
			}
			
			try {
				driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		else
		{
			switch (BrowserName) {
			case "FF":
				System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")
						+ "\\Driver\\geckodriver.exe");
				WebDriver driver=new FirefoxDriver();
				break;
			case "CH":
				System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY,
						System.getProperty("user.dir")
								+ "\\Driver\\chromedriver.exe");
				ChromeOptions option = new ChromeOptions();
				option.addArguments("--disable-notifications");
				option.addArguments("--disable-infobar");
				driver = new ChromeDriver(option);
				driver.manage().window().maximize();
				break;
			default:
				driver = new InternetExplorerDriver();
			}
		}
  }

	public void navigateURL(String keyURL) {
		driver.get(prop.getProperty(keyURL));
	}
	public void click(String objectKey){
		getObject(objectKey).click();
	}
	public void sendKey(String data,String locatorKey){
		getObject(locatorKey).sendKeys(data);
    }
	
	public WebElement getObject(String objectKey){
	  WebElement element=null;
	  WebDriverWait wait =new WebDriverWait(driver,20);
	  try{
		  if(objectKey.endsWith("xpath")){
		  element=driver.findElement(By.xpath(prop.getProperty(objectKey)));
		  wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(prop.getProperty(objectKey))));
		  }else if(objectKey.endsWith("id")){
			 element=driver.findElement(By.id(prop.getProperty(objectKey)));
			 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id(prop.getProperty(objectKey))));
		  }else if(objectKey.endsWith("name")){
				 element=driver.findElement(By.name(prop.getProperty(objectKey)));
				 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name(prop.getProperty(objectKey))));
		  }else if(objectKey.endsWith("cssSelector")){
				 element=driver.findElement(By.cssSelector(prop.getProperty(objectKey)));
				 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(prop.getProperty(objectKey))));
		  }
		  else if(objectKey.endsWith("link")){
				 element=driver.findElement(By.linkText(prop.getProperty(objectKey)));
				 wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.linkText(prop.getProperty(objectKey))));
		  }
		  
	  }catch(Exception e)
	  {
		  failureLog("Unable to locate object" +objectKey);  
	  }
	  return element;
	}
	public boolean isElementPresent(String objectKey){
	  List<WebElement> element=null;
	  WebDriverWait waits =new WebDriverWait(driver,20);
	  if(objectKey.endsWith("xpath")){
		  element=driver.findElements(By.xpath(prop.getProperty(objectKey)));
		  waits.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(prop.getProperty(objectKey))));
		  }else if(objectKey.endsWith("id")){
			 element=driver.findElements(By.id(prop.getProperty(objectKey)));
			 waits.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id(prop.getProperty(objectKey))));
		  }else if(objectKey.endsWith("name")){
				 element=driver.findElements(By.name(prop.getProperty(objectKey)));
				 waits.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name(prop.getProperty(objectKey))));
		  }else if(objectKey.endsWith("cssSelector")){
				 element=driver.findElements(By.cssSelector(prop.getProperty(objectKey)));
				 waits.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(prop.getProperty(objectKey))));
		  }
		  else if(objectKey.endsWith("link")){
				 element=driver.findElements(By.linkText(prop.getProperty(objectKey)));
				 waits.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.linkText(prop.getProperty(objectKey))));
		  }
	  if(element.size()==0)
		  return false;
	  else
		  return true;
	}

	public void login(String userName, String userPassword) throws InterruptedException {
		sendKey(userName,"userEmail_id");
		click("btnContinue_id");
		sendKey(userPassword,"userPassword_id");
		click("btnSummit_id");
		Thread.sleep(400);
	}

	@SuppressWarnings("deprecation")
	public void validateLogin(String expectedResult){
		boolean result=isElementPresent("portfolio_xpath");
		String actualResult="";
		if(result)
			actualResult="success";
		else
			actualResult="False";
		Assert.assertTrue("Login is failed.",result);
		/*if(!actualResult.equalsIgnoreCase(expectedResult))
			System.out.println("Login is failed");
		else
			System.out.println("Login is successed.");*/
			
		
	}
}
