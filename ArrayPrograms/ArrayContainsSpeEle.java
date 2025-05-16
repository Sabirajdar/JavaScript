package Array;

import java.util.Scanner;

/*18. Check if Array Contains a Specific Element
Description: Check if a specific element exists in an array.


Input: [1, 2, 3, 4], element 3


Output: Found
*/
public class ArrayContainsSpeEle {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Element in array");
		int a[]=new int[4];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter target");
		int target=sc.nextInt();
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==target)
			{
				System.out.println("Found");
				flag=true;
			}
		}
		if(!flag)
		{
			System.out.println("Not Found");
		}
	}

}
