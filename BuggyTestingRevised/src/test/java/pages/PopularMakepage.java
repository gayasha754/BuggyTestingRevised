package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PopularMakepage {

private static WebElement element = null;
	
	By txt_comment = By.xpath("/html/body/my-app/div/main/my-model/div/div[1]/div[3]/div[2]/div[2]/fieldset/textarea");
	
	By btn_Vote = By.xpath("//button[contains(@class,'btn btn-success')]"); //here relative xpath is used for vote button   
	By alertMsg = By.xpath("/html/body/my-app/div/main/my-model/div/div[1]/div[3]/div[2]/div[2]/p");
//	
	public static WebElement btnModel(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//a[normalize-space()='Mito']"));
		return element;
	}
	
	
	public static WebElement TextInComment(WebDriver driver) {
		
		element = driver.findElement(By.xpath("/html/body/my-app/div/main/my-model/div/div[1]/div[3]/div[2]/div[2]/fieldset/textarea"));
		return element;
	}
	
	
	public static WebElement VoteButton(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//button[contains(@class,'btn btn-success')]"));
		return element;
	}
	
	
	public String getAlertMessage(WebDriver driver){
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		
        Boolean result = driver.findElement(By.xpath("/html/body/my-app/div/main/my-model/div/div[1]/div[3]/div[2]/div[2]/p")).isDisplayed();

        String alertMessage = null;
        
        if(result){
            alertMessage = driver.findElement(alertMsg).getText();
        }

        return alertMessage;
    }
	

}
