package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicityWaitConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.Chrome.driver", "C://Users//Prisha Bhatia//Downloads//chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
	
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); //this is for page load--dynamic if page os loaded complity 
		//within 5 sec then remaining 35 sec will be ignored)
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);//this is for all teh elements of the page--dynamic if all the elements are loaded 
		//withing 10sec then remaining 35 sec will be ignored)
		
		
		//Static Wait
		//thread.sleep(20)--hard wait system has to wait for 20 sec eve if the page is laoded withing 1 sec, then wastage of time.
		//should be avaoided
	

	}

}
