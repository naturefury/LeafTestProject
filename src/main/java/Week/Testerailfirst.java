package Week;

import org.junit.Test;

public class Testerailfirst extends Wrapperclass {
	@Test
	public void test(){
		
		launchapp("chrome","http://erail.in/");
		enterByIdandtab("txtStationFrom","mas");
		enterByIdandtab("txtStationTo","SBC");
		selectValueByIndex("cmbQuota", 1);
		selectValueByIndex("selectClassFilter",0);
		clickById("buttonFromTo");
	}
	

}
