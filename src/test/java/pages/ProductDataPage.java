package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ProductDataPage {
	By startDateId = By.id("startdate");
	By insuranceSumId = By.id("insurancesum");
	By meritRatingId = By.id("meritrating");
	By damageInsuranceId = By.id("damageinsurance");
	By courtesyCarId = By.id("courtesycar");
	
	public void insert(String text, By locator, WebDriver driver) {
		WebElement element = driver.findElement(locator);
		element.sendKeys(text);
	}
	
	public void select(String option, By locator, WebDriver driver) {
		WebElement element = driver.findElement(locator);
		Select select =	new	Select(element);
		select.selectByVisibleText(option);
	}
	
	public void insertStartDate(String startDate, WebDriver driver) {
		insert(startDate, startDateId, driver);
	}
	
	public void selectInsuranceSum(String insuranceSum, WebDriver driver) {
		select(insuranceSum, insuranceSumId, driver);
	}
	
	public void selectMeritRating(String meritRating, WebDriver driver) {
		select(meritRating, meritRatingId, driver);
	}
	
	public void selectDamageInsurance(String damageInsurance, WebDriver driver) {
		select(damageInsurance, damageInsuranceId, driver);
	}
	
	public void checkOptionalProducts(String optionalProducts, WebDriver driver) {
		if(optionalProducts.equals("Euro Protection")) {
			driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]")).click();
		}
		
		if(optionalProducts.equals("Legal Defense Insurancen")) {
			driver.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[2]")).click();
		}
	}
	
	public void selectCourtesyCar(String courtesyCar, WebDriver driver) {
		select(courtesyCar, courtesyCarId, driver);
	}
}
