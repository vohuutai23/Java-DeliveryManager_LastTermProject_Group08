package mypack;

public class Fashion extends Product
{
	protected double dSize;
	protected String sItemFashionColour;
	
	//properties
	public double GetdSize()
	{
		return dSize;
	}
	public void SetsSize(double dSize)
	{
		this.dSize = dSize;
	}
	
	public String GetsItemFashionColour()
	{
		return sItemFashionColour;
	}
	public void SetsItemFashionColour(String sItemFashionColour)
	{
		this.sItemFashionColour = sItemFashionColour;
	}
	
	//constructors
	public Fashion ()
	{

	}
	
	public Fashion(double size, String itemFashionColour,String idProduct, String productName, String origin, double price, double mass, String idStore )
	{
		super(idProduct,productName,origin,price,mass,idStore);
		this.dSize = size;
		this.sItemFashionColour = itemFashionColour;
	}
	
	//destructors
	public void finalize()
	{
	
	}
	
	//method
	@Override
	public void ShowCharacteristics()
	{
		System.out.println("Don hang thoi trang an toan!");
	}
	
	public void Print() 
	{
		System.out.println(dSize + "   "+ sItemFashionColour +"  "+sIDProduct + "   " + sProductName + "   " + sOrigin + "   " + dPrice +"   "+ dMass +"   "+sIDStore);
		 // System.out.print();
	}
}

