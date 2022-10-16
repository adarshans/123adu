package GenericLibrary;

import java.awt.RenderingHints.Key;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class propertyfile {
	
	public String getpropertyfile1(String Key) throws IOException {
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream(Autoconstant.propertyfilepath);
		p.load(fis);
		return p.getProperty(Key);
	}

}
