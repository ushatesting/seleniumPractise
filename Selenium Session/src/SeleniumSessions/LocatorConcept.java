package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C://Users//Prisha Bhatia//Downloads//chromedriver_win32/chromedriver.exe");
		WebDriver driver =new ChromeDriver(); // launching chrome
		driver.get("http://newtours.demoaut.com/mercuryregister.php"); // entering URL
		
		
		/*1. By Xpath Locator
		// Absolute xpath should not be used  html/body/div[1]/div[5]
		// only Relative path should be used
		 
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("World");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("8793419795");
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("usha.m35@gmail.com");
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("24 Street1");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Noida");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("UP");
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("201304");*/
		
		//2.By Id
		
		//driver.findElement(By.id("userName")).sendKeys("ubhatiya@yahoo.com");
		
		/*3.By Name
		
		driver.findElement(By.name("firstName")).sendKeys("Usha");
		driver.findElement(By.name("lastName")).sendKeys("Mulchandani");
		driver.findElement(By.name("phone")).sendKeys("123456");
		driver.findElement(By.name("userName")).sendKeys("ubhaitya@yahoo.com");
		driver.findElement(By.name("address1")).sendKeys("123 Street"); */
		
		//4. By LinkText
		
		driver.findElement(By.linkText("SIGN-ON")).click();
		driver.findElement(By.linkText("REGISTER")).click();
		
		//5.By PartialLinkText -- not recommended and we need to give some portion of the larger link (partial link)
		
		driver.findElement(By.partialLinkText("Desti")).click();
		
		//6. By CSSSelector--  to select CC seletor, inspect element--> id --> right click--> select CSS selector
		//or just put #infront of ID name like this (#username)

		driver.findElement(By.cssSelector("#userName")).sendKeys("usha123@gmail.com");
		
		
		//7.Class-- not recommended-- class name can be duplicate for different elements
		
		driver.findElement(By.className("")).sendKeys(""); //couldnt find any elemeent with class when inspected	
		
		
		
		/* priority wise
		
		1) Id is the first  and if ID not present 
		2) Xpath( it should be relative path and not absolute) / 
		2) CSS se;lector  is also powerful since itneranaly it is using ID only. 
		   CSS selector - ID is there , it will be #(ID)
		   CSS Selector - ID is not there and class is there the  CSS selector will be  .(class)
		3) Name	  
		4) Class
		 LinkText  are on;y for links and it is reprsented by <a> html tag when inspected   */
		
		
		
		
		
	}

}
