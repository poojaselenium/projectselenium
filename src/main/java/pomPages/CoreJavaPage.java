package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoreJavaPage {

	//3rd scenario: 2nd page
	
	@FindBy(xpath="//a[text()=' Core Java for Selenium']")
	private WebElement corejavatext;
	
	public CoreJavaPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	public void corejavalink() {
		corejavatext.click();
	}

	//then it will go to next page create new class for new page
	
}