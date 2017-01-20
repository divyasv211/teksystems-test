package com.teksystems.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.teksystems.utils.CalculatorUtils;

public class Employee {
    private int empNum;
    private int empSal;

    public Employee(int e, int s){
        empNum = e;
        empSal = s;
    }

    public int getEmpNum(){
        return empNum;
    }

    public int getSalary(){
        return empSal;
    }

    public static void main(String[]args){
        List<Employee> employeeList= new ArrayList<Employee>();

        while (employeeList.size() < 2) {
            Scanner sc = new Scanner(System.in);
            System.out.printf("Please enter your employee number:");
            int e = sc.nextInt();
            System.out.printf("Please enter your salary:");
            int s= sc.nextInt();
            employeeList.add(new Employee(e, s));
        }
        System.out.printf("num of employees:"+ employeeList.size());
        StringBuffer salString = new StringBuffer();
        for (Employee e : employeeList) {
        	salString.append(e.getSalary());
        	salString.append('+');
        }
        salString.setLength(salString.length() -1);        
        try {
			System.out.println("Result of the expression is " + CalculatorUtils.evaluateExpression(salString.toString()));
		} catch (ArithmeticException e) {
			System.out.println(0);
		}
    }
}
