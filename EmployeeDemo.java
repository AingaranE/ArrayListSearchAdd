package com;

import java.util.ArrayList;

public class EmployeeDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> emp = new ArrayList<Employee>();
		Employee e1=new  Employee(1,"aaa","Delhi");
		Employee e2=new  Employee(2,"www","Delhi");
		Employee e3=new  Employee(3,"rrr","Delhi");
		Employee e4=new  Employee(4,"vvv","Mumbai");
		Employee e5=new  Employee(5,"jjj","Delhi");
		Employee e6=new  Employee(6,"ddd","Mumbai");
		Employee e7=new  Employee(7,"kkk","Delhi");
		Employee e8=new  Employee(8,"iii","Chennai");
		
		Employee e=new  Employee(9,"vvv","Mumbai");
		
		emp.add(emp.size(), e1);
		emp.add(emp.size(), e2);
		emp.add(emp.size(), e3);
		emp.add(emp.size(), e4);
		emp.add(emp.size(), e5);
		emp.add(emp.size(), e6);
		emp.add(emp.size(), e7);
		emp.add(emp.size(), e8);
		
		boolean find = searchEmployee(emp,e3);
		int findd = getEmployees(emp,"Chennai");
		System.out.println(find);
		System.out.println(findd);
	}

	public static boolean searchEmployee(ArrayList<Employee> emp, Employee e)
	{
		if(e==null)
			return false;
		else
		{
			boolean found=false;
			for(int i=0;i<emp.size();i++)
				if(emp.get(i).getEmpId()==e.getEmpId())
				{
					found = true;
				}
			return found;
		}
		
	}
	
	public static int getEmployees(ArrayList<Employee> emp, String city)
	{
		int count=0;
		for(int i=0;i<emp.size();i++)
			if(emp.get(i).getCity()==city)
			{
				count+=1;
			}
		return count;
	}
	
}
