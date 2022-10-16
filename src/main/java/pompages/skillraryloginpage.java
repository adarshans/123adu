package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class skillraryloginpage {

	@FindBy(xpath="//a[contains(text(),'GEARS')]")
	private WebElement gear;
	
	@FindBy(xpath="//ul[@class='dropdown-menu gear_menu']//a[@class='ignorelink'][normalize-space()='SkillRary Demo APP']")
	private WebElement skildemo;
	
	public skillraryloginpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void gearbtn() {
		gear.click();
	}
	public void skilldemolnk() {
		skildemo.click();
	}
}
