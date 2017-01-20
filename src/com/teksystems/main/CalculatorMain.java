package com.teksystems.main;

import java.util.Scanner;

import com.teksystems.utils.CalculatorUtils;

public class CalculatorMain {
	public static void main(String[] args){   
		 System.out.print("Enter the expression:");
		 Scanner input= new Scanner(System.in);
		 String expression = input.next();
	    try {
			System.out.println("Result of the expression is " + CalculatorUtils.evaluateExpression(expression));
		} catch (ArithmeticException e) {
			System.out.println(0);
		}
	}
}
