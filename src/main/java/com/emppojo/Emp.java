package com.emppojo;

public class Emp {
   int empId;
   String empName;
   String empAddress;
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}

 

public String getEmpAddress() {
	return empAddress;
}
public void setEmpAddress(String empAddress) {
	this.empAddress = empAddress;
}




@Override
public String toString() {
	return "Emp [empId=" + empId + ", empName=" + empName + ", empAddress=" + empAddress + "]";
}
public Emp() {
	
}
   
}
