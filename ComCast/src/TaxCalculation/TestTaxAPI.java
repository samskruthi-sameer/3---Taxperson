

package TaxCalculation;


public class TestTaxAPI 
{

	public static void main(String[] args) 
	{
		double FinalPrice = 0;
		
		
		System.out.println("Welcome to Sales Tax Calculator\n");
		System.out.println(" Tax rate for Luxury item is 9 % and Basic item is 1%\n");
		TransactionAPI  Transac = new TransactionAPI();
		TaxAPI Taxper = new TaxAPI();
		Transac.UserTransaction();
		//Check if the item type is luxury item and call its method.
		if (Transac.getItemType() == TransactionAPI.ItemType.LuxuryItem)
		{
			FinalPrice = Taxper.CalcLuxuryTax(Transac.getPrice(), Transac.getQuantity());
			
		}
		//Check if the item type is basic item and call its method.
		else if (Transac.getItemType() == TransactionAPI.ItemType.BasicItem)
		{
			FinalPrice = Taxper.CalcBasicTax(Transac.getPrice(), Transac.getQuantity());
		}
		System.out.print("The final price of the  items in cents : "+FinalPrice);
	}

}
