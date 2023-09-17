package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLoginPage {

	//implementation 
	//1st scenario
	//1 : page 1 :a)click on gears b)click on skillrary demo app
	
	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearsbtn;
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement demoapp;
	
	//3rd scenario: 1st Page
	 //1
	@FindBy(name="q")
	private WebElement searchtb;
		//2
	@FindBy(xpath="//input[@type='submit']")
	private WebElement searchbtn;
	
	//3 close or acceptbtn
	//@FindBy(xpath="//a[text()='//a[@class='close_cookies']']")
	//private WebElement closebtn;

	
	public SkillraryLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void gears() {
		gearsbtn.click();
	}
	public void skillrarydemoapp() {
		demoapp.click();
	}
	
	//3rd sceanrio: 1st page
	public void searchtextbox(String name) {
		searchtb.sendKeys(name);
	}
	public void searchbutton() {
		searchbtn.click();
	}
	//public void closebutton() {
	//	closebtn.click();
	//}
	//after that go to data.properties and store what we want to search
	//search=core java for selenium..then it is going to core java page so 
	//create new class for new page core java page
	
	
}
