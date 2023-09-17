package scripts;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.AddtoCart;
import pomPages.SkillraryDemoApp;
import pomPages.SkillraryLoginPage;

public class Testcase1 extends BaseClass{
		@Test
		public void tc1() {
			
		//1 page
			
			SkillraryLoginPage s=new SkillraryLoginPage(driver);
			s.gears();
			s.skillrarydemoapp();
		
		//2 page
			SkillraryDemoApp sd=new SkillraryDemoApp(driver);
			driveruti.switchTabs(driver);
			driveruti.mousehover(driver, sd.getCoursetab());
			sd.seltraining();
			
		//3 page
			AddtoCart ad=new AddtoCart(driver);
			driveruti.doubleClick(driver,ad.getAddbtn());
			ad.addtocartbtn();
			driveruti.alertpopup(driver);
			
			
		}
	
}
