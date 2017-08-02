package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class selectFBdropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.gecko.driver", "C:\\Automation\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		//driver.manage().window().maximize();
		
		WebElement month_dropdown = driver.findElement(By.id("month"));
		System.out.println("month dropdown"+ month_dropdown);
		
		Select month_dd = new Select(month_dropdown);
		
		System.out.println("\n month_dd" +month_dd);
		
		//System.out.println("month dropdown"+month_dropdown);
		
		//Select by Id- It will select March
		
		month_dd.selectByIndex(3);	
		Thread.sleep(3000);
		
		//Select by values
		
		
		month_dd.selectByValue("10");
		Thread.sleep(3000);
		
		//Select by visible text
		
		month_dd.selectByVisibleText("Aug");
		
		
		//driver.quit();

	}

}
