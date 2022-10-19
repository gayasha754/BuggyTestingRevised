package base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	//setting the browser
		public static WebDriver driver;
		
		//property reading functionality
		public static Properties prop = new Properties();
		public static FileReader fr;
		
		//set up the browserDiver
		
		@BeforeTest
		public void setUp() throws IOException {
			
			//driver.manage().window().maximize();
			
			//check the browser type
			if(driver == null) {
				
				
				fr = new FileReader(System.getProperty("user.dir") + "\\src\\test\\resources\\configfiles\\config.properties");
				
				
				prop.load(fr); //config
			
			}
			
			if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
				//download chrome driver and store it in the location.
				WebDriverManager.chromedriver().setup();
				
				//create object of WebDriver
				driver = new ChromeDriver();
				
				
				driver.get(prop.getProperty("testURL"));
			}
			else if(prop.getProperty("browser").equalsIgnoreCase("firefox")) {
				
				//download chrome driver and store it in the location.
				WebDriverManager.firefoxdriver().setup();
				
				//create object of WebDriver
				driver = new FirefoxDriver();
				
				driver.get(prop.getProperty("testURL"));
			}
		}
		
		
		@AfterTest
		public void tearDown() {
			
			//logout
			driver.close();
			System.out.println("Tear Down Successful!");
		}
	
}
