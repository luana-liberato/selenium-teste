package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
	public WebDriver driver;
	
	public WebDriver startDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\MR\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        
        return this.driver;
	}
	
}