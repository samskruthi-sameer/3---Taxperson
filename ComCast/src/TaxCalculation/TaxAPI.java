// TaxAPI has methods to calculate basic and luxury tax.

package TaxCalculation;


public class TaxAPI 
{
	
	
	private double LuxuryTax = 0.01;
	private double BasicTax = 0.09;

	 public TaxAPI() 
	 {
			
	 }
	
	
//Method to calculate luxury tax.	
	 double  CalcLuxuryTax(double price,int quantity)
	{
		 double FinalPrice;
		 
		 
		 FinalPrice = (price+(price * LuxuryTax))*quantity;
		//System.out.println(" The final price in cents is :"+FinalPrice);
		return FinalPrice;
		
		
	}
	
	
//method to calculate basic tax.
	double CalcBasicTax(double price,int quantity)
	{
		double FinalPrice;
		
		FinalPrice = (price+(price * BasicTax))*quantity;
		//System.out.println(" The final price in cents is :"+FinalPrice);
		return FinalPrice;
		
		
	}

	

}
