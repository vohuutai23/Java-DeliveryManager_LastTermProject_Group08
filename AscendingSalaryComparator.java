package mypack;

import java.util.Comparator;


public class AscendingSalaryComparator implements Comparator<Employee>
{
	public int compare(Employee s1, Employee s2) {
		if (s1.Salary() == s2.Salary())
			return 0;
		else if (s1.Salary() > s2.Salary())
			return 1;
		else
			return -1;
	}

}
