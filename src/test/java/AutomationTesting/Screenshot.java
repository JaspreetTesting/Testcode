package AutomationTesting;
import java.time.Duration;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;


public class Screenshot {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
WebDriverManager .chromedriver().setup();
WebDriver driver = new ChromeDriver();

driver.get("https://www.nextsoftwaretesting.com");
driver.manage().window().maximize();

File photo= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

try 
{
	FileUtils.copyFile(photo, new File("C:\\seleniumScreenshot\\photo.png"));
}

catch(IOException c)
{ 
	System.out.println(c.getMessage());

}

driver.close();
}

}
