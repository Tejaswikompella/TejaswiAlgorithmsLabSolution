package com.greatlearning.sorting;

public class QuickSort {

	public void sort(int[] arr,int start,int end)
	{
		if(start<end)
		{
			int pi = partition(arr,start,end);
			sort(arr,start,pi-1);
			sort(arr,pi+1,end);
		}
	}
	
	int partition(int[] arr,int start,int end)
	{
		int pivot = arr[end];
		int p_index = start;
		
		for(int j=start;j<=end-1;j++)
		{
			if(arr[j]>=pivot)
			{
				int temp = arr[p_index];
				arr[p_index] = arr[j];
				arr[j] = temp;
				p_index++;
			}
		}
		int temp = arr[p_index];
		arr[p_index] = arr[end];
		arr[end] = temp;
		return p_index;
	}
}
