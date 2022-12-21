package mypack;


public class Receipt 
{
	
	public String sIDReceipt;
    public String sDateCreated;
    public double dDeliveryFree;
    
    public String GetsIDReceipt()
    {
    	return sIDReceipt;
    }
    public void SetsIDReceipt(String sIDReceipt) 
    {
		this.sIDReceipt = sIDReceipt;
	}
    
    public String GetsDateCreated()
    {
    	return sDateCreated;
    }
    public void SetsDateCreated(String sDateCreated) 
    {
		this.sDateCreated = sDateCreated;
	}
    
    public Double GetdDeliveryFree()
    {
    	return dDeliveryFree;
    }
    public void SetdDeliveryFree(Double dDeliveryFree) 
    {
		this.dDeliveryFree = dDeliveryFree;
	}
    
    public Receipt()
    {

    }
    public Receipt(String idReceipt, String dateCreated, double deliveryFree)
    {
        this.sIDReceipt = idReceipt;
        this.sDateCreated = dateCreated;
        this.dDeliveryFree = deliveryFree;
    }
    
    public void finalize()
    {
    	
    }
    
    //method
    public void PrintReceipt()
    {
    	System.out.println(this.sIDReceipt +"   "+this.sDateCreated+"   "+this.dDeliveryFree);
    	
    }
}
