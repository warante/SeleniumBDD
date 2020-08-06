package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DriverFactory {

	
	public static WebDriver setDriver(String browser, Boolean options) {
		WebDriver driver = null;
		if(browser.equalsIgnoreCase("chrome"))	{
			System.out.println("##################### Using Chrome #####################");
			System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");		
			
			if(options) {
				ChromeOptions chromeOptions = new ChromeOptions();
		        chromeOptions.addArguments("--headless");
		        chromeOptions.addArguments("--no-sandbox");		
		        chromeOptions.addArguments("--disable-popup-blocking");
				driver = new ChromeDriver(chromeOptions);
			}
			else {
				driver = new ChromeDriver();
			}
		
		}		
		else {
			System.out.println("##################### Using FireFox #####################");
			System.setProperty("webdriver.gecko.driver", "/usr/bin/geckodriver");	
			
			if(options) {
				FirefoxOptions firefoxOptions = new FirefoxOptions();
				firefoxOptions.addArguments("--headless");
				firefoxOptions.addArguments("--no-sandbox");		
				driver = new FirefoxDriver(firefoxOptions);
			}
			else {
				driver = new FirefoxDriver();					
			}	
		}
		
		return driver;
	}
}
