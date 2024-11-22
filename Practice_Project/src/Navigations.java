import java.util.List;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Navigations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		/*driver.get("https://www.google.com/");
		driver.navigate().to("https://www.udemy.com/");
		driver.navigate().back();
		//driver.close();
		driver.quit();*/
		driver.get("https://www.facebook.com/");		
		driver.findElement(By.id("email")).sendKeys("8328204284");
		driver.findElement(By.id("pass")).sendKeys("SruThi@2617");
		driver.findElement(By.name("login")).click();
		//driver.switchTo().alert().accept();
		
	}

}
