package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage {

	private static WebElement element = null;
	

	
	public static WebElement txtUsername(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//input[@placeholder='Login']"));
		return element;
	}

	public static WebElement txtPassword(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//input[@name='password']"));
		return element;
	}
	
	public static WebElement btnLogin(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		return element;
	}
	
	public static WebElement popularMake(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//div[@class='row']//div[1]//div[1]//a[1]"));
		return element;
	}
		

	
	
}
