package com.training.JAN;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chromedriver.ChromeDriver;

public class TCASES Extends reusablemethods {

	/* 
	 * Name of the Method: enterText
	 * Brief Description: Enters text to text field
	 * Arguments: obj --> Web object, textVal --> Text value to be entered in text box, objName --> Nam eof the object
	 * Created By: Automation team
	 * Creation Date: jan 22 2019
	 * Last Modified: jan  22 2019
	 */
	public static void enterText(WebElement obj, String textVal, String objName) {

		if(obj.isDisplayed()) {
			obj.sendKeys(textVal);
			logger.log(Status.PASS, MarkupHelper.createLabel(objName + " is entered in "+ objName +" field", ExtentColor.GREEN));
//			System.out.println("Pass: " + textVal + " is entered in "+ objName +" field");
		}else {
			logger.log(Status.FAIL,MarkupHelper.createLabel(objName +" field does not exist, please check your application", ExtentColor.RED));
	//		System.out.println("Fail: "+ objName +" field does not exist, please check your application" );
		}

	}

	/* 
	 * Name of the Method: clickObj
	 * Brief Description: click on the object
	 * Arguments: obj --> Web object, objName--> Name of the object 
	 * Created By: Automation team
	 * Creation Date: jan 22 2019
	 * Last Modified: jan 22 2019
	 */

	public static void clickObj(WebElement obj, String objName) {
		if(obj.isDisplayed()) {
			obj.click();
			logger.log(Status.PASS, MarkupHelper.createLabel(objName +" is clicked", ExtentColor.GREEN));
			//System.out.println("Pass: "+ objName +" is clicked");
		}else {
			logger.log(Status.FAIL,MarkupHelper.createLabel(objName +" field does not exist, please check your application", ExtentColor.RED));
			//System.out.println("Fail: "+ objName +" Object does not exist, please check the application");
		}

	}
	}

}
