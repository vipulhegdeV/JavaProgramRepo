package newprojectjava;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class screenshot {
 @BeforeMethod
 public void setup() {
 }
	@AfterMethod
	public void teardown() {}
	
	@Test
	public void takeScreensshotTest() {
		Assert.assertEquals(false,true);
	}
}