package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C://Users//Prisha Bhatia//Downloads//chromedriver_win32/chromedriver.exe");
		WebDriver driver =new ChromeDriver(); // launching chrome
		driver.get("http://newtours.demoaut.com/mercuryregister.php"); // entering URL
		
		// there is a select class in selenium to select the values from drop down so we need to import that and use that by creating an object for Select Class
		
		
		
		Select select = new Select(driver.findElement(By.name("country")));
		//using the "select"object
		
		select.selectByVisibleText("UGANDA");
		
		//Select --Class select (object) = new Select()
	}

}
