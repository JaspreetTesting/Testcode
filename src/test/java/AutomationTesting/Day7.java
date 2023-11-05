package AutomationTesting;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
public class Day7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("irctc" +Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.quit();
	}

}
