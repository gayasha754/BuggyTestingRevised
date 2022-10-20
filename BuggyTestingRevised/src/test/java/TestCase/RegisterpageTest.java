package TestCase;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.Loginpage;
import pages.Registerpage;

public class RegisterpageTest extends BaseTest{
	
	
	public String randomEmail(){
	        
        String generatedString = RandomStringUtils.randomAlphanumeric(10);
        String email = generatedString + "@gmail.com";
        return email;
    }

	
	@Test
    public void testCorrectInputFields() throws InterruptedException {
        
		//navigate to register
		driver.navigate().to(prop.getProperty("registerpage"));
       
        Registerpage regObject = new Registerpage();
        
        String username = randomEmail();
        
        regObject.txtUsername(driver).sendKeys(username);;
        regObject.TextInFirstname(driver).sendKeys("Thariini");
        regObject.TextInLastname(driver).sendKeys("Wijesinghe");
        regObject.TextInPassword(driver).sendKeys("Tharini1234@");
        regObject.TextInPasswordConfirm(driver).sendKeys("Tharini1234@");
        regObject.RegisterButton((driver)).sendKeys(Keys.RETURN);
        
        String actual = regObject.getAlertMessage(driver);
    
        String expected = "Registration is successful";
        assertEquals(expected,actual);
        
        Loginpage LoginObject = new Loginpage();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		
        LoginObject.txtUsername(driver).sendKeys(username);
        LoginObject.txtPassword(driver).sendKeys("Tharini1234@");
        LoginObject.btnLogin(driver).sendKeys(Keys.RETURN);
	}
	
	@Test
    public void testExistingInputFields(){
        
		//navigate to register
		driver.navigate().to(prop.getProperty("registerpage"));
		       
		Registerpage regObject = new Registerpage();
        
		regObject.txtUsername(driver).sendKeys("Gesandai@gmail.com");;
        regObject.TextInFirstname(driver).sendKeys("Thariini");
        regObject.TextInLastname(driver).sendKeys("Wijesinghe");
        regObject.TextInPassword(driver).sendKeys("Gesandi1234@");
        regObject.TextInPasswordConfirm(driver).sendKeys("Gesandi1234@");
        regObject.RegisterButton((driver)).sendKeys(Keys.RETURN);
         
        String actual = regObject.getAlertMessage(driver);

        String expected = "UsernameExistsException: User already exists";
        assertEquals(expected,actual);
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));

    }
    
}
