package scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.CoursePage;
import pomPages.SkillraryDemoApp;
import pomPages.SkillraryLoginPage;

public class Testcase2 extends BaseClass {
	@Test
	public void tc2() throws IOException {
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.gears();
		s.skillrarydemoapp();
		
		SkillraryDemoApp sd=new SkillraryDemoApp(driver);
		driveruti.switchTabs(driver);
		driveruti.dropdown(sd.getCoursedropdown(),pdata.getData("coursedropdown"));
		//throw ioexcepttion
		
		CoursePage cp=new CoursePage(driver);
		driveruti.draganddrop(driver, cp.getSeleniumdd(), cp.getCartarea());
		
		WebElement loc = cp.getLinkedin();
		Point l = loc.getLocation();
		int x=l.getX();
		int y=l.getY();
		
		driveruti.scrollbar(driver, x, y);
		cp.linkedinicon();
	}
	
}
