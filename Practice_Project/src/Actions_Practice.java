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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Actions_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//WebDriverWait w= new WebDriverWait(driver,Duration.ofSeconds(5));
		Actions act = new Actions(driver);
		driver.get("https://www.flipkart.com/");
		act.moveToElement(driver.findElement(By.xpath("//div[@aria-label='Fashion']"))).build().perform();
		//w.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/object[1]/a[3]"))));
		driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/object[1]/a[3]")).click();
		System.out.println(driver.getTitle());
		//driver.findElement(By.xpath("//button[text()=\"✕\"]")).click();
		//driver.navigate().back();
		//driver.findElement(By.xpath("//button[text()=\"✕\"]")).click();
		
	}

}
