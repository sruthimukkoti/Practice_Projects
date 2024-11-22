package Project.Sample;
import java.io.IOException;

import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class fb_test extends Base_Test{
	
	//String email="8328204284",password="SruThi@2617";
	@Test(dataProvider="data")
	public void fb_Login(String email,String password) throws InterruptedException, IOException
	{
		LoginPage loginpage = URL();
		loginpage.login(email,password);
		getScreenshot("fb_Login");
		closeDriver();
	}

}
