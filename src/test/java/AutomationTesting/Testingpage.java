package AutomationTesting;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testingpage {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a)[2]")).click();
		Thread.sleep(1000);
		}

}
