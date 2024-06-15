//Test 1: Basic functionality of the Convert module (Normal conversion without change of currency)

package test_selenium_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class test_1 {
	public static void case_1(WebDriver driver) throws InterruptedException{
		System.out.println("Carrying out Test Case 1");
		
		WebElement TypeAmount = driver.findElement(By.id("amount"));
		TypeAmount.click();
		TypeAmount.sendKeys("25.00");
		Thread.sleep(2500);
		
		//click on "Convert" and wait for 5 seconds
		WebElement ClickConvert = driver.findElement(By.xpath("//*[@id=\'__next\']/div[4]/div[2]/section/div[2]/div/main/div/div[2]/button"));
		ClickConvert.click();
		Thread.sleep(5000);
				
		//wait for 5 seconds and close driver
		Thread.sleep(5000);
		driver.close();
		
		//finish test case 1
		System.out.println("Test Case 1 finished");
		Thread.sleep(5000);
	}
}
