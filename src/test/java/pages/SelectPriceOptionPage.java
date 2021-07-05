package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectPriceOptionPage {
	By silverId = By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[1]");
	By goldId = By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[2]");
	By platinumId = By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[3]");
	By ultimateId = By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[4]");
	
	public void selectPriceOption(String priceOption, WebDriver driver) {
		if(priceOption.equals("Silver")) {
			driver.findElement(silverId).click();
		}
		
		if(priceOption.equals("Gold")) {
			driver.findElement(goldId).click();
		}
		
		if(priceOption.equals("Platinum")) {
			driver.findElement(platinumId).click();
		}
		
		if(priceOption.equals("Ultimate")) {
			driver.findElement(ultimateId).click();
		}
	}
}
