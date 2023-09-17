package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoApp {
	
	//implementation
	// 1 : 2nd PAGE : a)mouse hover on course b) click on selenium training
	
	@FindBy(id="course")
	private WebElement coursetab;
	
	@FindBy(xpath="(//a[text()='Selenium Training'])[1]")
	private WebElement seleniumtraining;
	
	//B : 2 nd scenario :
	   //2nd scenario : in this a)click on gears which we have done in
	   //skillraryloginpage class and b) click on skillarary demo app
	  //: c) switch control to new tab d) : select testing from the dropdown
	  //: e)drag and drop cucumber course f)scroll the page till fb icon and click on that icon
	
	   // B) 1st page : 1 : c)select testing  from drop down
	          //we are storing course in data.properties i.e cursedropdown=Testing
	
	
	@FindBy(name="addresstype")
	private WebElement coursedropdown;
	
	  // B : 2: action we are doing with getter
	  // B:3:After that we get new page after testing course,create new class now
	   
	
	
	
	
	public SkillraryDemoApp(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getCoursedropdown() {
		return coursedropdown;
	}

	public WebElement getCoursetab() {
		return coursetab;
	}
	
	public void seltraining() {
		seleniumtraining.click();
	}
		
	
}
