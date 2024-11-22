package Project.Sample;
import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LoginPage extends Base_Test {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="#email")
	WebElement email;
	@FindBy(css="#pass")
	WebElement pass;
	@FindBy(xpath="//button[@name='login']")
	WebElement loginbutton;
	
	public void login(String email1, String password)
	{
	email.sendKeys(email1);
	pass.sendKeys(password);
	loginbutton.click();
	}
	
}


