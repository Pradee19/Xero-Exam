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


public class TCD {



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
		WebElement Login= driver.findElement(By.xpath("//a[@class='btn btn-tertiary-alt global-ceiling-bar-btn']"));
        Login.click();
		System.out.println("login is clicked");
		logger.log(LogStatus.PASS, "Login is clicked");
		
		WebElement username= driver.findElement(By.id("email"));
        username.sendKeys("prathibag@hotmail.com");
		System.out.println("Emailaddress is entered successfully");
		logger.log(LogStatus.PASS, " Emailaddress is entered successfully");
		

		WebElement password = driver.findElement(By.id("password"));
		password.clear();
		password.sendKeys("");
		

		WebElement forgotpassword = driver.findElement(By.xpath("//a[@class='forgot-password-advert']"));
		forgotpassword.click();
		System.out.println("A link will be emailed to this address which will let you reset your password.");
		logger.log(LogStatus.PASS, "email link will send thru email ");
		Thread.sleep(5000);


	}

}
