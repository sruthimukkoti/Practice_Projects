import java.io.File;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class fileUpload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String downloadpath=System.getProperty("user.dir");
		HashMap<String,Object> map=new HashMap<String,Object>();
		map.put("profile.default_content_settings.popups", 0);
		map.put("download.default_directory", downloadpath);
		ChromeOptions ops=new ChromeOptions();
		ops.setExperimentalOption("prefs", map);
		WebDriver driver = new ChromeDriver(ops);
		driver.manage().window().maximize();
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		Thread.sleep(2000);
		//WebElement JPGimage=driver.findElement(By.cssSelector("#pickfiles"));
		//JPGimage.sendKeys("C:\\Users\\saisruthi.mukkoti\\Downloads\\resume\\Sruthi_QA_Resume.docx");
		driver.findElement(By.cssSelector("#pickfiles")).click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#processTask")));
		driver.findElement(By.cssSelector("#processTask")).click();
		File f=new File(downloadpath);
		
	}

}
