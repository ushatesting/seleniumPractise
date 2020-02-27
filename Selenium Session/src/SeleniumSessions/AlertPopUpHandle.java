package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","C://Users//Prisha Bhatia//Downloads//chromedriver_win32/chromedriver.exe");
		WebDriver driver =new ChromeDriver(); // launching chrome
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi"); // entering URL
		
		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(5000); // will wait for 5 sec
	
		
	
		Alert alert= driver.switchTo().alert();
		//driver.switchTo().alert() -- above alert method will give one alert class object , so will store the same in alert class object reference and the "Alert class is available in slenium
		//so we need to import the same
		
		//now using the alert object refernce  	
		System.out.println(alert.getText()); // Alert.getText() will give the text on Alert
		
		// if we need to validate the message on Alert, then we can do below,
		String text = alert.getText();
		if(text.equals("Please enter a valid user name"))
		{
			System.out.println("correct message");
		}
		
		else
		{
			System.out.println("incorrect message");
		}
		
		
		alert.accept(); //will click on ok button
		//alert.dismiss();//will click cancel button
		
		driver.quit();
		

	}

}
