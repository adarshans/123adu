package GenericLibrary;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclass {
public WebDriver driver;
public driverutilties utilities=new driverutilties();
public propertyfile pdata=new propertyfile();
	@BeforeMethod
	public void openapp() throws IOException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(pdata.getpropertyfile1("url"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@AfterMethod
	public void clossapp(ITestResult itr) throws IOException {
		String name = itr.getName();
		int status = itr.getStatus();
		if(status==2) {
			photo p=new photo();
			p.getphoto(driver, name);
		}
		driver.quit();
	}
	}
	