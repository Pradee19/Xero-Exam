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

	
	public class XeroHOME {
		static ExtentReports report;
		static ExtentTest logger = null;
		

		public static void main(String[] args) throws InterruptedException{
			

			report = new ExtentReports(System.getProperty("user.dir") + "/test-output/Report.html", true);
			System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe" );
			WebDriver driver;
			driver = new ChromeDriver();
			

			WebDriverWait wait = new WebDriverWait(driver, 30);
			driver.get("https://www.xero.com/us/");
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
			

			WebElement username = driver.findElement(By.id("email"));
	        username.sendKeys("prathibag@hotmail.com");
			System.out.println("Emailaddress is entered");
			logger.log(LogStatus.PASS, "Emailaddress is entered");
			

			WebElement password = driver.findElement(By.id("password"));
			password.clear();
			password.sendKeys("Welcome1017");
			System.out.println("Password is entered");
			logger.log(LogStatus.PASS, "Password is entered successfully");
			

			WebElement loginButton = driver.findElement(By.xpath("//button[@id='submitButton']"));
			loginButton.click();
			System.out.println("Login button is clicked Successfully");
			logger.log(LogStatus.PASS, "Login button is clicked Successfully");
			Thread.sleep(5000);
			
			
			
			
			
			
			
		
	}

}
