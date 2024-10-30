package Seltraining;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Third {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://pgportal.gov.in/Registration");
		driver.manage().window().maximize();
		String state="Andhra Pradesh";
		String district="Chittoor";
		driver.findElement(By.xpath("//input[@data-val-onlywhitespace=\"Please provide a valid Model_Name\"]")).sendKeys("Pawan kalyan");
		driver.findElement(By.xpath("//input[@placeholder=\"Premise Number or Name\"]")).sendKeys("bapatla");
		driver.findElement(By.xpath("//input[@id=\"Pincode\"]")).sendKeys("6378954");
		driver.findElement(By.xpath("//input[@id=\"Sex_M\"]")).click();
		driver.findElement(By.xpath("//span[text()=\"--Select a state--\"]")).click();
		Thread.sleep(5000);
		String S1="//ul[@class=\"select2-results__options\"]//li[text()=\"";
		
		String S2="\"]";
		
		String w=S1+state+S2;
		String w2=S1+district+S2;
		System.out.println(w);
		
		driver.findElement(By.xpath(w)).click();
		driver.findElement(By.xpath("//span[text()=\"--Select one--\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(w2)).click();
}
}