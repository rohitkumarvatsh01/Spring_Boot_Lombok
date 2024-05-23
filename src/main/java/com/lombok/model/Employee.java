package com.lombok.model;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@Entity
public class Employee {
	
//	@Id
//	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long empid;
	private String emp_name;
	private int emp_age;
	private int emp_salary;
	private String emp_city;
}
