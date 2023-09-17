package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtoCart {
	
	//implementation
	// 1 : 3rd page : a) double click on + b) click on addto cart
	
	
	@FindBy(id="add")
	private WebElement addbtn;
	
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement addtocart;
	
	public AddtoCart(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddbtn() {
		return addbtn;
	}
	public void addtocartbtn() {
		addtocart.click();
	}
}
