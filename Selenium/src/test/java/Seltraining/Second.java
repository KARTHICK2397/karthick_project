package Seltraining;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Second {
	
	static void waitcheck(WebDriver driver,WebElement e){
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(e));
		
		System.out.println("1");
		
	}
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement w=driver.findElement(By.xpath("//input[@title=\"Search for Products, Brands and More\" and @value=\"gold\"]"));
			waitcheck(driver,w);
			
			System.out.println("2");
			driver.findElement(By.xpath("//button[@title=\"Search for Products, Brands and More\"]")).click();
			System.out.println("3");
			driver.close();
		
		
}
}