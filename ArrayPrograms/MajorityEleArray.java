package Array;

import java.util.Scanner;

/* Find the Majority Element in an Array
Description: Write a program to find the element that appears more than n/2 times in the array. If no such element exists, return -1.


Input: [3, 3, 3,4, 2, 4, 4, 2, 4, 4]


Output: 4*/
public class MajorityEleArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Element in array");
		int a[]=new int[10];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					
				}
			}
			if(count>=a.length/2)
			{
				System.out.println("Majority Array: "+a[i]);
				flag=true;
				break;
			}
		}
		if(!flag)
		{
			System.out.println("-1");
		}
		
		
	}

}
