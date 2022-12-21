package mypack;

public class Customer implements ISearch
{
	public String sIDCustomer;
	public String sCustomerName;
	public String sCustomerAddress;
	public String sCustomerPhoneNumber;
	public int demten = 0;
	
	//properties
	public String GetsIDCustomer()
	{
		return sIDCustomer;
	}
	public void SetsIDCustomer(String sIDCustomer)
	{
		this.sIDCustomer = sIDCustomer;
	}
	
	public String GetsCustomerName()
	{
		return sCustomerName;
	}
	public void SetsCustomerName(String sCustomerName)
	{
		this.sCustomerName = sCustomerName;
	}
	
	public String GetsCustomerAddress()
	{
		return sCustomerAddress;
	}
	public void SetsCustomerAddress(String sCustomerAddress)
	{
		this.sCustomerAddress = sCustomerAddress;
	}
	
	public String GetsCustomerPhoneNumber()
	{
		return sCustomerPhoneNumber;
	}
	public void SetsCustomerPhoneNumber(String sCustomerPhoneNumber)
	{
		this.sCustomerPhoneNumber = sCustomerPhoneNumber;
	}
	
	//constructors
	
	public Customer() 
	{
		
	}
	
	public Customer(String idCustomer, String customerName, String customerAddress, String customerPhoneNumber)
	{
		this.sIDCustomer = idCustomer;
		this.sCustomerName = customerName;
		this.sCustomerAddress = customerAddress;
		this.sCustomerPhoneNumber = customerPhoneNumber;
	}
	
	//destructors
	public void finalize()
	{
		
	}
	public void Search(String customer)
	{
		if (customer.equals(sCustomerName))
		{
			demten++;
			System.out.println("ID Customer:         " + this.sIDCustomer);
			System.out.println("Customer name:       " + this.sCustomerName);
			System.out.println("Customer Address:    " + this.sCustomerAddress);
			System.out.println("Customer PhoneNumber:" + this.sCustomerPhoneNumber);
			System.out.println();
		}
	}
	//method
	public void PrintCustomer()
	{
		System.out.println(this.sIDCustomer + "  " + this.sCustomerName+"  "+this.sCustomerAddress+"  "+this.sCustomerPhoneNumber);
	}
}
