package test_selenium_java;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class maintest {
	public static WebDriver driver = null;
	
	public static void main (String[] args) throws InterruptedException{
		
		//could use for-loop to iterate the tests, but having time constraints
		//TEST CASE 1
		//initializing the web driver
		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		//open the browser
		driver.navigate().to("https://www.xe.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		
		//check title
		if (title.equalsIgnoreCase("Xe: Currency Exchange Rates and International Money Transfers"))
			System.out.println("Title matches");
		else
			System.out.println(title);
		
		//Carrying out the test case 1
		test_1.case_1(driver);
		
		//TEST CASE 2
		//reinitialize the driver, as the driver was closed in the previous test case
		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		//open the browser
		driver.navigate().to("https://www.xe.com/");
		driver.manage().window().maximize();
		title = driver.getTitle();
		
		//check title
		if (title.equalsIgnoreCase("Xe: Currency Exchange Rates and International Money Transfers"))
			System.out.println("Title matches");
		else
			System.out.println(title);
		
		//Carrying out the test case 2
		test_2.case_2(driver);
		
		//TEST CASE 3
		//reinitialize the driver, as the driver was closed in the previous test case
		System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
				
		//open the browser
		driver.navigate().to("https://www.xe.com/");
		driver.manage().window().maximize();
		title = driver.getTitle();
				
		//check title
		if (title.equalsIgnoreCase("Xe: Currency Exchange Rates and International Money Transfers"))
			System.out.println("Title matches");
		else
			System.out.println(title);
				
		//Carrying out the test case 3
		test_3.case_3(driver);
	}
}