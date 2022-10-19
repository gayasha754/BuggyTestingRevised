package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Logoutpage {
	
	private static WebElement element = null;
	
//	By btn_Logout = By.xpath("/html/body/my-app/header/nav/div/my-login/div/ul/li[3]/a"); //here relative xpath is used for vote button 
//	
//	 public void clickLogoutButton(){
//	        driver.findElement(btn_Logout).sendKeys(Keys.RETURN);
//	    }
	 
	 public static WebElement btnLogout(WebDriver driver) {
			
			element = driver.findElement(By.xpath("/html/body/my-app/header/nav/div/my-login/div/ul/li[3]/a"));
			return element;
		}
	
}
