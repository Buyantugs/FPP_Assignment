package assignment8;

import java.util.List;
public class Statistics {
	/** 
	 * Polymorphically computes and returns the sum
	 * of all the salaries of all the staff/teachers in the list.
	 */
	public static double computeSumOfSalaries(List<EmployeeData> aList) {
		double sumSalary=0;

		for (EmployeeData obj: aList) {
			sumSalary+=obj.getSalary();
		}
		return sumSalary;
	}
}
