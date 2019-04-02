package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_xero {
	private static WebElement element = null;
	

	public static WebElement textbox_search(WebDriver driver) {
		 element = driver.findElement(By.xpath("//input[@id='email']"));
		return element;
	}
	public static WebElement button_search(WebDriver driver) {
		 element = driver.findElement(By.xpath("//button[@id='submitButton'])"));
		return element;
	}
	

}
