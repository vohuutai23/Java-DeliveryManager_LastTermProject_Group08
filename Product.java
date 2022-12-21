package mypack;

public class Product implements IPrint
{
	//fields
	public String sIDProduct;
	public String sProductName;
	public String sOrigin;
	public double dPrice;
	public double dMass;
	public String sIDStore;
	
	//properties
	public String GetsIDProduct()
	{
		return sIDProduct;
	}
	public void SetsIDProduct(String sIDProduct)
	{
		this.sIDProduct = sIDProduct;
	}
	
	
	public String GetsProductName()
	{
		return sProductName;
	}
	public void SetsProductName(String sProductName)
	{
		this.sProductName = sProductName;
	}
	
	public String GetsOrigin()
	{
		return sOrigin;
	}
	public void SetsOrigin(String sOrigin)
	{
		this.sOrigin = sOrigin;
	}
	
	public double GetdPrice()
	{
		return dPrice;
	}
	public void SetdPrice(double dPrice)
	{
		this.dPrice = dPrice;
	}
	
	public double GetdMass()
	{
		return dMass;
	}
	public void SetdMass(double dMass)
	{
		this.dMass = dMass;
	}
	
	public String GetsIDStore()
	{
		return sIDStore;
	}
	public void SetsIDStore(String sIDStore)
	{
		this.sIDStore = sIDStore;
	}
	//constructors
	public Product()
	{
		
	}
	public Product(String idProduct, String productName, String origin, double price, double mass, String idStore) 
	{
		this.sIDProduct = idProduct;
		this.sProductName = productName;
		this.sOrigin = origin;
		this.dPrice = price;
		this.dMass = mass;
		this.sIDStore = idStore;
	}

	//destructors
	public void finalize()
	{
		
	}
	

	public void ShowCharacteristics()
	{
		System.out.println("Tinh chat don hang: ");
	}
	public void Print()
	{
		
	}

}
