package Com.Uitlity;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.Status;

public class Library {
	// common User defined function
	
public static void Custom_sendkeys(WebElement element,String value,String fieldname) {
		try {
		   element.sendKeys(value);
		   ObjectRepo.test.log(Status.PASS, fieldname+"=Value Succesfully Send ="+value);
		   
		}catch(Exception e) {
			ObjectRepo.test.log(Status.FAIL, fieldname+"=Unable to send Value "+e);
		
		}
	}
public static void Custom_Click(WebElement element,String fieldname) {
		try{
			element.click();
			ObjectRepo.test.log(Status.PASS, "Succesfully clicked...! ="+fieldname);
		}catch(Exception e) {
			ObjectRepo.test.log(Status.FAIL, fieldname +"=Unable to Click "+e);
	}
	}
public static void Custom_handleDropDown(WebElement element,String text) {
	try {
	     Select select=new Select(element);
	     select.selectByVisibleText(text);
	}catch(Exception e) {
		System.out.println("Exception "+e);
	}
		
}
}
