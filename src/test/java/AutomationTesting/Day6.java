package AutomationTesting;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Day6 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("student");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a)[4]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a)[8]")).click();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		driver.quit();
}

}
