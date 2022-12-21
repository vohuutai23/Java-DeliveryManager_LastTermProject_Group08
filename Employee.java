package mypack;

public abstract class Employee  implements ISearch
{
	//fields
    public String sIDEmployee;
    public String sEmployeeName;
    public double dBassicSalary;
    public String sNumberphoneofEmployee;
    public int iSearch = 0;
    
    public String GetsIDEmployee()
    {
    	return sIDEmployee;
    }
    public void SetsIDEmployee(String sIDEmployee) 
    {
		this.sIDEmployee = sIDEmployee;
	}
    
    public String GetsEmployeeName()
    {
    	return sEmployeeName;
    }
    public void SetsEmployeeName(String sEmployeeName) 
    {
		this.sEmployeeName = sEmployeeName;
	}
    
    public Double GetdBassicSalary()
    {
    	return dBassicSalary;
    }
    public void SetdBassicSalary(Double dBassicSalary) 
    {
		this.dBassicSalary = dBassicSalary;
	}
    
    public String GetsNumberphoneofEmployee()
    {
    	return sNumberphoneofEmployee;
    }
    public void SetsNumberphoneofEmployee(String sNumberphoneofEmployee) 
    {
		this.sNumberphoneofEmployee = sNumberphoneofEmployee;
	}
    
  //constructors
    public Employee()
    {

    }

    public Employee(String idEmployee, String employeeName, double bassicSalary, String numberphoneofEmployee)
    {
        this.sIDEmployee = idEmployee;
        this.sEmployeeName = employeeName;
        this.dBassicSalary = bassicSalary;
        this.sNumberphoneofEmployee = numberphoneofEmployee;
    }
    public void finalize()
    {
    	
    }
    
    public abstract double Salary();

   
    public void PrintInformEmployee()
    {
    	System.out.println();
    	System.out.println("ID of Employee: " + this.sIDEmployee);
    	System.out.println("Name of Employee: " + this.sEmployeeName);
    	System.out.println("Bassic Salary: " + this.dBassicSalary);
    	System.out.println("Phone Number of Employee: " + this.sNumberphoneofEmployee);

    }
    public void Search(String employee)
    {

        if (employee.equals(sEmployeeName))
        {
            iSearch++;
            PrintInformEmployee();
        }
    }

}
