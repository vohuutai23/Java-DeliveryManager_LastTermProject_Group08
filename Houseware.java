package mypack;

public class Houseware extends Product
{
	protected String sMaterial;
	
	//properties
	public String GetsMaterial()
	{
		return sMaterial;
	}
	public void SetsMaterial(String sMaterial)
	{
		this.sMaterial = sMaterial;
	}
	
	//constructors
	
	public Houseware()
	{
		// TODO Auto-generated constructor stub
	}
	
	public Houseware(String material,String idProduct, String productName, String origin, double price, double mass, String idStore )
	{
		super(idProduct,productName,origin,price,mass,idStore);
		this.sMaterial = material;
	}
	
	//destructors
	public void finalize()
	{
		
	}
	
	//method
	@Override
	public void ShowCharacteristics()
	{
		System.out.println("Don hang co vat dung de vo!");
	}
	public void Print() 
	{
		System.out.println(sMaterial + "  "+sIDProduct + "   " + sProductName + "   " + sOrigin + "   " + dPrice +"   "+ dMass +"   "+sIDStore);
		 // System.out.print();
	}
}
