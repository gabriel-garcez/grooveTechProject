package pages;

import java.util.Calendar;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreateAccountPage extends BasePage  {

	public CreateAccountPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public CreateAccountPage selectGender(){
		List<WebElement> options = driver.findElements(By.xpath("//*[starts-with(@id, 'id_gender')]")) ;
	    Random random = new Random();
	    int index = random.nextInt(options.size());
	    options.get(index).click(); 
	    return this;
	}
	
	public CreateAccountPage typeCustomerFirstName(String first_name){
		driver.findElement(By.id("customer_firstname")).sendKeys(first_name);
	    return this;
	}
	
	public CreateAccountPage typeCustomerLastName(String last_name){
		driver.findElement(By.id("customer_lastname")).sendKeys(last_name);
	    return this;
	}
	
	public CreateAccountPage typeCustomerPassword(String password){
		driver.findElement(By.id("passwd")).sendKeys(password);
	    return this;
	}
	
	public CreateAccountPage selectDateBirth(){
		
		Select comboBoxDay = new Select(driver.findElement(By.id("days")));
		List<WebElement> optionsDay = comboBoxDay.getOptions();
		int sizeDay = optionsDay.size();		
		Random randDay = new Random();
		int listDay = randDay.nextInt(sizeDay)+1;
		String listDayString = Integer.toString(listDay);
		comboBoxDay.selectByValue(listDayString);
		
		Select comboBoxMonth = new Select(driver.findElement(By.id("months")));
		List<WebElement> optionsMonth = comboBoxMonth.getOptions();
		int sizeMonth = optionsMonth.size();		
		Random randMonth = new Random();
		int listMonth = randMonth.nextInt(sizeMonth)+1;
		String listMonthString = Integer.toString(listMonth);
		comboBoxMonth.selectByValue(listMonthString);
		
		Select comboBoxYear = new Select(driver.findElement(By.id("years")));
		Calendar cal = Calendar.getInstance();
		int currentYear = cal.get(Calendar.YEAR);
		int randomYear = ThreadLocalRandom.current().nextInt(1900, currentYear);
		String listYearString = Integer.toString(randomYear);
		comboBoxYear.selectByValue(listYearString);
		
		return this;
	}
	
	public CreateAccountPage selectCheckbox(){
		Random random = new Random();
	    int newsletter = random.nextInt(2);
	    System.out.println(newsletter);
	    
	    if (newsletter == 0) {
	      driver.findElement(By.id("uniform-newsletter")).click();
	    }
	    
		Random random2 = new Random();
	    int offers = random2.nextInt(1);
	    System.out.println(offers);
	    
	    if (offers == 0) {
	      driver.findElement(By.id("uniform-optin")).click();
	    }           
	    
	   return this;
	}
	
	public CreateAccountPage typeCompany(String company){
		driver.findElement(By.id("company")).sendKeys(company);
	    return this;
	}
	
	public CreateAccountPage typeAddress(String address){
		driver.findElement(By.id("address1")).sendKeys(address);
	    return this;
	}
	
	public CreateAccountPage typeAddress2(String address2){
		driver.findElement(By.id("address2")).sendKeys(address2);
	    return this;
	}
	
	public CreateAccountPage typeCity(String city){
		driver.findElement(By.id("city")).sendKeys(city);
	    return this;
	}
	
	public CreateAccountPage SelectState(){
		
		Select comboBoxState = new Select(driver.findElement(By.id("id_state")));
		List<WebElement> optionsState = comboBoxState.getOptions();
		int sizeState = optionsState.size();		
		Random randState = new Random();
		int listState = randState.nextInt(sizeState)+1;
		String listStateString = Integer.toString(listState);
		comboBoxState.selectByValue(listStateString);
		
		return this;
	}
	
	
	public CreateAccountPage typePostCode(){
		int randomYear = ThreadLocalRandom.current().nextInt(10000, 99999);
		String listMonthString = Integer.toString(randomYear);		
		driver.findElement(By.id("postcode")).sendKeys(listMonthString);
	    return this;
	}
	
	
	public CreateAccountPage typeAdditionalInformation(String other){
		driver.findElement(By.id("other")).sendKeys(other);
	    return this;
	}
	
	public CreateAccountPage typePhone(String phone){
		driver.findElement(By.id("phone")).sendKeys(phone);
	    return this;
	}
	
	public CreateAccountPage typePhoneMobile(String phone_mobile){
		driver.findElement(By.id("phone_mobile")).sendKeys(phone_mobile);
	    return this;
	}
	
	public CreateAccountPage typeReferenceAddress(String reference_address){
		driver.findElement(By.id("alias")).sendKeys(reference_address);
	    return this;
	}
	
	public CreateAccountPage clickSubmit(){
		driver.findElement(By.id("submitAccount")).click();
	    return this;
	}
		
}
