package mypack;

public class OrderDetails {
	//fields
    public double dOrderPrice;
    public Order oOrder;
    public Product pProduct;
    public String sIDWarehouse;

    public double GetdOrderPrice()
    {
    	return dOrderPrice;
    }
    public void SetdOrderPricet(Double dOrderPrice) 
    {
		this.dOrderPrice = dOrderPrice;
	}
    public Product GetpProduct()
    {
    	return pProduct;
    }
    public void SetpProduct(Product pProduct) 
    {
		this.pProduct = pProduct;
	}
    public Order GetoOrder()
    {
    	return oOrder;
    }
    public void SetoOrder(Order oOrder) 
    {
		this.oOrder = oOrder;
	}
    public String GetsIDWarehouse()
    {
    	return sIDWarehouse;
    }
    public void SetsIDWarehouse(String sIDWarehouse) 
    {
		this.sIDWarehouse = sIDWarehouse;
	}
    
    public OrderDetails()
    {
    	
    }
    public OrderDetails(double orderPrice, Order order, Product product, String idWarehouse)
    {
        this.dOrderPrice = orderPrice;
        this.oOrder = order;
        this.pProduct = product;
        this.sIDWarehouse = idWarehouse;
    }
    public void finalaze()
    {
    	
    }
}

