package day4.fileio.serialization;

import java.io.Serializable;

public class Employee implements Serializable {
	private int empNo;
	private transient String empName;	
	
	public Employee(int empNo, String empName) {
		super();
		this.empNo = empNo;
		this.empName = empName;
	}
	
	public Employee(Employee employee) {
		
		this.empNo = employee.empNo;
		this.empName = employee.empName;
	}
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", empName=" + empName + "]";
	}

	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	
	String greetEmployee()
	{
		return "Hello  "+this.empName;
	}
}
