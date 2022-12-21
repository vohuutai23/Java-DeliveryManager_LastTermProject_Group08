package mypack;

public class Store 
{
	public String sIDStore;
	public String sStoreName;
	public String sStoreAddress;
	public String sPhoneNumberofStore;
	
	//properties
	public String GetsIDStore()
	{
		return sIDStore;
	}
	public void SetsIDStore(String sIDStore)
	{
		this.sIDStore = sIDStore;
	}
	
	public String GetsStoreName()
	{
		return sStoreName;
	}
	public void SetsStoreName(String sStoreName)
	{
		this.sStoreName = sStoreName;
	}
	
	public String GetsStoreAddress()
	{
		return sStoreAddress;
	}
	public void SetsStoreAddress(String sStoreAddress)
	{
		this.sStoreAddress = sStoreAddress;
	}
	
	public String GetsPhoneNumberofStore()
	{
		return sPhoneNumberofStore;
	}
	public void SetsPhoneNumberofStore(String sPhoneNumberofStore)
	{
		this.sPhoneNumberofStore = sPhoneNumberofStore;
	}
	
	//constructors
	public Store()
	{
		
	}
	
	public Store(String idStore, String storeName, String storeAddress, String phoneNumberofStore)
	{
		this.sIDStore = idStore;
		this.sStoreName = storeName;
		this.sStoreAddress = storeAddress;
		this.sPhoneNumberofStore = phoneNumberofStore;
	}
	
	public void finalize()
	{
		
	}
	
}
