package mypack;

public class Cosmetic extends Product
{
	protected String sDateofManufactureC;
	protected String sExpirationC;
	
	//properties
	public String GetsDateofManufactureC()
	{
		return sDateofManufactureC;
	}
	public void SetsDateofManufactureC(String sDateofManufactureC)
	{
		this.sDateofManufactureC = sDateofManufactureC;
	}
	
	public String GetsExpirationC()
	{
		return sExpirationC;
	}
	public void SetsExpirationC(String sExpirationC)
	{
		this.sExpirationC = sExpirationC;
	}
	
	//constructors

	public Cosmetic()
	{
		// TODO Auto-generated constructor stub
	}
	
	public Cosmetic(String dateofManufactureC, String expirationC,String idProduct, String productName, String origin, double price, double mass, String idStore)
	{
		super(idProduct,productName,origin,price,mass,idStore);
		this.sDateofManufactureC = dateofManufactureC;
		this.sExpirationC = expirationC;
	}
	
	//destructors
	public void finalize()
	{
		
	}
	
	//method
	@Override
	public void ShowCharacteristics()
	{
		System.out.println("Don hang my pham de vo!");
	}
	
	public void Print() 
	{
		System.out.println(sDateofManufactureC + "   "+ sExpirationC +"  "+sIDProduct + "   " + sProductName + "   " + sOrigin + "   " + dPrice +"   "+ dMass +"   "+sIDStore);
		 // System.out.print();
	}
}
