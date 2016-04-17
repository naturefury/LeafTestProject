package opentapsgroups;

import org.testng.annotations.Test;

public class EditContact extends OpenTapsWrapper {
	@Test(groups="sanity",dependsOnGroups="smoke")
	public void editContact()
	{
		System.out.println("Contact Edited");
	}
	}
