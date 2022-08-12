package automation_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class OpenWeatherXPath {

	
	public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://openweathermap.org/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//div[@id = 'support-dropdown']")).click();
		driver.findElement(By.xpath("//div[@id = 'support-dropdown']")).click();
		driver.findElement(By.xpath("//div[@id = 'desktop-menu']/descendant::ul[1]/child::li[11]/child::a[1]")).click();
		driver.findElement(By.xpath("//div[@class = 'wrapper']/child::div[3]/child::div[2]/child::div/child::div/child::form[1]/child::div[1]/child::input")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[contains(@id, 'user_password')]")).sendKeys("Abc1234");
		driver.findElement(By.xpath("//div[contains(@class, 'wrapper')]/descendant::input[7]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[contains(@id, 'desktop-menu')]/descendant::ul[1]/child::li[5]/child::a")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//nav[contains(@id, 'nav-website')]/descendant::img[1]")).click();
		Thread.sleep(3000);
		
		driver.quit();
		

	}

}
