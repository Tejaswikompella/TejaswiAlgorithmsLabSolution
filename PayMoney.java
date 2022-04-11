package com.greatlearning.paymoney;

import java.util.Scanner;

public class PayMoney {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the size of transaction array:");
				
		Scanner sc = new Scanner(System.in);
				
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		System.out.println("Enter the values of array:");
		for(int i=0;i<size;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the total number of targets to be acheived:");
		
		int num = sc.nextInt();
		
		for(int i=0;i<num;i++)
		{
			System.out.println("Enter the value of target:");
			int value = sc.nextInt();
			int sum = 0;
			
			for(int j=0;j<size;j++)
			{
				sum+=arr[j];
			    if(sum>=value)
			    {
				   System.out.println("Target acheived after transaction Number :" +(j+1));
				   break;
			    }
			}
			if(sum<value)
			{
				System.out.println("Target can't be acheived");
			}
		}
		sc.close();
	}
}
		
