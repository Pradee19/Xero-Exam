package com.training.JAN;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TC2B {

	
	

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
		System.out.println("Freetrail should be displayed Successfully");
		logger.log(LogStatus.PASS, "Application started");
		
		WebElement Getstartedbtn= driver.findElement(By.xpath("//span[@class='g-recaptcha-submit']"));
		Getstartedbtn.click();
		System.out.println("All fields should  not be  empty shud be displayed ");
		logger.log(LogStatus.PASS, "Application started");
		
		WebElement emailaddress= driver.findElement(By.xpath("//input[@name='EmailAddress']"));
        emailaddress.sendKeys("prathibag!hotmail.com");
		System.out.println("invalid format Emailaddress ");
		logger.log(LogStatus.PASS, " invalid format Emailaddress should be displayed");
		
		WebElement Getstartedbtn1= driver.findElement(By.xpath("//span[@class='g-recaptcha-submit']"));
		Getstartedbtn1.click();
		System.out.println("Terms and policy check box shud display");
		logger.log(LogStatus.PASS, " Terms and policy check box shud display");
		

	}

}
