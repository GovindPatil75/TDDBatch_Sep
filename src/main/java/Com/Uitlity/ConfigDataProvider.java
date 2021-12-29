package Com.Uitlity;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigDataProvider {
          private Properties pro;
	public ConfigDataProvider() throws IOException {
		String filepath="C:\\Users\\Dell\\eclipse-workspace\\TDD_BatchSEP\\Config\\Config.Properties";
		
		File src=new File(filepath);
		FileInputStream file=new FileInputStream(src);
		pro=new Properties();
		pro.load(file);
	}
	public String getBrowser() {
		return pro.getProperty("Browser");
	}
	public String getusername() {
		return pro.getProperty("username");
	}
   public String getpassword() {
	   return pro.getProperty("password");
   }
  public String getURL() {
	  return pro.getProperty("URL_Stage");
  }
}
