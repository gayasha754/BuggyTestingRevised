package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Registerpage {
	
	private static WebElement element = null;

    //setting text of username
    public static WebElement txtUsername(WebDriver driver) {
		
		element = driver.findElement(By.id("username"));
		return element;
	}
       
    //setting text of firstName
    public static WebElement TextInFirstname(WebDriver driver){
    	element =driver.findElement(By.id("firstName"));
    	return element;
    }
    
    //setting text of LastName
    public static WebElement TextInLastname(WebDriver driver){
    	element =driver.findElement(By.id("lastName"));
    	return element;
    }
    
    //setting text of Password
    public static WebElement TextInPassword(WebDriver driver){
    	element =driver.findElement(By.id("password"));
    	return element;
    }
    
    //setting text of Password confirm
    public static WebElement TextInPasswordConfirm(WebDriver driver){
    	element =driver.findElement(By.id("confirmPassword"));
    	return element;
    }
       
    public static WebElement RegisterButton(WebDriver driver){
    	element =driver.findElement(By.xpath("//button[contains(@class,'btn btn-default')]"));
    	return element;
    }
       
    public String getAlertMessage(WebDriver driver){
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
        Boolean result = driver.findElement(By.xpath("/html/body/my-app/div/main/my-register/div/div/form/div[6]")).isDisplayed();

        String alertMessage = null;
        if(result){
            alertMessage = driver.findElement(By.xpath("/html/body/my-app/div/main/my-register/div/div/form/div[6]")).getText();
        }

         return alertMessage;
     } 

}
