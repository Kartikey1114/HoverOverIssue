package pagesPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPageClass {


		@FindBy(linkText="Mobiles")
		private WebElement mobiles; 
		
		public LandingPageClass(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		public void clickMobile()
		{
			mobiles.click();
		}
	}

