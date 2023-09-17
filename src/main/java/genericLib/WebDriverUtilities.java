package genericLib;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilities {

	//if application have multiple dropdown,mousehover,doubleclick,dranand drop,alert popup,
	//switch frame,switch back from frame switching tabs,scrollbar,
	//create object for this only one time..no need to create it multiple times
	
	
	//1 : dropdown
	
		public void dropdown(WebElement ele,String text) {
			Select s=new Select(ele);
			s.selectByVisibleText(text);
		}
		
	//2 : mouseHover
		
		public void mousehover(WebDriver driver,WebElement ele) {
			Actions a=new Actions(driver);
			a.moveToElement(ele).perform();
		}
		
	//3 : doubleclick
		
		public void doubleClick(WebDriver driver,WebElement ele) {
			Actions a=new Actions(driver);
			a.doubleClick(ele).perform();
			}
	
	//4 : draganddrop
		
		public void draganddrop(WebDriver driver,WebElement src,WebElement dest) {
			Actions a=new Actions(driver);
			a.dragAndDrop(src, dest).perform();
		}
		
	//5 : switchtoframe
		
		public void switchFrame(WebDriver driver) {
			driver.switchTo().frame(0);
		}	
			
	//6 : switchback from frame
		
		public void switchBack(WebDriver driver) {
			driver.switchTo().defaultContent();
		}
		
	//7 : alert popup
		
		public void alertpopup(WebDriver driver) {
			driver.switchTo().alert().accept();
		}
		
	//8. Scroll Bar
		public void scrollbar(WebDriver driver,int x,int y) {
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("window.scrollBy("+x+","+y+")");
		}
		
	//9 : switch tabs
		
		public void switchTabs(WebDriver driver) {
			Set<String> child = driver.getWindowHandles();
			for(String b:child) {
				driver.switchTo().window(b);
			}
		}
			
		
}
