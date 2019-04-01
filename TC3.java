package com.training.JAN;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TC3 {

	static ExtentReports report;
	static ExtentTest logger = null;
	

	public static void main(String[] args) throws InterruptedException{
		

		report = new ExtentReports(System.getProperty("user.dir") + "/test-output/Report.html", true);
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		

		WebDriverWait wait = new WebDriverWait(driver, 30);
		driver.get("https://www.xero.com");
		System.out.println("Application launched successfully");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		

		Thread.sleep(5000);
		logger = report.startTest("Launch Application");
		logger.log(LogStatus.PASS, "Application started");
		WebElement Login= driver.findElement(By.xpath("//a[@class='btn btn-tertiary-alt global-ceiling-bar-btn']"));
        Login.click();
		System.out.println("login is clicked");
		logger.log(LogStatus.PASS, "Login is clicked");
		

		WebElement username= driver.findElement(By.id("email"));
        username.sendKeys("prathibag@hotmail.com");
		System.out.println("Emailaddress is entered");
		logger.log(LogStatus.PASS, "Emailaddress is entered");
		

		WebElement password = driver.findElement(By.id("password"));
		password.clear();
		password.sendKeys("Welcome1017");
		System.out.println("password entered successfully");
		logger.log(LogStatus.PASS, "Invalid Password is entered message displayed");
		

		WebElement loginButton = driver.findElement(By.xpath("//button[@id='submitButton']"));
		loginButton.click();
		System.out.println("Login button is clicked Successfully");
		logger.log(LogStatus.PASS, "Login button is clicked Successfully");
		Thread.sleep(5000);
		  WebElement DashboardTab = driver.findElement(By.xpath("//a[@class='xrh-focusable xrh-tab--body xrh-tab--body-is-selected']"));
		  DashboardTab.click();
		  System.out.println("Dashboard is clicked Successfully");
		 
		  
		  WebElement Accounting = driver.findElement(By.xpath("//button[contains(text(),'Accounting')]"));
		  Accounting.click();	
		 
		
		 WebElement Contacts = driver.findElement(By.xpath("//button[contains(text(),'Contacts')]"));
		Contacts.click();	
		 
				
			 Select Reports= new Select(driver.findElement(By.xpath("//a[contains(text(),'Reports')]")));
			  Reports.selectByIndex(2);
			 
			  Select Files= new Select(driver.findElement(By.xpath("/a[contains(text(),'Files')]")));
			  Files.selectByIndex(2);
			  
		     Select newtab = new Select(driver.findElement(By.xpath("//button[@title='Create new']//div[@class='xrh-focusable--child xrh-iconwrapper']")));
			  newtab.selectByIndex(2);
			  
			  Select notifications= new Select(driver.findElement(By.xpath("//button[@title='Notifications']//*[@class='xrh-icon xrh-icon-svg']")));
			notifications.selectByIndex(2);
			
			WebElement search= driver.findElement(By.xpath("//button[@title='Search']//*[@class='xrh-icon xrh-icon-svg']"));
			password.clear();
			
			System.out.println("search tab entered successfully");
			
			  
			  


		





	}
}


