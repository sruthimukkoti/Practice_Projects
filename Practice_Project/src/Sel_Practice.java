import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sel_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//label[@for='radio2']/input[@value='radio2']")).click();
		driver.findElement(By.xpath("//*[@id='select-class-example']/fieldset/input[@id='autocomplete']")).sendKeys("pa");
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] div"));
		for(WebElement option : options)
		{
			if(option.getText().equalsIgnoreCase("Pakistan"))
			{
				option.click();
				break;
			}
		}
		WebElement pass = driver.findElement(By.id("dropdown-class-example"));
		Select dropdown=new Select(pass);
		//dropdown.selectByIndex(1);
		//dropdown.selectByValue("option2");
		dropdown.selectByVisibleText("Option3");
		driver.findElement(By.cssSelector("#checkBoxOption1")).click();
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		driver.findElement(By.cssSelector("#name")).sendKeys("Sample");
	    driver.findElement(By.id("alertbtn")).click();
		driver.switchTo().alert().accept();  
		driver.findElement(By.cssSelector("#name")).sendKeys("Sample");
		driver.findElement(By.id("confirmbtn")).click();
		driver.switchTo().alert().dismiss(); 
		driver.findElement(By.xpath("//button[text()='Open Window']")).click();
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		String parentid=it.next();
		String childid=it.next();
		driver.switchTo().window(childid);
		System.out.println(driver.getTitle());
		driver.switchTo().window(parentid);
	}

}
