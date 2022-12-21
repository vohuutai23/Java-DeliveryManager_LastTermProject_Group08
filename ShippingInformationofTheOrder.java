package mypack;

public class ShippingInformationofTheOrder {

	public String sOrderStatus;
    public Order oOrder;
    public Shipper sShipper;
    
    public String GetsOrderStatus()
    {
    	return sOrderStatus;
    }
    public void SetsOrderStatus(String sOrderStatus) 
    {
		this.sOrderStatus = sOrderStatus;
	}
    
    public Order GetoOrder()
    {
    	return oOrder;
    }
    public void SetoOrder(Order oOrder) 
    {
		this.oOrder = oOrder;
	}
    
    public Shipper GetsShipper()
    {
    	return sShipper;
    }
    public void SetsShipper(Shipper sShipper) 
    {
		this.sShipper = sShipper;
	}
    
    public ShippingInformationofTheOrder()
    {
    	
    }
    public ShippingInformationofTheOrder(String orderStatus, Order order, Shipper shipper)
    {
        this.sOrderStatus = orderStatus;
        this.oOrder = order;
        this.sShipper = shipper;
        
    }
    
    public void finalize()
    {
    	
    }
    
    public void xuly()
    {
        if (this.sOrderStatus == "delivered")
        {
            this.sShipper.congDonhang();
        }

    }
    public void PrintInform()
    {
        System.out.println("Order Status: " + this.sOrderStatus);
        this.oOrder.PrintInformOrder();
        this.sShipper.PrintInformEmployee();
    }
}

