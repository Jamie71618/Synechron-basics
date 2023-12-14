package com.synechron.basics.array;

public class EmployeeService {

	private Employee employees[] = new Employee[10];

	private static int count = -1;

	public String addEmployee(Employee e) {

		if (e != null) {
			count++;

			if (count < employees.length) {
				// add if not full
				employees[count] = e;
				return "Great Success";
			} else {
				// extend length if full
				Employee temp[] = new Employee[employees.length * 2];
				System.out.println("Size of Array increased");
				System.arraycopy(employees, 0, temp, 0, employees.length);
				/**
				 * System.arraycopy: First parameter = where you want to copy from Second param
				 * = Where to start copying from Third param = Array you want to copy too Fourth
				 * param = Where it should start populating from Fifth param = Where it should
				 * stop populating at
				 */
				employees = temp;
				employees[count] = e;
				return "Great Success";
			}
		} else {
			return "Not a valid entry!";
		}

	}

	public String deleteEmployeeById(String id) {
		for (int i = 0; i < employees.length; i++) {
			if (employees[i].getEmployeeID().equals(id)) {

				employees[i] = null;
				return "Great Success";
			}
		}
		return "Failed";
	}

	public Employee getEmployeeById(String id) {
		for (Employee employee : employees) {
			if (employee != null && employee.getEmployeeID().equals(id))
				return employee;
		}
		return null;
	}

	public Employee[] getAllEmployees() {
		return employees;
	}
	
	public Employee[] getEmployeesByName(String name) {
		Employee[] temp = new Employee[employees.length];
		int counter = -1;
		
		for(int i = 0; i < employees.length; i++) {
			if(name.equals(employees[i].getFirstName())) {
				temp[++counter] = employees[i];	
			}
		}
		return temp;
	}
	
}
