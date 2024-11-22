import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; 


public class CartItems {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/saisruthi.mukkoti/Documents/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		String[] items = {"Beans","Cucumber","Beetroot","Tomato"};
		addItems(driver,items);
	}
	public static void addItems(WebDriver driver,String[] items)
	{
		int j=0;
		List itemsNeededList = Arrays.asList(items);
		List<WebElement> itemNames = driver.findElements(By.xpath("//h4[@class='product-name']"));
		for(int i=0;i<itemNames.size();i++)
		{
		String[] reqName = itemNames.get(i).getText().split("-");
		String itemNeeded = reqName[0].trim();
		//List itemsNeededList = Arrays.asList(items);
		if(itemsNeededList.contains(itemNeeded))
		{
			j++;
			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
		}
		if(j==items.length)
			break;
		
		}
		
	}

}


}
