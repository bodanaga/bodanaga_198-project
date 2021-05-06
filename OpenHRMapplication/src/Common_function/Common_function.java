package Common_function;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Common_function
{
	public static WebDriver driver;
	public static Properties properties=null;
	public Properties  loadpropertiesFiles() throws Exception 
	{
		FileInputStream file=new FileInputStream("driver");
		Properties properties=new Properties();
		properties.load(file);
		
		return properties;
	}
	
	@BeforeSuite
	public void launch_browser() 
	{
		String Browser=properties.getProperty("browser");
		String url=properties.getProperty("url");
		String driverlocatin=properties.getProperty("driver loaction");
		
		
		//if(browser)
		
	}

	@AfterSuite
	public void teardown() 
	{
		
	}
}
