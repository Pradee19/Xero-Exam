package com.training.JAN;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class TC2 {
	
	

	public static void main(String[] args) throws InterruptedException {
		ExtentReports report = new ExtentReports(System.getProperty("user.dir") + "/test-output/Report.html", true);
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe" );
		WebDriver driver;
		driver = new ChromeDriver();
		

		WebDriverWait wait = new WebDriverWait(driver, 30);
		driver.get("https://www.xero.com/us/");
		System.out.println("Application launched successfully");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		

		Thread.sleep(5000);
		ExtentTest logger = report.startTest("Launch Application");
		logger.log(LogStatus.PASS, "Application started");
		
		WebElement FreetrailTab= driver.findElement(By.xpath("//a[@class='btn btn-primary global-ceiling-bar-btn']"));
		FreetrailTab.click();
		System.out.println("FreetrailTab is clicked Successfully");
		logger.log(LogStatus.PASS, "Application started");
		

		//Enter the Signup to xdc
		

		WebElement Firstname = driver.findElement(By.xpath("//input[@name='FirstName']"));
		Firstname.clear();
		Firstname.sendKeys("aaa");
		

		WebElement Lastname = driver.findElement(By.xpath("//input[@name='LastName']"));
		Lastname.clear();
		Lastname.sendKeys("bbb");
		

		WebElement EmailAddress = driver.findElement(By.xpath("//input[@name='EmailAddress']"));
		EmailAddress.clear();
	     EmailAddress.sendKeys("abc@gmail.com");
	     
	      WebElement Phonenumber = driver.findElement(By.xpath("//input[@name='PhoneNumber']"));
			Phonenumber.clear();
			Phonenumber.sendKeys("123321");
			
			Select Country = new Select(driver.findElement(By.xpath("//select[@name='LocationCode']")));
			Country.selectByVisibleText("Turkey");
			
			WebElement selectcheckbox = driver.findElement(By.xpath("//input[@value='true']"));
			selectcheckbox.click();
			System.out.println("checkbox is clicked Successfully");
			logger.log(LogStatus.PASS, "checkbox is clicked Successfully");
			
			WebElement Getstarted = driver.findElement(By.xpath("//span[@class='g-recaptcha-submit']"));
			Getstarted.click();
			System.out.println("Getstarted is clicked");
			logger.log(LogStatus.PASS, "Getstarted is clicked");
			Thread.sleep(5000);

			

			

		

	}

}
