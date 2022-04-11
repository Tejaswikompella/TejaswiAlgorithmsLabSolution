package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.denominations.Min_Denom;

//import com.greatlearning.sorting.QuickSort;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the size of Currency Denominations:");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		int[] denmos = new int[size];
		System.out.println("Enter the Currency Denomination: ");
		for(int i=0;i<size;i++)
		{
			denmos[i] = sc.nextInt();
		}
		
		System.out.println("Enter the amount you want to pay:");
		int amount = sc.nextInt();
		Min_Denom ob = new Min_Denom();
		ob.compute(denmos,amount);
		sc.close();
	}
}
