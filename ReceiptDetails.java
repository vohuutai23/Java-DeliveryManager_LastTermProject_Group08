package mypack;

public class ReceiptDetails {
	
	public OrderDetails oOrderDetails;
    public Customer cCustomer;
    public Receipt rReceipt;
    
    public OrderDetails GetoOrderDetails()
    {
    	return oOrderDetails;
    }
    public void SetoOrderDetails(OrderDetails oOrderDetails) 
    {
		this.oOrderDetails = oOrderDetails;
	}
    
    public Customer GetcCustomer()
    {
    	return cCustomer;
    }
    public void SetcCustomer(Customer cCustomer) 
    {
		this.cCustomer = cCustomer;
	}
    
    public Receipt GetrReceipt()
    {
    	return rReceipt;
    }
    public void SetrReceipt(Receipt rReceipt) 
    {
		this.rReceipt = rReceipt;
	}
    
    public ReceiptDetails()
    {

    }
    public ReceiptDetails(OrderDetails orderDetails, Customer customer, Receipt receipt)
    {
        this.oOrderDetails = orderDetails;
        this.cCustomer = customer;
        this.rReceipt = receipt;
    }
    
    public void finalize()
    {
    	
    }
}
