package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class InsurantDataPage {
	By firstNameLocator = By.id("firstname");
	By lastNameLocator = By.id("lastname");
	By birthLocator = By.id("birthdate");
	
	By genderMaleLocator = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]");
	By genderFemaleLocator = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[2]");
	
	By addressLocator = By.id("streetaddress");
	By countryLocator = By.id("country");
	By zipCodeLocator = By.id("zipcode");
	By cityLocator = By.id("city");
	
	By occupationLocator = By.id("occupation");
	
	By speedingLocator = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[1]");
	By bungeeJumpingLocator = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[2]");
	By cliffDivingLocator = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[3]");
	By skydivingLocator = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[4]");
	By otherLocator = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[5]");
	
	By websiteLocator = By.id("website");
	
	public void insert(String text, By locator, WebDriver driver) {
		WebElement element = driver.findElement(locator);
		element.sendKeys(text);
	}
	
	public void select(String option, By locator, WebDriver driver) {
		WebElement element = driver.findElement(locator);
		Select select =	new	Select(element);
		select.selectByVisibleText(option);
	}
	
	public void insertFirstName(String firstName, WebDriver driver) {
		insert(firstName, firstNameLocator, driver);
	}
	
	public void insertLastName(String lastName, WebDriver driver) {
		insert(lastName, lastNameLocator, driver);
	}
	
	public void insertBirth(String birth, WebDriver driver) {
		insert(birth, birthLocator, driver);
	}
	
	public void selectBoxGender(String gender, WebDriver driver) {
		if(gender.equals("Male")) {
			driver.findElement(genderMaleLocator).click();
		}
		
		if(gender.equals("Female")) {
			driver.findElement(genderFemaleLocator).click();
		}
	}
	
	public void insertaddress(String address, WebDriver driver) {
		insert(address, addressLocator, driver);
	}
	
	public void selectCountry(String country, WebDriver driver) {
		select(country, countryLocator, driver);
	}
	
	public void insertZipCode(String zipCode, WebDriver driver) {
		insert(zipCode, zipCodeLocator, driver);
	}
	
	public void insertCity(String city, WebDriver driver) {
		insert(city, cityLocator, driver);
	}
	
	public void selectOccupation(String occupation, WebDriver driver) {
		select(occupation, occupationLocator, driver);
	}
	
	public void checkHobbies(String hobbies, WebDriver driver) {
		if(hobbies.equals("Speeding")) {
			driver.findElement(speedingLocator).click();
		}
		
		if(hobbies.equals("Bungee Jumping")) {
			driver.findElement(bungeeJumpingLocator).click();
		}
		
		if(hobbies.equals("Cliff Diving")) {
			driver.findElement(cliffDivingLocator).click();
		}
		
		if(hobbies.equals("Skydiving")) {
			driver.findElement(skydivingLocator).click();
		}
		
		if(hobbies.equals("Other")) {
			driver.findElement(otherLocator).click();
		}
	}
	
	public void insertWebsite(String website, WebDriver driver) {
		insert(website, websiteLocator, driver);
	}
}