package mypack;

public class WareHouseManagement {
	//fields
    private String sIDWarehouse;
    public String sWarehouseName;
    private String sWarehouseAddress;
    public int iTotalEmployee;
    
    public String GetsIDWarehouse()
    {
    	return sIDWarehouse;
    }
    public void SetsIDWarehouse(String sIDWarehouse) 
    {
		this.sIDWarehouse = sIDWarehouse;
	}
    
    public String GetsWarehouseName()
    {
    	return sWarehouseName;
    }
    public void SetsWarehouseName(String sWarehouseName) 
    {
		this.sWarehouseName = sWarehouseName;
	}
    
    public String GetsWarehouseAddress()
    {
    	return sWarehouseAddress;
    }
    public void SetsWarehouseAddress(String sWarehouseAddress) 
    {
		this.sWarehouseAddress = sWarehouseAddress;
	}
    
    public int GetiTotalEmployee()
    {
    	return iTotalEmployee;
    }
    public void SetiTotalEmployee(int iTotalEmployee) 
    {
		this.iTotalEmployee = iTotalEmployee;
	}
    
    public WareHouseManagement()
    {
    	
    }
    public WareHouseManagement(String idWarehouse, String warehouseName, String warehouseAddress, int totalEmployee)
    {
        this.sIDWarehouse = idWarehouse;
        this.sWarehouseName = warehouseName;
        this.sWarehouseAddress = warehouseAddress;
        this.iTotalEmployee = totalEmployee;
    }
    public void finalize()
    {
    	
    }
    public void PrintInformWarehouse()
    {
    	System.out.println("The information of Warehouse: ");
    	System.out.println("ID of Warehouse: " + this.sIDWarehouse);
    	System.out.println("Name of Warehouse: " + this.sWarehouseName);
    	System.out.println("Warehouse Address: " + this.sWarehouseAddress);
    	System.out.println("Total Employee: " + this.iTotalEmployee);
    }
}
