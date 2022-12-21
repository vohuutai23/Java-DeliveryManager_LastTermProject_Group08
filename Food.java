package mypack;

public class Food extends Product 
{
	protected String sDateofManufactureF;
	protected String sExpirationF;
	
	//properties
	public String GetsDateofManufactureF()
	{
		return sDateofManufactureF;
	}
	public void SetsDateofManufactureF(String sDateofManufactureF)
	{
		this.sDateofManufactureF = sDateofManufactureF;
	}
	
	public String GetsExpirationF()
	{
		return sExpirationF;
	}
	public void SetsExpirationF(String sExpirationF)
	{
		this.sExpirationF = sExpirationF;
	}
	
	//constructors

	public Food()
	{
		
	}
	
	public Food(String dateofManufactureF, String expirationF,String idProduct, String productName, String origin, double price, double mass, String idStore)
	{
		super(idProduct,productName,origin,price,mass,idStore);
		this.sDateofManufactureF = dateofManufactureF;
		this.sExpirationF = expirationF;
	}
	
	//destructors
	public void finalize()
	{
		
	}
	
	//method
	@Override
	public void ShowCharacteristics()
	{
		System.out.println("Don hang chua thuc pham de bi hu hong!");
	}
	public void Print() 
	{
		System.out.println(sDateofManufactureF + "   "+ sExpirationF +"  "+sIDProduct + "   " + sProductName + "   " + sOrigin + "   " + dPrice +"   "+ dMass +"   "+sIDStore);
	}
}
