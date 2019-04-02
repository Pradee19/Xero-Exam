package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Login_xeroobject {
	WebDriver driver = null;
	By textbox_search = By.id("email");
	By password_search = By.id("password");
	By button_search = By.id("//button[@id='submitButton']");
	
	public Login_xeroobject(WebDriver driver) {
		this.driver = driver;
	}
		
	
	
public void setTextInsearchBox(String text) {
	driver.findElement(textbox_search).sendKeys(text);
	
}
public void setTextInsearchBox1(String text) {
	driver.findElement(password_search).sendKeys(text);
	}

public void clickSearchButton() {
	driver.findElement(button_search).sendKeys(Keys.RETURN);
}
}
