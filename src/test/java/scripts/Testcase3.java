package scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.CoreJavaPage;
import pomPages.SkillraryLoginPage;
import pomPages.WishListPage;

public class Testcase3 extends BaseClass{

	@Test
	public void tc3() throws IOException, InterruptedException {
		SkillraryLoginPage sl=new SkillraryLoginPage(driver);
		sl.searchtextbox(pdata.getData("search"));
		sl.searchbutton();
		
		CoreJavaPage c=new CoreJavaPage(driver);
		c.corejavalink();
		
		WishListPage w=new WishListPage(driver);
		//driveruti.switchFrame(driver);
		w.closebutton();
		
	//Thread.sleep(2000);
//		w.playbtn();
//		Thread.sleep(5000);
//		w.pausebtn();
		//driveruti.switchBack(driver);
		
		w.addtowishlistbtn();
	}
	
}
