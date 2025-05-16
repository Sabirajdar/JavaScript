package Array;

import java.util.Scanner;

/*

4. Sum of Elements in Array
Description: Calculate the sum of all elements in an array.


Input: [1, 2, 3, 4, 5]


Output: 15

*/
public class ElementSum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		System.out.println("Enter Element in array");
		int a[]=new int[size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
	}

}
