package mypack;

public class Electronic extends Product 
{
	protected double dStorage;
	protected String sItemColour;
	
	//properties
	public double GetdStorage()
	{
		return dStorage;
	}
	public void SetdStorage(double dStorage)
	{
		this.dStorage = dStorage;
	}
	
	public String GetsItemColour()
	{
		return sItemColour;
	}
	public void SetsItemColour(String sItemColour)
	{
		this.sItemColour = sItemColour;
	}
	//constructors
	public Electronic() 
	{

	}
	
	public Electronic(double storage, String itemColour,String idProduct, String productName, String origin, double price, double mass, String idStore )
	{
		super(idProduct,productName,origin,price,mass,idStore);
		this.dStorage = storage;
		this.sItemColour = itemColour;		
	}
	
	//destructors
	public void finalize()
	{
		
	}
	
	//method
	@Override
	public void ShowCharacteristics()
	{
		System.out.println("Don hang co do dien tu de vo!");
	}
	public void Print() 
	{
		System.out.println(dStorage + "   "+ sItemColour +"  "+sIDProduct + "   " + sProductName + "   " + sOrigin + "   " + dPrice +"   "+ dMass +"   "+sIDStore);
		 // System.out.print();
	}
	
}