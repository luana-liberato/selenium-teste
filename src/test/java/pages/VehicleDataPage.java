package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class VehicleDataPage {
	
	By makeLocator = By.id("make");
	By modelLocator = By.id("model");
	By cylinderCapacityLocator = By.id("cylindercapacity");
	By enginePerformanceLocator = By.id("engineperformance");
	By dateManufactureLocator = By.id("dateofmanufacture");
	By seatsNumberLocator = By.id("numberofseats");
	By rightDriveLocator = By.xpath("//*[@id=\"insurance-form\"]/div/section[1]/div[7]/p/label[1]");
	By noRightDriveLocator = By.xpath("//*[@id=\"insurance-form\"]/div/section[1]/div[7]/p/label[2]");
	By seatsNumberMotorLocator = By.id("numberofseatsmotorcycle");
	By fuelTypeLocator = By.id("fuel");
	By payloadLocator = By.id("payload");
	By weightLocator = By.id("totalweight");
	By listPriceLocator = By.id("listprice");
	By plateNumberLocator = By.id("licenseplatenumber");
	By annualMileageLocator = By.id("annualmileage");
	
	public void insert(String text, By locator, WebDriver driver) {
		WebElement element = driver.findElement(locator);
		element.sendKeys(text);
	}
	
	public void select(String option, By locator, WebDriver driver) {
		WebElement element = driver.findElement(locator);
		Select select =	new	Select(element);
		select.selectByVisibleText(option);
	}
	
	public void selectMake(String make, WebDriver driver) {
		insert(make, makeLocator, driver);
	}
	
	public void selectModel(String model, WebDriver driver) {
		insert(model, modelLocator, driver);
	}
	
	public void insertCylinderCapacity(String capacity, WebDriver driver) {
		insert(capacity, cylinderCapacityLocator, driver);
	}
	
	public void insertPerformance(String performance, WebDriver driver) {
		insert(performance, enginePerformanceLocator, driver);
	}
	
	public void insertDate(String date, WebDriver driver) {
		insert(date, dateManufactureLocator, driver);
	}
	
	public void selectSeatsNumber(String seatsNumber, WebDriver driver) {
		select(seatsNumber, seatsNumberLocator, driver);
	}
	
	public void selectBoxDriver(String drive, WebDriver driver) {
		if(drive.equals("Yes")) {
			driver.findElement(rightDriveLocator).click();
		}
		
		if(drive.equals("No")) {
			driver.findElement(noRightDriveLocator).click();
		}
	}
	
	public void selectSeatsNumberMoto(String seatsNumberMoto, WebDriver driver) {
		select(seatsNumberMoto, seatsNumberMotorLocator, driver);
	}
	
	public void selectFuelType(String fuel, WebDriver driver) {
		select(fuel, fuelTypeLocator, driver);
	}

	public void insertPayload(String payload, WebDriver driver) {
		insert(payload, payloadLocator, driver);
	}
	
	public void insertWeight(String weight, WebDriver driver) {
		insert(weight, weightLocator, driver);
	}
	
	public void insertListPrice(String price, WebDriver driver) {
		insert(price, listPriceLocator, driver);
	}
	
	public void insertPlateNumber(String plateNumber, WebDriver driver) {
		insert(plateNumber, plateNumberLocator, driver);
	}
	
	public void insertAnnualMileage(String annualMileage, WebDriver driver) {
		insert(annualMileage, annualMileageLocator, driver);
	}
	
}
