package mypack;

public class Order {
	//fields
	public String sIDOrder;
    public String sDeliveryAddress;
    public int iAmountofOrder;
    public String sPayment;
    public String sDeliveries;
    public String sOrderDate;
    
    public String GetsIDOrder()
    {
    	return sIDOrder;
    }
    public void SetsIDOrder(String sIDOrder) 
    {
		this.sIDOrder = sIDOrder;
	}
    
    public String GetsDeliveryAddress()
    {
    	return sDeliveries;
    }
    public void SetsDeliveryAddress(String sDeliveryAddress) 
    {
    	this.sDeliveries = sDeliveryAddress;
	}
    
    public int GetiAmountofOrder()
    {
    	return iAmountofOrder;
    }
    public void SetiAmountofOrder(int iAmountofOrder) 
    {
		this.iAmountofOrder = iAmountofOrder;
	}
    
    public String GetsDeliveries()
    {
    	return sDeliveries;
    }
    public void SetsDeliveries(String sDeliveries) 
    {
		this.sDeliveries = sDeliveries;
	}
    
    public String GetsOrderDate()
    {
    	return sOrderDate;
    }
    public void SetsPayment(String sOrderDate) 
    {
		this.sOrderDate = sOrderDate;
	}
    
    public Order()
    {
    	
    }
    public Order(String idOrder, String deliveryAddress, int amountofOrder, String payments, String deliveries, String orderDate)
    {
        this.sIDOrder = idOrder;
        this.sDeliveryAddress = deliveryAddress;
        this.iAmountofOrder = amountofOrder;
        this.sPayment = payments;
        this.sDeliveries = deliveries;
        this.sOrderDate = orderDate;
    }
    public void finalize()
    {
    	
    }
    public void PrintInformOrder()
    {
    	
    	System.out.println("The information of Order: ");
    	System.out.println("ID of Order: " + this.sIDOrder);
    	System.out.println("Delivery Address: " + this.sDeliveryAddress);
    	System.out.println("Amount of Order: " + this.iAmountofOrder);
    	System.out.println("Paymets: " + this.sPayment);
    	System.out.println("Deliveries: " + this.sDeliveries);
    	System.out.println("Order Date: " + this.sOrderDate);
    }
}

