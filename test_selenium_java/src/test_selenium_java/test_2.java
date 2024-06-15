//Test 2: Functionality of the Convert module (Change currency from dropdown, currency swap button, test of other textboxes)

package test_selenium_java;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class test_2 {
	public static void case_2(WebDriver driver) throws InterruptedException{
		
		System.out.println("Carrying out Test Case 2");
		
		//change the initial MYR into EUR in the "From" text box and wait for 2.5 seconds
		WebElement TextboxFrom = driver.findElement(By.xpath("//*[@id=\"midmarketFromCurrency\"]/div[2]/div/input"));
		TextboxFrom.click();
		TextboxFrom.sendKeys("EUR");
		Thread.sleep(2500);
		TextboxFrom.sendKeys(Keys.RETURN);
		Thread.sleep(2500);
				
		//change the initial EUR into MYR in the "To" text box and wait for 2.5 seconds
		WebElement TextboxTo = driver.findElement(By.xpath("//*[@id=\"midmarketToCurrency\"]/div[2]/div/input"));
		TextboxTo.click();
		TextboxTo.sendKeys("MYR");
		Thread.sleep(2500);
		TextboxTo.sendKeys(Keys.RETURN);
		Thread.sleep(2500);
				
		//type into "Amount" text box and wait for 2.5 seconds
		WebElement TypeAmount = driver.findElement(By.id("amount"));
		TypeAmount.click();
		TypeAmount.sendKeys("250.00");
		Thread.sleep(2500);
							
		//click on "Convert" and wait for 5 seconds
		WebElement ClickConvert = driver.findElement(By.xpath("//*[@id=\'__next\']/div[4]/div[2]/section/div[2]/div/main/div/div[2]/button"));
		ClickConvert.click();
		Thread.sleep(5000);
				
		//click on "Swap currencies" and wait for 5 seconds
		WebElement ClickSwap = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/section/div[2]/div/main/div/div[1]/div[6]/button"));
		ClickSwap.click();
		Thread.sleep(5000);
				
		//wait for 5 seconds and close driver
		Thread.sleep(5000);
		driver.close();
		
		//finish test case 2
		System.out.println("Test Case 2 finished");
		Thread.sleep(5000);
	}
}
