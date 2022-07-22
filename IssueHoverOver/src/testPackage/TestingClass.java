package testPackage;

import org.testng.annotations.Test;

import pagesPackage.HoverOverClass;
import pagesPackage.LandingPageClass;

	public class TestingClass extends BaseTestClass {
		
		@Test
		public void callTest() throws InterruptedException
		{
			
			LandingPageClass landingPage=new LandingPageClass(driver);
			landingPage.clickMobile();
			Thread.sleep(5000);
			
			HoverOverClass ob=new HoverOverClass(driver);
			ob.hoverOverMobileandAccessories();
			ob.clickApple();
		}

	}

