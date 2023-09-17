package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishListPage {

	
	
	//@FindBy(xpath="//span[text()='Play']")
	//private WebElement playbutton;
	
	//@FindBy(xpath="//span[text()='Pause']")
	//private WebElement pausebutton;
	
	@FindBy(xpath="//span[text()='Add To Wishlist']")
	private WebElement addtowishlist;
	
	@FindBy(xpath="//a[@class='close_cookies']")
	private WebElement closebtn;
	
	public WishListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void closebutton() {
		closebtn.click();
	}
//	public void playbtn() {
//		playbutton.click();
//	}
//	public void pausebtn() {
//		pausebutton.click();

	public void addtowishlistbtn() {
		addtowishlist.click();
	}
	
}
