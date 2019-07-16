package support;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;

public class Screenshot {

	public static void take(WebDriver navegador, String arquivo){
		File screenshot = ((TakesScreenshot)navegador).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshot, new File(arquivo));
		} catch (IOException e) {
			System.out.println("Houveram problemas ao tirar o print" + e.getMessage());
		}
		}
}
	
	
