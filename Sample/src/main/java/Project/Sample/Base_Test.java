package Project.Sample;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;

public class Base_Test {
	
	WebDriver driver;
	//ChromeOptions op = new ChromeOptions();
	public WebDriver initializeDriver()
	{
		Map<String, Object> prefs = new HashMap<String, Object>();
		//This not an alert box, so you can't handle it using Alert, this is a chrome browser notification, To Switch off this browser notification you need to create chrome preference map with chrome option as below :
		//add key and value to map as follow to switch off browser notification
		//Pass the argument 1 to allow and 2 to block
		prefs.put("profile.default_content_setting_values.notifications", 2);
		//Create an instance of ChromeOptions 
		ChromeOptions options = new ChromeOptions();
		// set ExperimentalOption - prefs 
		options.setExperimentalOption("prefs", prefs);
		//Now Pass ChromeOptions instance to ChromeDriver Constructor to initialize chrome driver which will switch off this browser notification on the chrome browser
		WebDriver driver = new ChromeDriver(options);
		//WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
		
	}
	
	
	public LoginPage URL()
	{
		driver=initializeDriver();
		driver.get("https://www.facebook.com/");
		LoginPage loginpage = new LoginPage(driver);
		return loginpage;
	}
	
	@DataProvider
	public Object[][] data()
	{
		return new Object[][] {{"8328204284","SruThi@2617"},{"1234567890","Test@1234"}};
		
	}
	
	public void internalWaits()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	public String getScreenshot(String testCasename) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File(System.getProperty("user.dir")+"//reports"+testCasename+".png");
		FileUtils.copyFile(source,destination);
		return System.getProperty("user.dir")+"//reports"+testCasename+".png";
	}
	
	public void closeDriver()
	{
		driver.quit();
	}
	
}

