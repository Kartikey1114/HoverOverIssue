package pagesPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HoverOverClass {

	
		
		Actions actions;
		
		@FindBy(linkText="Mobiles & Accessories")
		private WebElement hoverOver;
		
		@FindBy(linkText="Apple")
		private WebElement apple;
		
		public HoverOverClass(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
			actions=new Actions(driver);
		}
		
		public void hoverOverMobileandAccessories()
		{
			actions.moveToElement(hoverOver).build().perform();
		}

		public void clickApple()
		{
			apple.click();
		}
	}


