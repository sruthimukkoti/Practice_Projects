import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AloneTest {

	public static void main(String[] args) {
		String reqProduct="IPHONE 13 PRO";
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/client/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/client/");
		driver.findElement(By.cssSelector("input#userEmail")).sendKeys("sruthim1726@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Second@123");
		driver.findElement(By.id("login")).click();
		List<WebElement> products=driver.findElements(By.xpath("//div[@class='card-body']"));			
		
		WebElement prod=products.stream().filter(product->product.findElement(By.cssSelector("b")).getText().equals(reqProduct)).findFirst().orElse(null);
		prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();

}
}
