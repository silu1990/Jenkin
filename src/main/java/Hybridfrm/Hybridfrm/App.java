package Hybridfrm.Hybridfrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */
public class App 
{
	WebDriver driver;
	String Url;
	String Browser;
	
    @Test
    public void Start()
    {
    	Url=System.getProperty("Url");
    	System.out.println(Url);
    	Browser=System.getProperty("Browser");
    	System.out.println(Browser);
    	if(Browser.equalsIgnoreCase("Chrome")) {
    		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Hybridfrm\\Resource\\chromedriver.exe");
        	driver=new ChromeDriver();
    	}else if(Browser.equalsIgnoreCase("IE")) {
    		DesiredCapabilities caps = DesiredCapabilities.internetExplorer();
    		caps.setCapability("ignoreZoomSetting", true);
    		System.setProperty("webdriver.ie.driver", "C:\\Users\\admin\\eclipse-workspace\\Hybridfrm\\Resource\\IEDriverServer.exe");
        	driver=new InternetExplorerDriver(caps);
    	}else if(Browser.equalsIgnoreCase("Firefox")) {
    		System.setProperty("webdriver.gecko.driver", "C:\\Users\\admin\\eclipse-workspace\\Hybridfrm\\Resource\\geckodriver.exe");
        	driver=new FirefoxDriver();
    	}

    	if(Url.equalsIgnoreCase("Google")) {
			driver.get("https://www.google.co.in");
			System.out.println("https://www.google.co.in");
		}else if(Url.equalsIgnoreCase("Facebook")) {
			driver.get("https://www.facebook.com");
			System.out.println("https://www.facebook.com");
		}

    }
    
    
    
}
