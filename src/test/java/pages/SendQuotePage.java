package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SendQuotePage {
	By emailId = By.id("email");
	By phoneId = By.id("phone");
	By usernameId = By.id("username");
	By passwordId = By.id("password");
	By passwordConfirmId = By.id("confirmpassword");
	By commentsId = By.id("Comments");
	
	public void insert(String text, By locator, WebDriver driver) {
		WebElement element = driver.findElement(locator);
		element.sendKeys(text);
	}
	
	public void insertEmail(String email, WebDriver driver) {
		insert(email, emailId, driver);
	}
	
	public void insertPhone(String phone, WebDriver driver) {
		insert(phone, phoneId, driver);
	}
	
	public void insertUsername(String username, WebDriver driver) {
		insert(username, usernameId, driver);
	}
	
	public void insertPassword(String password, WebDriver driver) {
		insert(password, passwordId, driver);
	}
	
	public void insertPasswordConfirm(String passwordConfirm, WebDriver driver) {
		insert(passwordConfirm, passwordConfirmId, driver);
	}
	
	public void insertComments(String comments, WebDriver driver) {
		insert(comments, commentsId, driver);
	}
}
