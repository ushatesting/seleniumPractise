package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "C://Users//Prisha Bhatia//Downloads//chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://classic.crmpro.com/login.cfm");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Ushamul");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("gudiya@26");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.switchTo().frame("mainpanel");
		
		driver.findElement(By.linkText("CONTACTS")).click();

		
		driver.findElement(By.xpath("//a[contains(text(),'Umesh bhatia')]/parent::td//preceding-sibling::td//input[@name='contact_id']")).click();
		driver.quit();
		
		
	}
}
