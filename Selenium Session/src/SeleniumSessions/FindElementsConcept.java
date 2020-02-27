package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C://Users//Prisha Bhatia//Downloads//chromedriver_win32/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.ebay.com/");
		
	List <WebElement>linklist= driver.findElements(By.tagName("a"));
	//if we are asked for no of links , we use html tag as "a"
	//if we are asked for no of inputs, we use html tag as "input"
	//if we are aslked for npo of buttons we use html tag as "buttons"
	
	//size of linklist
	System.out.println(linklist.size());
	
	//to print the values of linklist
	for (int i=0;i< (linklist.size());i++)
	{
		System.out.println(linklist.get(i).getText());
	}
	
	
	//get(i)--will point to the "0th" index and getText after that will give the value at 0th index
	driver.quit();
	
	}

}
