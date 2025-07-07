package Array;

import java.util.Scanner;

/*11. Check if Array is Palindrome
Description: Check if an array is the same when reversed.


Input: [1, 2, 3, 2, 1]


Output: Palindrome
*/
public class PalindromArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Element in array");
		int a[]=new int[5];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		int b[]=new int[a.length];
		for(int i=0;i<b.length;i++)
		{
			b[i]=a[i];
		}
		
		int end=a.length-1;
		int start=0;
		//int mid=a.length/2;
		if(start<end)
		{
			int temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			start++;
			end--;
		}
		
		boolean flag=true;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=b[i])
			{
				flag=false;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Palindrom");
		}else
		{
			System.out.println("Not Palindrom");
		}
		
		
	}
	

}
