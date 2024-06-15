package test_selenium_java;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class test_4 {
public static void case_4(WebDriver driver) throws InterruptedException{
		
		System.out.println("Carrying out Test Case 4");
		
		//change both "From" and "To" textboxes to MYR and wait for 2.5 seconds
		WebElement TextboxFrom = driver.findElement(By.xpath("//*[@id=\"midmarketFromCurrency\"]/div[2]/div/input"));
		TextboxFrom.click();
		TextboxFrom.sendKeys("MYR");
		Thread.sleep(2500);
		TextboxFrom.sendKeys(Keys.RETURN);
		Thread.sleep(2500);
				
		WebElement TextboxTo = driver.findElement(By.xpath("//*[@id=\"midmarketToCurrency\"]/div[2]/div/input"));
		TextboxTo.click();
		TextboxTo.sendKeys("MYR");
		Thread.sleep(2500);
		TextboxTo.sendKeys(Keys.RETURN);
		Thread.sleep(2500);
		
		String newAmount = "25.65";
		
		//type hello into "Amount" text box and wait for 2.5 seconds
		WebElement TypeAmount = driver.findElement(By.xpath("//*[@id=\"amount\"]"));
		TypeAmount.click();
		TypeAmount.sendKeys(newAmount);
		Thread.sleep(2500);
		
		//click on "Convert" and wait for 5 seconds
		WebElement ClickConvert = driver.findElement(By.xpath("//*[@id=\'__next\']/div[4]/div[2]/section/div[2]/div/main/div/div[2]/button"));
		ClickConvert.click();
		Thread.sleep(5000);
		
		WebElement ConvertedAmount = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/section/div[2]/div/main/div/div[2]/div[1]/div/p[2]"));
		if (ConvertedAmount.getText().contains(newAmount)) {
            System.out.println("The conversion is accurate between same currencies");
        }
		else {
			System.out.println("The conversion is not the same, although between same currencies");
		}
		
		//wait for 2.5 seconds and close driver
		Thread.sleep(2500);
		driver.close();
		
		//finish test case 3
		System.out.println("Test Case 4 finished");
		Thread.sleep(5000);
	}
}
