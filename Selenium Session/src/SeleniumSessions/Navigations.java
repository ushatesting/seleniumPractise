package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		//get() vs navigate.to() -- both are used to launch the URL but navigate () is used to launch the external URL
		System.setProperty("webdriver.chrome.driver","C://Users//Prisha Bhatia//Downloads//chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in");
		
	
		driver.manage().deleteAllCookies();
		
		
		Thread.sleep(2000);
		
		driver.navigate().to("https://www.facebook.com");
		
		driver.navigate().back();
		
		Thread.sleep(1000);
		
		driver.navigate().forward();
		
		
		driver.navigate().back();
		
		driver.quit();
		
		
		
		

	}

}
