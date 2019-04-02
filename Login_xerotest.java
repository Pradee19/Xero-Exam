package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.Login_xero;

public class Login_xerotest {
	private static WebDriver driver = null;
	public static void main(String[] args) {
		Login_xerotest();
	}
	
	
	public static void Login_xerotest() {
		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");		
		 driver = new ChromeDriver();
		driver.get("https://www.xero.com/us");
		//entering the text in text box
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("prathibag@hotmail.com");
		Login_xero.textbox_search(driver).sendKeys("prathibag@hotmail.com");
		//entering the text in password 
		//driver.findElement(By.xpath("//input[@id='password'])")).sendKeys("Welcome1017");	
		Login_xero.textbox_search(driver).sendKeys("Welcome1017");
		//click on login button
		//driver.findElement(By.xpath("//button[@id='submitButton'])")).click();
		Login_xero.button_search(driver).click();
		driver.close();
		System.out.println("test completed successfully");
				

	
	}

}
