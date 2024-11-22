import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sports.ladbrokes.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		//Thread.sleep(10000);
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		driver.findElement(By.cssSelector("nav[class='header-bottom-menu'] a[title='Football']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.cssSelector("a[href='/sport/football/outrights']")).click();
		//Thread.sleep(2000);
		List<WebElement> list=driver.findElements(By.xpath("//accordion[@class='capitalized']"));
		for(int i=0;i<list.size();i++)
		{
			list.get(i).click();
			List<WebElement> list1=driver.findElements(By.xpath("(//list-card[@data-crlat='oddsCard.outrightsTemplate'])"));
			for(int j=0;j<list1.size();i++)
			{
				if(list1.get(j).getText().contains("Lucky"))
				{
					list1.get(j).click();
					break;
				}
			}
			//Thread.sleep(5000);
			driver.findElement(By.cssSelector("button[id='luckyDipBtn']")).click();
			//Thread.sleep(1000);
			driver.findElement(By.id("stake-input")).sendKeys("1");
			
		}
		
		
		
	}

}
