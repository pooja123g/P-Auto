import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OpenPage {

	WebDriver driver;
	
	@Test
	public void OpenBrowser() throws InterruptedException{
		driver = new ChromeDriver(); 
		driver.get("https://www.amazon.in");
		
		driver.manage().window().maximize();
	
		//WebElement selectdrpdwn = 
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 16pro max");
		driver.findElement(By.id("nav-search-submit-button")).click();
		System.out.println("Print1");
		Thread.sleep(5000);		
		driver.quit();
	
	}
}
