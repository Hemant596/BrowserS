package TestPackage;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryLogic {
	
	@Test
	public void Test1() {
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void Test2() {
		assertEquals(false, true);
	}
		
		@Test
		public void Test3() {
			assertEquals(true, true);
		}
	
}
