package steps;

import pages.BasePage;
import pages.InsurantDataPage;
import pages.ProductDataPage;
import pages.VehicleDataPage;
import pages.SelectPriceOptionPage;
import pages.SendQuotePage;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class TesteSolicitacaoSteps {
	
	WebDriver driver;
	String aba;
	
	@Before
	public void setup() {
		driver = new BasePage().startDriver();
	}
	
	@Dado("que o usuário está na tela do formulário")
	public void que_o_usuário_está_na_tela_do_formulário() {
	    driver.get("http://sampleapp.tricentis.com/101/app.php");
	}
	
	@Então("deve ser direcionado a aba {string}")
	public void deve_ser_direcionado_a_aba(String esperado) {
		if(esperado.equals("Enter Vehicle Data")) {
			WebElement tituloAba = driver.findElement(By.id("entervehicledata"));
			aba = tituloAba.getText();
			aba = aba.substring(0, 18);
			Assert.assertEquals("Aba incorreta!", "Enter Vehicle Data", aba);
		}
		
		if(esperado.equals("Enter Insurant Data")) {
			WebElement tituloAba = driver.findElement(By.id("enterinsurantdata"));
			aba = tituloAba.getText();
			aba = aba.substring(0, 19);
			Assert.assertEquals("Aba incorreta!", "Enter Insurant Data", aba);
		}
		
		if(esperado.equals("Enter Product Data")) {
			WebElement tituloAba = driver.findElement(By.id("enterproductdata"));
			aba = tituloAba.getText();
			aba = aba.substring(0, 18);
			Assert.assertEquals("Aba incorreta!", "Enter Product Data", aba);
		}
		
		if(esperado.equals("Select Price Option")) {
			WebElement tituloAba = driver.findElement(By.id("selectpriceoption"));
			aba = tituloAba.getText();
			aba = aba.substring(0, 19);
			Assert.assertEquals("Aba incorreta!", "Select Price Option", aba);
		}
		
		if(esperado.equals("Send Quote")) {
			WebElement tituloAba = driver.findElement(By.id("sendquote"));
			aba = tituloAba.getText();
			aba = aba.substring(0, 10);
			Assert.assertEquals("Aba incorreta!", "Send Quote", aba);
		}
	}
		
	@Quando("preencher a aba Enter Vehicle Data e pressionar next")
	public void o_usuário_preencher_a_aba_enter_vehicle_data_e_pressionar_next() {	
		VehicleDataPage pageOne = new VehicleDataPage();
	
		pageOne.selectMake("Ford", driver);
		pageOne.selectModel("Moped", driver);
		pageOne.insertCylinderCapacity("500", driver);
		pageOne.insertPerformance("1000", driver);
		pageOne.insertDate("12/02/2011", driver);
		pageOne.selectSeatsNumber("4", driver);
		pageOne.selectSeatsNumberMoto("1", driver);
		pageOne.selectBoxDriver("No", driver);
		pageOne.selectFuelType("Diesel", driver);
		pageOne.insertPayload("300", driver);
		pageOne.insertWeight("5000", driver);
		pageOne.insertListPrice("28000", driver);
		pageOne.insertPlateNumber("ABC-0985", driver);
		pageOne.insertAnnualMileage("90000", driver);
		
		driver.findElement(By.id("nextenterinsurantdata")).click();
	}

	@Quando("preencher a aba Enter Insurant Data e pressionar next")
	public void preencher_a_aba_enter_insurant_data_e_pressionar_next() {
		InsurantDataPage pageTwo = new InsurantDataPage();
		
		pageTwo.insertFirstName("Rosa", driver);
		pageTwo.insertLastName("Garrick", driver);
		pageTwo.insertBirth("06/24/1981", driver);
		pageTwo.selectBoxGender("Female", driver);
		pageTwo.insertaddress("67 Willow Street Glen Cove, NY 11542", driver);
		pageTwo.selectCountry("United States", driver);
		pageTwo.insertZipCode("558231", driver);
		pageTwo.insertCity("Glen Cove", driver);
		pageTwo.selectOccupation("Employee", driver);
		pageTwo.checkHobbies("Speeding", driver);
		
		driver.findElement(By.id("nextenterproductdata")).click();
	}

	@Quando("preencher a aba Enter Product Data e pressionar next")
	public void preencher_a_aba_enter_product_data_e_pressionar_next() {
		ProductDataPage pageThree = new ProductDataPage();
		
		pageThree.insertStartDate("08/29/2021", driver);
		pageThree.selectInsuranceSum("7.000.000,00", driver);
		pageThree.selectMeritRating("Bonus 3", driver);
		pageThree.selectDamageInsurance("Partial Coverage", driver);
		pageThree.checkOptionalProducts("Euro Protection", driver);
		pageThree.selectCourtesyCar("No", driver);
		
		driver.findElement(By.id("nextselectpriceoption")).click();
	}

	@Quando("preencher a aba Select Price Option e pressionar next")
	public void preencher_a_aba_select_price_option_e_pressionar_next() {
		SelectPriceOptionPage pageFour = new SelectPriceOptionPage();
		
		pageFour.selectPriceOption("Platinum", driver);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("nextsendquote")).click();
	}

	@Quando("preencher a aba Send Quote e pressionar next")
	public void preencher_a_aba_send_quote_e_pressionar_next() {
		
		SendQuotePage pageFive = new SendQuotePage();
		
		pageFive.insertEmail("rosagarrick@dayrep.com", driver);
		pageFive.insertPhone("8158987593", driver);
		pageFive.insertUsername("rosaagarrick", driver);
		pageFive.insertPassword("Ab1234", driver);
		pageFive.insertPasswordConfirm("Ab1234", driver);
		pageFive.insertComments("No comments", driver);
		
		driver.findElement(By.id("sendemail")).click();
	}

	@Então("o usuário dever ver a mensagem {string}")
	public void o_usuário_dever_ver_a_mensagem(String string) {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement element = driver.findElement(By.tagName("h2"));
		String mensagem = element.getText();
		Assert.assertEquals("Erro na solicitação", string, mensagem);
	}
	
	
	@After
	public void after() {
		driver.quit();
	}
}
