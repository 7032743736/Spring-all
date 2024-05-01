package com.Emp.Employee;

import com.Emp.Employee.interfacee.Employeinf;

public class App 
{
    public static void main( String[] args )
    {
//        EmployeeClassMethods emp=new EmployeeClassMethods();
//           emp.insert(102,"manu");
//           emp.print();
    	
//    	EmployeeConstructor emp=new EmployeeConstructor(103,"manohar","web");
//    	emp.print();
    	
//    	EmployeeSetter e=new EmployeeSetter();
//    	e.setEmpid(101);
//        e.setEmpName("manu");
//        e.setEmpAge(22);
//        e.print();
    	
//    	Employe emp =new Employe("manu",101,45000.76);
//    	 emp.print();
    	
    	Employeinf emp=new Employeinf("manu",22,4500.76);
    	  System.out.println(emp.getName()+" "+emp.getAge()+" "+emp.getSalary());
    }
}
