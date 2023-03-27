package com.emppojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpTestData {
   public static void main(String[] args) {
	Emp e1=new Emp();
	e1.setEmpId(1);
	e1.setEmpName("Abc");
	e1.setEmpAddress("Pune");
	System.out.println("e1===="+e1);
	
	ApplicationContext c=new ClassPathXmlApplicationContext("firstspring.xml");
	 Emp e2 = (Emp) c.getBean("emp1");
	  Emp e3 = (Emp) c.getBean("emp1");
	  System.out.println("Before Modication===");
	  System.out.println("e2===="+e2);
	  System.out.println("e3===="+e3);
	  
	  e3.setEmpAddress("Pune");
	  
	  System.out.println("After Modication===");
	  System.out.println("e2===="+e2);
	  System.out.println("e3===="+e3);
}
}
