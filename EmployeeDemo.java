package com;

import java.util.ArrayList;

public class EmployeeDemo 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
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
		
		//Employee e=new  Employee(9,"vvv","Mumbai");
		
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		emp.add(e5);
		emp.add(e6);
		emp.add(e7);
		emp.add(e8);
		
		boolean find = searchEmployee(emp,e5);
		int findd = getEmployees(emp,"Mumbai");
		System.out.println(find);
		System.out.println(findd);
	}

	public static boolean searchEmployee(ArrayList<Employee> emp, Employee e)
	{
		if(e==null || emp == null)
			return false;
		else
		{
			boolean found=false;
			for(int i=0;i<emp.size();i++)
			{
				if(emp.get(i).getEmpId()==0||e.getEmpId()==0||emp.get(i)==null)
				{
					found= false;
				}
				else if(emp.get(i).getEmpId()==e.getEmpId())
				{
					found = true;
				}
			}
			return found;
		}
		
	}
	
	public static int getEmployees(ArrayList<Employee> emp, String city)
	{
		int count=0;
		for(int i=0;i<emp.size();i++)
		{
			if(emp.get(i)==null || city==null)
			{
				return 0;
			}
			else if(emp.get(i).getCity()==city)
			{
				count++;
			}
		}
		return count;
	}
	
}
