package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomizeXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	System.setProperty("webdriver.chrome.driver", "C://Users//Prisha Bhatia//Downloads//chromedriver_win32/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.ebay.com");
	
	//customize xpath using attribute
	//driver.findElement(By.xpath("//input[@name='_nkw']")).sendKeys("books");
	//driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("books");
	
	//using contains function
	
	//driver.findElement(By.xpath("//input[contains(@id,'gh-ac')]")).sendKeys("books");
	driver.findElement(By.xpath("//input[contains(@name,'_nkw')]")).sendKeys("books");
	
	
	/*generic synatx below
	
	synatx By.xpath("//(html tag)[@ any attribut='value']")
	using contains functions
	syntax By.xpath("//(html tag)[contains(@attribute,'value']")) 
	
	Contains is very useful when the value of any atrribute is dynamic. contains means id should have test_ anywhere
	here id is dynamic which is changing on refresh,or page load, page reopen
	for eg id
	by Id = test_123
	
	starts-with
	test_456
	test_789
	
	ends-with
	test_test_789_test
	233_test_t
	345_test_t
	
	to resolve above , we can write xpath below, it works like test%
	driver.findElement(By.xpath("//input[contains(@id,'test_')]")).sendKeys("books"); 
	
	we have another method starts-with, it means id should start-with test_
	
	driver.findElement(By.xpath("//input[starts-with(@id,'test_')]")).sendKeys("books"); 
	
	driver.findElement(By.xpath("//input[ends-with(@id,'_test')]")).sendKeys("books"); 

    Depending upon the pattern we need to use starts with, ends-with , contains. contains can be used in any of the three ways */
	
	/*customize xpath for clicking links
	All the links are represented by a html tag
	Syntax

	driver.findElement(By.xpath("//a[contains(text(),'name of the link')]")).click()  */
	
	driver.findElement(By.xpath("//a[contains(text(),'My eBay')]")).click();
	
	/* disadvantage of absolute Xpath
	1) performance issue
	2) not reliable 
	3) can be change any time in future
    
    Adv of customized xpath
	1) very fast
	2) performance issue not ther
	3) unique
	4) Syntax is easy

	*/

	
	
	
	

	}

}
