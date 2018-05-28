package Naveen.testboss.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;

import Naveen.testboss.propread.propertyreader;

public class launch {
	public static WebDriver d;
	
	
	@BeforeTest
	public static void browser()
	{
	propertyreader prop =new propertyreader();
	
		String browseris= "";
		String dp= "";
		String url= "";
		url=prop.getValue("URL");
		browseris=prop.getValue("Browser");
		
		if(browseris=="IE")
		{
			dp=prop.getValue("IE_DRIVER_LOCATION");
			System.setProperty("webdriver.ie.driver", dp);
			d = new InternetExplorerDriver();
		}
		else if(browseris=="CHROME")
		{
			dp=prop.getValue("CHROME_DRIVER_LOCATION");
			System.setProperty("webdriver.chrome.driver", dp);
			d = new ChromeDriver();
		}
		else if(browseris=="FIRE")
		{
			d = new FirefoxDriver();
		}
		
		d.get(url);
		d.manage().window().maximize();
		
}
 }
