package test_selenium_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class test_3 {
	public static void case_3(WebDriver driver) throws InterruptedException{
		
		System.out.println("Carrying out Test Case 3");
		
		//type hello into "Amount" text box and wait for 2.5 seconds
		WebElement TypeAmount = driver.findElement(By.xpath("//*[@id=\"amount\"]"));
		TypeAmount.click();
		TypeAmount.sendKeys("hello@%#");
		Thread.sleep(2500);
		
		WebElement ErrorMessage = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[4]/div[2]/section/div[2]/div/main/div/div[1]/div[2]"));
		if (ErrorMessage.getText().contains("Please enter a valid amount")) {
            System.out.println("The error message is given out, therefore letters and special characters cannot be used to convert currencies");
        }
		else {
			System.out.println("The error message is not given out");
		}
		
		//wait for 5 seconds and close driver
		Thread.sleep(5000);
		driver.close();
		
		//finish test case 3
		System.out.println("Test Case 3 finished");
		Thread.sleep(5000);
	}
}
