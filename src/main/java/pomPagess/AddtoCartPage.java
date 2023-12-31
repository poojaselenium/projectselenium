package pomPagess;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtoCartPage {

	@FindBy(id="add")
	private WebElement addbtn;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement addtocartbtn;
	
	public AddtoCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddbtn() {
		return addbtn;
	}
	
	public void addtocart() {
		addtocartbtn.click();
	}
}
