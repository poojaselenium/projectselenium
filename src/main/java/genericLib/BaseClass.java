package genericLib;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public WebDriver driver;
	
//3 A
	public PropertyfileData pdata=new PropertyfileData();
	
//5 B : after implementation: After creating all pom classes create object for WebDriver tuilities class here
//  : to access all methods from webDriverutilities.
	
	public WebDriverUtilities driveruti=new WebDriverUtilities();
	
	
//4 A: Go to data.properties from src/test/resources and store data i.e url
	
	
//1 A
	@BeforeMethod
	public void OpenApp() throws IOException {
	
//6  B: after creating object for webDriverutilities in base class
//	: in webDriver utilities there is webDriver manager for driver executabele
//	: To Run program in browser : Code
	
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
//5 A:driver.get(pdata.getData("url")
		
		driver.get(pdata.getData("url"));
		
//getting error for that go to propertyfiledata class make return type as String)
//add return statement after p.load(fis) we will get return statement and then save that file.
//then in base class it will throw one exception .
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	//2 A
	@AfterMethod
	public void closeApp() {
		driver.quit();
	}
	
}


//3
