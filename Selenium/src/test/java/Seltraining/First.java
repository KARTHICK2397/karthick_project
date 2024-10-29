package Seltraining;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://www.flipkart.com/travel/flights?param=HPW-BDS-malaysia-booknow");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@tabindex=\"01\"]")).sendKeys("Chennai");
		driver.findElement(By.xpath("//span[text()=\"Chennai\"]")).click();
		driver.findElement(By.xpath("//input[@tabindex=\"02\"]")).sendKeys("Trichy");
		driver.findElement(By.xpath("//span[text()=\"Trichy\"]")).click();

		while (true) {
			String S = driver.findElement(By.xpath(
					"//div[@class=\"s+8PCn dUQeOy _9zHVSK _5XbPZt eTQwh+\"]//div[@class=\"_5WWQqg\"]//table[1]//div[@class=\"_1w7bXX\"]"))
					.getText();

			System.out.println(S);

			if (S.equals("February 2025")) {

				break;

			} else {
				driver.findElement(By.xpath(
						" //div[@class=\"s+8PCn dUQeOy _9zHVSK _5XbPZt eTQwh+\"]//div[@class=\"_5WWQqg\"]//table[2]//following::button[@class=\"R0r93E\"]"))
						.click();
			}

		}
		List<WebElement> al = driver.findElements(By.xpath(
				"//div[@class=\"s+8PCn dUQeOy _9zHVSK _5XbPZt eTQwh+\"]//div[@class=\"_5WWQqg\"]//table[1]//td//button"));
		for (WebElement a : al) {
			// System.out.println(a.getText());
			// System.out.println("&&");
			if (a.getText().startsWith("14")) {
				a.click();
				break;
			}
		}
		driver.findElement(By.xpath("//div[text()=\"Adults\"]//following::button[2]")).click();
		Thread.sleep(3000);
		driver.findElement(
				By.xpath("//div[text()=\"Business\"]//parent::div[@class=\"VTUEC- uPC0Sn\"]//preceding-sibling::div"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class=\"QqFHMw sgUmTV M5XAsp\"]")).click();

	}
}
