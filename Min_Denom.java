package com.greatlearning.denominations;

import com.greatlearning.sorting.QuickSort;

public class Min_Denom {

	public void compute(int[] arr,int amount )
	{
		//sorting the array in descending order
		
		QuickSort ob =new QuickSort();
		ob.sort(arr, 0, arr.length-1);
		
		int[] curr_notes = new int[arr.length];
		boolean flag = true;
		for (int i=0;i<arr.length;i++)
		{
			curr_notes[i] = amount / arr[i];
			amount = amount % arr[i];
		}
		if(amount % arr[arr.length-1]!=0)
		{
		  flag = false;
		}
		if(flag == true)
		{
			System.out.println("your payment approach in order to give minimum number of notes will be");
			for(int i=0;i<arr.length;i++)
			{
				if(curr_notes[i]!=0)
				{
					System.out.println(arr[i] +":"+curr_notes[i]);	
				}
		     }
		
		}else {
				System.out.println("Exact Amount cannot be tendered");
		}
	}
}
