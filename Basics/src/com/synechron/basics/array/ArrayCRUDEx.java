package com.synechron.basics.array;

public class ArrayCRUDEx {
	/**
	 * CRUD OPERATIONS:
	 * 
	 * C - CREATE
	 * R - READ
	 * U - UPDATE
	 * D - DELETE
	 */
	
	public static void main(String[] args) {
		EmployeeService employSer = new EmployeeService();
		
		for(int i=1; i<=20; i++) {
			
			String result = employSer.addEmployee(new Employee("ab00"+i, "Jamie", "Sandford", "Pune", 2000, "01991313013"));
			
			System.out.println(result + i);
			
		}
		
		System.out.println(employSer.deleteEmployeeById("ab005"));
		System.out.println(employSer.getEmployeeById("ab004"));
	}

}
