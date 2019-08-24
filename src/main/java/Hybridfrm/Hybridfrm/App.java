package Hybridfrm.Hybridfrm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */
public class App 
{
	WebDriver driver;
	String Url;
    @Test
    public void Start()
    {
    	Url=System.getProperty("Url");
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Hybridfrm\\Resource\\chromedriver.exe");
    	driver=new ChromeDriver();
    			if(Url.equalsIgnoreCase("Google")) {
    				driver.get("https://www.google.co.in");
    			}else if(Url.equalsIgnoreCase("Facebook")) {
    				driver.get("https://www.facebook.com");
    			}
    }
    
    
    
}
