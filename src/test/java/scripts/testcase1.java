package scripts;

import org.testng.annotations.Test;

import GenericLibrary.baseclass;
import pompages.skillraryloginpage;

public  class testcase1 extends baseclass{
	@Test
	public void tc1() {
		skillraryloginpage sl=new skillraryloginpage(driver);
		sl.gearbtn();
		sl.skilldemolnk();
	}
	

}
