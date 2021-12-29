package Com.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePagePom {
	// WebElement ---> Stored 
	WebDriver driver;
	
	@FindBy(how=How.XPATH,using="//input[@id='query']")
	private WebElement txt_SearchBar;
	@FindBy(how=How.XPATH,using="//input[@value='Search']")
	private WebElement btn_Search;
	
	public HomePagePom(WebDriver driver) {
		this.driver=driver;
	}
 public WebElement gettxt_SearchBar() {
	 return txt_SearchBar;
 }
 public WebElement getbtn_Search() {
	 return btn_Search;
 }
}
