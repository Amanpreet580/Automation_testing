package jul24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenWeatherMap {

	public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://openweathermap.org/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("div#desktop-menu>form +ul>li:nth-of-type(11)>a")).click();
		driver.findElement(By.cssSelector("form.simple_form.new_user>div.input-group>input#user_email")).sendKeys("abc@gmail.com");
		driver.findElement(By.cssSelector("form.simple_form.new_user>div.input-group>input#user_password")).sendKeys("1234");
		driver.findElement(By.cssSelector("div.form-group.boolean.optional.user_remember_me + input")).click();
		driver.findElement(By.cssSelector("li.logo>a>img")).click();
		Thread.sleep(3000);
		
		driver.quit();
		

	}

}
