package mypack;

public class SortingEmployee extends Employee
{
	 public double dWorkingTime;

     public SortingEmployee()
     {
    	 super();
     }
     public SortingEmployee(int workingTime, String idEmployee, String employeeName, double bassicSalary, String numberphoneofEmployee) 
     {
    	 super(idEmployee, employeeName, bassicSalary, numberphoneofEmployee);
         this.dWorkingTime = workingTime;
     }
     
     @Override
     public double Salary()
     {
         return this.dWorkingTime * 1000 + this.dBassicSalary;
     }

     @Override
     public void PrintInformEmployee()
     {
         super.PrintInformEmployee();
         System.out.println("Salary of this sorting employee: " + this.Salary());
     }
}

