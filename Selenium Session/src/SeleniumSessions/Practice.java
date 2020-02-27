package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	System.setProperty("webdriver.chrome.driver","C://Users//Prisha Bhatia//Downloads//chromedriver_win32/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("usha.mulchandani84@gmail.com");
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("dhruv@15");
	
	Select select =new Select(driver.findElement(By.id(id)))
	
	}

}
