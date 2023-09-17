package genericLib;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	
	public void getPhoto(WebDriver driver,String name) throws IOException {
		
		//2 : Create object for date class to get current date and time of system
		
		Date d=new Date();
		
		// converting complete date in string format and i am going to replace all
		String currentdate = d.toString().replaceAll(":","-");
		
		
		//1: typecasting
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		//3 : photo path should have current date, we are writing so many test cases
			//we wanted to know which test case gets fail,so pass name as a parameter to method,and
			//photo always store in the format of .png
		
		File dest=new File(AutoConstant.photoPath+currentdate+name+".png");
		FileUtils.copyFile(src, dest);
		
		
	}
}
