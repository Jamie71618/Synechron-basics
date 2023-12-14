package com.synechron.basics.array;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {
	
	private String employeeID;
	private String firstName;
	private String lastName;
	private String employeeAddress;
	private float employeeWage;
	private String employeeContractNum;

}
