package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AuthenticationPage extends BasePage {

	public AuthenticationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public AuthenticationPage typeEmail(String email){
		driver.findElement(By.id("email_create")).sendKeys(email);
	    return this;
	}
	
	public AuthenticationPage clickButton(){
		driver.findElement(By.id("SubmitCreate")).click();
		return this;
	}
	
	
	
}
