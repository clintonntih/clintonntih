package testCase_Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dont know Yet\\eclipse-workspace\\AutomationTestingProject\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("www.google.com");
		
		driver.findElement(By.xpath("//input[@aria-label='Search']")).sendKeys("Clinton Ntih");
		
	}

}
