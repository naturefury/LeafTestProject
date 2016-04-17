package opentapsgroups;

import org.testng.annotations.Test;

public class MergeLead extends OpenTapsWrapper {
	@Test(groups="sanity",dependsOnGroups="smoke")
	public void mergelead()
	{
		System.out.println("Lead merged");
	}


}
