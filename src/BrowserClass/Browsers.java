package BrowserClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browsers {

	public static void browser(String Browser) {
		if(Browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\selenium\\drivers\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
		}
		if(Browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\selenium\\drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		}
	}
	
	
}
