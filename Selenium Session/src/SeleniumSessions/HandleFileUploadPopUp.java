package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C://Users//Prisha Bhatia//Downloads//chromedriver_win32/chromedriver.exe");
		WebDriver driver =new ChromeDriver(); // launching chrome
		driver.get("https://html.com/input-type-file/"); // entering URL
		
		driver.findElement(By.id("fileupload")).sendKeys("C:\\Users\\Prisha Bhatia\\Desktop\\SOA Project\\etent.html");
		// we have to give oath of the file in sendkeys
		//dont click on the browse /upload/attach button, just find out the location property and give the filr path in send keys

	}

}
