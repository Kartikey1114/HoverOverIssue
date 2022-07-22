package testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTestClass {
	
		WebDriver driver;
		@BeforeTest
		public void LoginApplication()
		{
			//Launching Browser
			driver=new ChromeDriver();
			
			//Maximize the Application
			driver.manage().window().maximize();
			
			//Navigate to the Application
			driver.get("https://amazon.in");
		}
		
		@AfterTest
		public void closeBrowser()
		{
			driver.quit();
		}

	}

