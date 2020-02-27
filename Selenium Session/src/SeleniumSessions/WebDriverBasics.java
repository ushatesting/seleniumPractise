package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. FF Browser
		//gecko driver-- to launch FF, we need to use geckodriver
		//gecko driver is a class in selenium
		//to use gecko driver we need to create object for the gecodriver, but bfore that we need to download one exe file from net--this needs to be done bcos to lunch gecko driver we 
		//have another class firefox driver class-- this is also one of the class in selenium
		//we just need to cretae object for FF driver class--this is available in selenium so we need to import the same
	
 //System.setProperty("webdriver.gecko.driver"	, "C://Users//Prisha Bhatia//Downloads//geckodriver-v0.25.0-win64/geckodriver.exe");
 //WebDriver driver =new FirefoxDriver(); //launch ff browser before that we have to use above set property
		//this FF driver is implementing one interface which is webdriver (IICIC bank interface implementing US bank) in test bak we craeted  dynamic polyomprphism
		//where object of the particular class who is  refered by parent elemnet which is web driver
		 //parents and child relationship already created so no need to worry about that.
		// Webdriver is an interface in the above synatx
	    // We need not to create Webdriver interface manually, already in selenium
		// if you run this prog, firefox should be launched but we need to run this after the property is set for gecko driver
	
 //driver.get("http://www.google.com");//enter URL
		
	//1. Chrome Browser
		
		System.setProperty("webdriver.chrome.driver","C://Users//Prisha Bhatia//Downloads//chromedriver_win32/chromedriver.exe");
		WebDriver driver =new ChromeDriver(); // launching chrome
		driver.get("http://www.google.com"); // entering URL
		
		String Title= driver.getTitle();//getting the title
		System.out.println(Title);
		
		
		//validation point
		if(Title.equals("Google"))
		{
			System.out.println("correct title");
		}
		
		else
		{
			System.out.println("Incorrect title");
		}
		
		
		System.out.println(driver.getCurrentUrl());//method to get the currentURL of the browser (once the google is open "google.com is converted to bigger URL")
		//System.out.println(driver.getPageSource()); //method to get the page source
		driver.quit(); //close the browser 
		
	}

}
	