import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.time.Duration;
import java.util.Iterator;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Limiting_Webdriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement footerdriver = driver.findElement(By.cssSelector(".gf-t"));
		//System.out.println(footerdriver.findElements(By.tagName("a")).size());
		WebElement columndriver = footerdriver.findElement(By.xpath("//tbody/tr/td[1]/ul"));
		//System.out.println(columndriver.findElements(By.tagName("a")).size());
		for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++)
		{
			String key = Keys.chord(Keys.CONTROL,Keys.ENTER);
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(key);	
		}
		//Actions a = new Actions(driver);
		Set<String> tabs = driver.getWindowHandles();
		Iterator<String> it = tabs.iterator();
		while(it.hasNext())
		{
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
			driver.close();
		}
	}

}
