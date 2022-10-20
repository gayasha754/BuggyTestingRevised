package TestCase;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.Loginpage;
import pages.Logoutpage;
import pages.PopularMakepage;

public class PopularMakepageTest extends BaseTest{
	
	 //Login
    Logoutpage logoutObj = new Logoutpage();
    //logout
	Loginpage loginObj = new Loginpage();
	
	
	@Test
    public void testSomeMethod() throws InterruptedException {
        
    	loginObj.txtUsername(driver).sendKeys("Abhii");
    	loginObj.txtPassword(driver).sendKeys("Abhi1234@");
    	loginObj.btnLogin(driver).sendKeys(Keys.RETURN);
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		
    	loginObj.popularMake(driver).sendKeys(Keys.RETURN);
    	
    	    
    	PopularMakepage popularMakeObj = new PopularMakepage();
        
    	popularMakeObj.btnModel(driver).sendKeys(Keys.RETURN);
        
    	popularMakeObj.TextInComment(driver).sendKeys("TestComment");
        
    	popularMakeObj.VoteButton(driver).sendKeys(Keys.RETURN);
        
        
        String actual = popularMakeObj.getAlertMessage(driver);
        
        String expected = "Thank you for your vote!";
        assertEquals(expected,actual);
       
        
        //Logging out
        logoutObj.btnLogout(driver).sendKeys(Keys.RETURN);
    }

}
