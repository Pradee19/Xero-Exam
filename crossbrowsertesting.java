package test;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class crossbrowsertesting {
	 static WebDriver driver;
	 
	 @Before
	
	 public void setup(String browser) throws Exception{
		
		if(browser.equalsIgnoreCase("Firefox")){
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\prathibag\\imp\\Downloads\\geckodriver-v0.24.0-win32.zip");
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("Chrome")){
			System.out.println("chrome entered");
			System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");		
			driver=new ChromeDriver();
			
		}
		else
		throw new Exception("browser not correct");
	 }
		@Test
		public void testxero()
		{
			driver.get("https://www.xero.com");
		}
		
		
	}


