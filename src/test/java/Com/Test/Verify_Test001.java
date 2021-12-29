package Com.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com.PageObject.HomePagePom;
import Com.Uitlity.BaseClass;
import Com.Uitlity.Library;

public class Verify_Test001 extends BaseClass{
	@Test
	public void Verify_mvn_tc001() {
		HomePagePom homepage=PageFactory.initElements(driver, HomePagePom.class);
		Library.Custom_sendkeys(homepage.gettxt_SearchBar(),excel.getStringData("Sheet1", 2, 0), "SearchBox");
		Library.Custom_Click(homepage.getbtn_Search(), "Search Button");
		System.out.println(excel.getStringData("Sheet1", 1, 0)); // govin
	}

}
