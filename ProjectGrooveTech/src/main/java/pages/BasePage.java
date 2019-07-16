package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
	protected WebDriver driver;

	public BasePage (WebDriver driver){
		this.driver = driver;
	}
	
	public String captureText() {
	WebElement mensagem = driver.findElement(By.xpath("//*[@class='info-account']"));
	String m = mensagem.getText();
	return m;
}

}
