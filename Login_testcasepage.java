package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.Login_xeroobject;

public class Login_testcasepage {
	private static WebDriver driver = null;

	public static void main(String[] args) {
		Login_testcasepage();
		
		
	}
	public static void Login_testcasepage() {
		String projectpath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");		
		  driver = new ChromeDriver();
		  Login_xeroobject searchpageobj = new Login_xeroobject(driver);
		  driver.get("https://www.xero.com/us");
		  searchpageobj.setTextInsearchBox("ABCD");
		  searchpageobj.setTextInsearchBox("BCDE");
		  searchpageobj.clickSearchButton();
		  driver.close();
	}
	}


