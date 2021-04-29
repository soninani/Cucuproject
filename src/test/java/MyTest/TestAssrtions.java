package MyTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestAssrtions {
	
	
	//SoftAssert softAssert=new SoftAssert();
	SoftAssert softAssert1=new SoftAssert();
	@Test
	public void test(){
		System.out.println("println1");
    Assert.assertTrue(false);
		
		System.out.println("println2");
		softAssert1.assertTrue(false);
	
		System.out.println("println3");
		
	
		System.out.println("println4");
		softAssert1.assertAll();
		
		
		
		
	}
	

	
//	@Test
//	public void testHm(){
//		System.out.println("Nope");
//	}
	

}
