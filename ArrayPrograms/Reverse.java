package Array;

import java.util.*;

public class Reverse {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		int size=sc.nextInt();
		System.out.println("Enter elements");
		int arr[]=new int[size];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int mid=arr.length/2;
		int end=arr.length-1;
		for(int start=0;start<mid;start++)
		{
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			end--;
			
		}
		System.out.println("Reverse Array");
		for(int i=0;i<arr.length;i++)
		{
				System.out.println(arr[i]);
		}
	}

}
