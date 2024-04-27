package CollectionFrameWork_Lab;

public class CabCustomerServiceTester 
{
	public static void main(String []args)
	{
		CabCustomerService service = new CabCustomerService();

        // Creating customers
        CabCustomer john = new CabCustomer(1, "JOHN", "Location1", "Location2", 3, "1234567890");
        CabCustomer smith = new CabCustomer(2, "SMITH", "Location3", "Location4", 6, "9876543210");

        // Adding customers to the service
        service.addCabCustomer(john);
        service.addCabCustomer(smith);

        // Printing bills
        System.out.println(service.printBill(john));
        System.out.println(service.printBill(smith));
   
		
		
	}

}
