package GenericLibrary;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class driverutilties {

	public void mouseover(WebDriver driver, WebElement ele) {
		
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
	}
	public void rightclick(WebDriver driver) {
	Actions a=new Actions(driver);
	a.contextClick().perform();;
	}
	public void dubbleclk(WebDriver driver, WebElement ele) {
		Actions a=new Actions(driver);
		a.doubleClick(ele).perform();;
	}
	public void draganddrop(WebDriver drver, WebElement dest, WebElement src) {
		Actions a=new Actions(drver);
		a.dragAndDrop(src, dest).perform();
		
	}
	public void dropdown(WebElement driver, String text) {
		Select s=new Select(driver);
		s.selectByVisibleText(text);
	}
	public void swichtoframe(WebDriver driver) {
		driver.switchTo().frame(0);
	}
	public void  switchbacktoframe(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	public void swchtotab( WebDriver driver) {
		Set<String> child = driver.getWindowHandles();
		for( String c:child) {
			driver.switchTo().window(c);
		}
	}
	public void scrollbar(WebDriver driver, int x, int y) {
		JavascriptExecutor jc=(JavascriptExecutor) driver;
		jc.executeScript("window.ScrollBy("+x+","+y+")");
	}
	public void swichtoalert(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
}
