package TestCase;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseTest;
import pages.Loginpage;
import pages.Logoutpage;

public class LoginpageTest extends BaseTest{

	Logoutpage logoutObj = new Logoutpage();
	Loginpage loginObj = new Loginpage();
	
	@Test
	public void loginTest() throws InterruptedException {
	
		loginObj.txtUsername(driver).sendKeys("Gesandai@gmail.com");
		loginObj.txtPassword(driver).sendKeys("Gesandi1234@");
		//click on login
		loginObj.btnLogin(driver).sendKeys(Keys.RETURN);		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
		logoutObj.btnLogout(driver).sendKeys(Keys.RETURN);

		
	}

}
