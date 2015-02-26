package TaxCalculation;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;







public class TaxAPITestCases 
{
// Test CalcLuxTax()	
	TaxAPI testapi = new TaxAPI();
	//Testing for both price and quantity to be zero.
	double finalluxtax1 = testapi.CalcLuxuryTax(0,0);
	double testtax1 = 0;
	// Testing for both price as 10, and quantity as zero.
	double finalluxtax2 = testapi.CalcLuxuryTax(10,0);
	double testtax2 = 0;
	//Test with price as 1, quantity as -1.
	double finalluxtax3 = testapi.CalcLuxuryTax(1,-1);
	double testtax3 = -1.01;
	//Test with price as -1, quantity as -1.
	double finalluxtax4 = testapi.CalcLuxuryTax(-1,-1);
	double testtax4 = 1.01;
	
	
// Test CalcBasicTax()	
	// Test with price and quantity to be zero.
	double finalbtax1 = testapi.CalcBasicTax(0,0);
	double testbtax1 = 0;
	// Test with price 10, quantity to be zero.
	double finalbtax2 = testapi.CalcBasicTax(10,0);
	double testbtax2 = 0;
	//Test with price as 1, quantity as -1.
	double finalbtax3 = testapi.CalcLuxuryTax(1,-1);
	double testbtax3 = -1.01;
	//Test with price as -1, quantity as -1.
	double finalbtax4 = testapi.CalcLuxuryTax(-1,-1);
	double testbtax4 = 1.01;
		
	
	@Test
	
	public void TestLuxTax()
	{
		System.out.println("@Test TestLuxTax: " + finalluxtax1 + " = " + testtax1);
		AssertJUnit.assertEquals(finalluxtax1, testtax1);
		System.out.println("@Test TestLuxTax: " + finalluxtax2 + " = " + testtax2);
		AssertJUnit.assertEquals(finalluxtax2, testtax2);
		System.out.println("@Test TestLuxTax: " + finalluxtax3 + " = " + testtax3);
		AssertJUnit.assertEquals(finalluxtax3, testtax3);
		System.out.println("@Test TestLuxTax: " + finalluxtax4 + " = " + testtax4);
		AssertJUnit.assertEquals(finalluxtax4, testtax4);


	}
	@Test
	public void TestBasicTax()
	{
		System.out.println("@Test TestLuxTax: " + finalbtax1 + " = " + testbtax1);
		AssertJUnit.assertEquals(finalbtax1, testbtax1);
		System.out.println("@Test TestLuxTax: " + finalbtax2 + " = " + testbtax2);
		AssertJUnit.assertEquals(finalbtax2, testbtax2);
		System.out.println("@Test TestLuxTax: " + finalbtax3 + " = " + testbtax3);
		AssertJUnit.assertEquals(finalbtax3, testbtax3);
		System.out.println("@Test TestLuxTax: " + finalbtax4 + " = " + testbtax4);
		AssertJUnit.assertEquals(finalbtax4, testbtax4);
		
		
	}
	}
	
