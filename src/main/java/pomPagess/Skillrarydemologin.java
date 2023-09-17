package pomPagess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Skillrarydemologin {
	
	@FindBy(id="course")
	private WebElement coursetab;
	
	@FindBy(xpath="(//a[text()='Selenium Training'])[1]")
	private WebElement seleniumtraining;
	
	public Skillrarydemologin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getCoursetab() {
		return coursetab;
	}
	
	public void seltraining() {
		seleniumtraining.click();
	}
	
			
			
}
