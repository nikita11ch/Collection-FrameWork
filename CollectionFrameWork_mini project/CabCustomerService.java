package CollectionFrameWork_Lab;
import java.util.ArrayList;

public class CabCustomerService 
{
	private ArrayList<CabCustomer> customerList = new ArrayList<>();	
	
	public void addCabCustomer(CabCustomer customer)
	{
		customerList.add(customer);
	}
	
	public boolean isFirstCustomer(CabCustomer customer)
	{
		for(CabCustomer existingCusomer :customerList)
		{
			if(existingCusomer.getPhone().equals(customer.getPhone()))
			{
				return false;
			}
		}
		return true;
	}
	
	public float calculateBill(CabCustomer customer)
	{
		if(isFirstCustomer(customer))
		{
			return 0.0f;
		}
		else if(customer.getDistance()<=4)
		{
			return 80.0f;
		}
		else
		{
			return 80+6*customer.getDistance();
		}
	}
	
	public String printBill(CabCustomer customer)
	{
		double bill = calculateBill(customer);
        return customer.getCustomerName() + " Please pay your bill of Rs." + bill;
	}

}
