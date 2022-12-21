package mypack;

public class Shipper extends Employee
{
	public int iNumberOfOrdersDelivered;

    public Shipper() 
    {
    	super();
    }
    public Shipper(int numberOfOrdersDelivered, String idEmployee, String employeeName, double bassicSalary, String numberphoneofEmployee) 
    
    {
    	super(idEmployee, employeeName, bassicSalary, numberphoneofEmployee);
        this.iNumberOfOrdersDelivered = numberOfOrdersDelivered;
        this.iNumberOfOrdersDelivered = 0;
    }
    public void congDonhang()
    {
        this.iNumberOfOrdersDelivered = this.iNumberOfOrdersDelivered + 1;
    }
    @Override
	public double Salary()
    {
        return this.iNumberOfOrdersDelivered * 3000 + this.dBassicSalary;
    }

    @Override
    public void PrintInformEmployee()
    {
        super.PrintInformEmployee();
        System.out.println("Salary of this shipper:          " + this.Salary());
        System.out.println("Amount of order deliveried:      " + this.iNumberOfOrdersDelivered);
    }
	
}


