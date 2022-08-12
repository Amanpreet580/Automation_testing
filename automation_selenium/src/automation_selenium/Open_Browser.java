package automation_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Open_Browser {
	
	public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amanpreet\\OneDrive\\Desktop\\Selenium\\Browser Drivers\\chromedriver.exe");
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://automationpractice.com/index.php");
		Thread.sleep(3000);
		driver.quit();
		
		//ctrlshiftO - Chrome
		//amazon.com - Chrome
		//rediff.com - Firefox
		//openwealthermap.org - Firefox

	}

}
