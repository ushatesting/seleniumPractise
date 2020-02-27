package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//This explicit wait will be used till the specific component is located.once located rest of the time will be ignored

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C://Users//Prisha Bhatia//Downloads//chromedriver_win32/chromedriver.exe");
		WebDriver driver =new ChromeDriver(); // launching chrome
		driver.get("https://www.facebook.com"); // entering URL
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		clickOn(driver,driver.findElement(By.xpath("//input[@id='email']")),20);

	}

	public static void clickOn(WebDriver driver,WebElement locator,int timeout) {
		
	new WebDriverWait(driver,timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
	locator.click();
	
	}
}
