package Com.Uitlity;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import net.bytebuddy.utility.RandomString;

public class ExtentReportGenrator {

	 public static ExtentReports extent;
	public static ExtentReports extentReport() {
		String d=RandomString.make(3);
		String report="C:\\Users\\Dell\\eclipse-workspace\\TDD_BatchSEP\\Reports\\"+d+"index.html";
		
		ExtentSparkReporter reporter=new ExtentSparkReporter(report);
		reporter.config().setDocumentTitle("Test Report");
		reporter.config().setReportName("Automation Test Report");
		reporter.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		
		extent.setSystemInfo("Browser", "Chrome");
		extent.setSystemInfo("QA", "govin");
		extent.setSystemInfo("Enviornment", "Stage");
		return extent;
				
	}
}
