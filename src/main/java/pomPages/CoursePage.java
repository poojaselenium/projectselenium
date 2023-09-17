package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoursePage {

	//B : 2nd scenario
	
	//1 :
	@FindBy(id="Selenium Training")
	private WebElement seleniumdd;
	
	@FindBy(id="cartArea")
	private WebElement cartarea;
	
	@FindBy(xpath="(//i[@class='fa fa-linkedin'])[2]")
	private WebElement linkedin;
	
	public WebElement getLinkedin() {
		return linkedin;
	}

	public WebElement getSeleniumdd() {
		return seleniumdd;
	}

	public WebElement getCartarea() {
		return cartarea;
	}

	public CoursePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void linkedinicon() {
		linkedin.click();
	}
	
}
