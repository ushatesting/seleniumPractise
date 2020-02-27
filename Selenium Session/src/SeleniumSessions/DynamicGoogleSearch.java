package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicGoogleSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C://Users//Prisha Bhatia//Downloads//chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.google.co.in");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Java");
		
		List<WebElement> list =driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']"));
        System.out.println("total number of suggestions in search box:::-->" + list.size());
        
        for (int i=0;i<list.size();i++)
        {
        	System.out.println(list.get(i).getText());
        	if (list.get(i).getText().contains("java Tutorial"))
        	{
        		list.get(i).click();
        		break;
        	}
        }
        
	}

}
