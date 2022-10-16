package GenericLibrary;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner.detDSA;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.managers.VoidDriverManager;

public class photo {
 
  
	public void getphoto(WebDriver driver, String name) throws IOException {
		 Date d=new Date();
		  String currentdate = d.toString().replaceAll(":", "-");
		TakesScreenshot sc=(TakesScreenshot) driver;
		File src = sc.getScreenshotAs(OutputType.FILE);
		File dest=new File(Autoconstant.photo+currentdate+name+".png");
		FileUtils.copyFile(src, dest);
	}
}
